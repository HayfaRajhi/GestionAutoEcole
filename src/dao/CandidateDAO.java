package dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import entities.Candidate;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class CandidateDAO {

    //private static final List<Candidate> candidates = new ArrayList<Candidate>();
    private List<Candidate> candidates = new ArrayList<>();
    private final File file = new File("src/data/candidate.json");

    public CandidateDAO(){
        try {
            if (!file.exists()){
                file.createNewFile();
            }
            try {
                JSONParser jsonP = new JSONParser();
                JSONArray jArray = (JSONArray) jsonP.parse(new FileReader("src/data/candidate.json"));
                candidates = new Gson().fromJson(jArray.toJSONString(), new TypeToken<List<Candidate>>(){}.getType());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erreur: impossible de créer le fichier candidate.json ");
        }
    }

    public void jsonSync(){
        try (FileWriter writer = new FileWriter(file)) {

            writer.write(new Gson().toJson(candidates));
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save(Candidate candidate) {
        candidates.add(candidate);
        jsonSync();
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public Candidate find(int numCIN){
        for (Candidate candidate : candidates) {
            if (candidate.getNumCIN() == numCIN) {
                return candidate;
            }
        }
        return null;
    }

    public int findPosition(int numCIN) {
        for (int i = 0, candidatesSize = candidates.size(); i < candidatesSize; i++) {
            Candidate c = candidates.get(i);
            if (c.getNumCIN() == numCIN)
                return i;

        }
        return -1;
    }

    public void update(int numCIN, Candidate candidate){
        int p = findPosition(numCIN);
        if( p != -1 ){
            candidates.remove(p);
            candidates.add(p,candidate);
            jsonSync();
        }
    }

    public void delete(Candidate candidate) {
        //int p = findPosition(candidate.getNumCIN());
        //if( p != -1 ){
            candidates.remove(candidate);
            jsonSync();
       // }
    }
}
