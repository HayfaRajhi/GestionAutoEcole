package sortie;

import entities.Candidate;
import ihm.Log;

import java.util.List;

public class SortieCandidates {
    private static final String sep = "-----------------";
    public static void displayAll(List<Candidate> candidates) {
        System.out.format("-%-16s%-16s%-8s%-16s%n",sep,sep,sep,sep);
        System.out.format("| %-16s| %-16s| %-12s| %-16s|%n", "Nom", "Prenom", "Cin","Licence");
        System.out.format("-%-16s%-16s%-8s%-16s%n",sep,sep,sep,sep);
        for(Candidate c : candidates) {
            if (c != null)
                displayOne(c);
        }

    }

    public static void displayOne(Candidate c) {
        System.out.format("| %-16s| %-16s| %-12d| %-16s|%n",c.getName() , c.getPrename(), c.getNumCIN(),c.getLicenseCategory());
        System.out.format("-%-16s%-16s%-8s%-16s%n",sep,sep,sep,sep);
    }

    public static void CandidateFound(Candidate c) {
        Log.i("Success: Candidate found :");
        System.out.format("-%-16s%-16s%-8s%-16s%n",sep,sep,sep,sep);
        displayOne(c);
    }


    public static void CandidateNotFound(){
        Log.e("Error: Candidate Not Found.");
    }


    public static void editCondidateMenu(){
        System.out.println("What do you want to edit ?\n");
        System.out.print("1.) Name.\n");
        System.out.print("2.) Prename.\n");
        System.out.print("3.) Licence.\n");
        System.out.print("4.) CIN.\n");
        System.out.print("5.) Cancel.\n");
    }

    public static void condidateMenuNotFound(){
        System.out.println("Do you want to retry ?\n");
        System.out.print("1.) Yes.\n");
        System.out.print("2.) No.\n");
    }

    public static void deleteCondidateMenu() {
        System.out.println("Do you want to delete candidate ?\n");
        System.out.print("1.) Confirm.\n");
        System.out.print("2.) Cancel.\n");
    }
}
