package service;
import dao.CandidateDAO;
import entities.Candidate;
import sortie.SortieCandidates;

public class CandidatesService {

    private final CandidateDAO candidateDAO = new CandidateDAO();

    public void addCandidate(Candidate c) {
        candidateDAO.save(c);
    }

    public void showCandidates() {
        SortieCandidates.displayAll(candidateDAO.getCandidates());
    }

    public void showCandidate(Candidate candidate) {
        if(candidate != null){
            SortieCandidates.CandidateFound(candidate);
        }else {
            SortieCandidates.CandidateNotFound();
        }
    }

    public Candidate findCandidate(int numCIN) {
        Candidate condidate = candidateDAO.find(numCIN);
        showCandidate(condidate);
        return condidate;
    }

    public void updateCandidate(int numCIN,Candidate c) {
        candidateDAO.update(numCIN,c);
        showCandidates();
    }

    public void deleteCandidate(Candidate c) {
        candidateDAO.delete(c);
        showCandidates();
    }
}
