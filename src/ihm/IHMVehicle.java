package ihm;

import entities.Vehicle;
import java.util.Scanner;

public class IHMVehicle {

    public static Vehicle saisirVehicle() {

        Scanner sc = new Scanner(System.in);

        String type = saisirEditType();

        System.out.println("Donner dateOfCommissioning");
        String dateOfCommissioning  = sc.nextLine();

        System.out.println("Donner registration Number");
        int registrationNumber  = sc.nextInt();

        System.out.println("Donner num Of Km Left");
        int numOfKmLeft  = sc.nextInt();

        System.out.println("Donner total km");
        int totalKm  = sc.nextInt();

        return (new Vehicle(registrationNumber, dateOfCommissioning, totalKm, type, numOfKmLeft));
    }

    public static int saisirRegNum() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Donner registration Number");
        return sc.nextInt();

    }

    public static int saisirChoice() {
        int demand;

        do{
            System.out.println("what do you want to modify ? \n 1 :registration Number \n 2 :num Of Km Left \n 3 :total km \n 4 :dateOfCommissioning \n 5 :type");
            demand = (new Scanner(System.in)).nextInt();
        } while(0 > demand || demand > 6);

        return demand;
    }

    public static int saisirEditRegistrationNumber(){
        System.out.println("Enter Registration Number");
        return (new Scanner(System.in)).nextInt();
    }

    public static int saisirEditNumOfKmLeft(){
        System.out.println("Enter the num Of Km Left");
        return (new Scanner(System.in)).nextInt();
    }

    public static String saisirEditDateOfCommissioning(){
        System.out.println("Enter Date Of Commissioning");
        return (new Scanner(System.in)).nextLine();
    }

    public static int saisirEditTotalKm(){
        System.out.println("Enter Total Km");
        return (new Scanner(System.in)).nextInt();
    }

    public static String saisirEditType(){

        int demand;
        String type;
        do{
            System.out.println("Donner le type : \n 1 :car \n 2 :motorbike \n 3 :camion ");
            demand = (new Scanner(System.in)).nextInt();
        } while(0 > demand || demand > 4);

        type = switch (demand) {
            case 1 -> "car";
            case 2 ->  "motorbike";
            default -> "camion";
        };
        return type;
    }

}
