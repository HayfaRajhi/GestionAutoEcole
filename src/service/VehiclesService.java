package service;

import entities.Vehicle;
import sortie.SortieVehicles;

public class VehiclesService {
    Vehicle[] vehicles = new Vehicle[100];

    public void ajouterVehicle(Vehicle c) {
        for (int i = 0; i < vehicles.length; i++) {
            if(vehicles[i] == null) {
                vehicles[i] = c;
                break;
            }

        }
    }

    public void afficherVehicles() {
        SortieVehicles.displayAll(vehicles);
    }

    public void afficherVehicle(Vehicle vehicle) {
        if(vehicle != null){
            SortieVehicles.displayOne(vehicle);
        }else {
            SortieVehicles.VehicleNotFound();
        }
    }

    public Vehicle rechercherVehicle(int num) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getRegistrationNumber() == num) {
                return vehicle;
            }
        }
        return null;
    }

    public void modifierVehicle(int numCIN) {
        Vehicle condidate = rechercherVehicle(numCIN);

    }
}
