package sortie;

import entities.Vehicle;

public class SortieVehicles {
    public static void displayAll(Vehicle[] vehicles) {
       // System.out.format("%32s%32s%32s%32s", "nom", "prenom", "cin","licence");

        for(Vehicle c : vehicles) {
            if (c != null)
                displayOne(c);
        }

    }

    public static void displayOne(Vehicle c) {
        System.out.println("Affichage Mizyen mta3 Personne " + c);
    }

    public static void VehicleNotFound() {
        System.out.println("Vehicle Not Found");
    }
}
