package controllers;

import entities.Candidate;
import ihm.IHMCandidate;
import service.CandidatesService;
import sortie.SortieCandidates;

public class CandidatesController {
    CandidatesService candidateService;

    public void init() {
        candidateService = new CandidatesService();
        menu();
    }

    public void menu(){

        while(true){
            System.out.println("Candidate Main Menu\n");
            System.out.print("1.) Show Candidates List \n");
            System.out.print("2.) Find Candidate.\n");
            System.out.print("3.) Add Candidate.\n");
            System.out.print("4.) Edit Candidate.\n");
            System.out.print("5.) Delete Candidate.\n");
            System.out.print("6.) Exit.\n");

            switch (IHMCandidate.saisirChoice(0,7)) {
                case 1 -> candidateService.showCandidates();
                case 2 -> findCondidate();
                case 3 -> addCondidate();
                case 4 -> editCondidate();
                case 5 -> deleteCondidate();
                case 6 -> {
                    System.out.println("Exiting Program...");
                    System.exit(0);
                }
                default -> System.out.println("This is not a valid Menu Option! Please Select Another");
            }
        }
    }

    public void addCondidate(){
        Candidate c = IHMCandidate.saisirCandidate();
        candidateService.addCandidate(c);
        candidateService.showCandidates();
    }

    public void editCondidate(){
        Candidate c = candidateService.findCandidate(IHMCandidate.saisirCin());
        if(c != null){
            SortieCandidates.editCondidateMenu();
            int oldCin = c.getNumCIN();
            switch (IHMCandidate.saisirChoice(0,6)) {
                case 1 -> c.setName(IHMCandidate.saisirName());
                case 2 -> c.setPrename(IHMCandidate.saisirPrename());
                case 3 -> c.setLicenseCategory(IHMCandidate.saisirCategory());
                case 4 -> c.setNumCIN(IHMCandidate.saisirCin());
                case 5 -> menu();
            }
            candidateService.updateCandidate(oldCin,c);
        }else {
            SortieCandidates.condidateMenuNotFound();
            switch (IHMCandidate.saisirChoice(0,3)) {
                case 1 -> editCondidate();
                case 2 -> menu();
            }
        }
    }

    public void deleteCondidate(){
        Candidate c = candidateService.findCandidate(IHMCandidate.saisirCin());
        if(c != null){
            SortieCandidates.deleteCondidateMenu();
            switch (IHMCandidate.saisirChoice(0,6)) {
                case 1 -> candidateService.deleteCandidate(c);
                case 2 -> menu();
            }
        }else {
            SortieCandidates.condidateMenuNotFound();
            switch (IHMCandidate.saisirChoice(0,3)) {
                case 1 -> editCondidate();
                case 2 -> menu();
            }
        }
    }

    public void findCondidate(){
        candidateService.findCandidate(IHMCandidate.saisirCin());
    }
}
