package controllers;

import entities.Candidate;
import entities.Vehicle;
import ihm.IHMCandidate;
import ihm.IHMVehicle;
import service.VehiclesService;

public class VehiclesController {
    VehiclesService vService;

    public void init() {
        vService = new VehiclesService();
    }

    public void addVehicle(){
        Vehicle c = IHMVehicle.saisirVehicle();
        vService.ajouterVehicle(c);
    }

    public void editVehicle(){
        Vehicle v = vService.rechercherVehicle(IHMVehicle.saisirRegNum());
        if(v != null){
            switch (IHMVehicle.saisirChoice()) {
                case 1 -> v.setRegistrationNumber(IHMVehicle.saisirEditRegistrationNumber());
                case 2 -> v.setNumOfKmLeft(IHMVehicle.saisirEditRegistrationNumber());
                case 3 -> v.setTotalMileage(IHMVehicle.saisirEditTotalKm());
                case 4 -> v.setDateOfCommissioning(IHMVehicle.saisirEditDateOfCommissioning());
                case 5 -> v.setType(IHMVehicle.saisirEditType());
            }
        }
    }

    public void deleteVehicle(){

    }

    public void findVehicle(){
        Vehicle v = vService.rechercherVehicle(IHMVehicle.saisirRegNum());
        vService.afficherVehicle(v);
    }
}
