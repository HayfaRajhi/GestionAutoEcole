package ihm;

import entities.Candidate;
import java.util.Scanner;

public class IHMCandidate {

    public static Candidate saisirCandidate() {

        String name = saisirName();
        String prenom  = saisirPrename();
        int cin  = saisirCin();
        String license  = saisirCategory();

        return (new Candidate(cin,license,name, prenom));

    }

    public static int saisirChoice(int min,int max) {
        int demand;

        do{
            System.out.println("Enter Your Menu Choice");
            demand = (new Scanner(System.in)).nextInt();
        } while(min > demand || demand > max);

        return demand;
    }

    public static int saisirCin(){
        System.out.println("Enter the Cin : ");
        int demand;

        do{
            System.out.println("Cin must be 8 digits");
            demand = (new Scanner(System.in)).nextInt();
        } while(String.valueOf(demand).length() != 8);

        return demand;
    }

    public static String saisirName(){
        System.out.println("Enter the name");
        return (new Scanner(System.in)).nextLine();
    }

    public static String saisirPrename(){
        System.out.println("Enter the prename");
        return (new Scanner(System.in)).nextLine();
    }

    public static String saisirCategory(){

        System.out.println("Enter the category : \n 1.) A : Moto \n 2.) B : Car \n 3.) C : Camion \n");
        return switch (saisirChoice(0,4)) {
            case 1 -> "A";
            case 2 -> "B";
            case 3 -> "C";
            default -> saisirCategory();
        };
    }

}
