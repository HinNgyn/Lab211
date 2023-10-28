package controller;


import common.Validation;
import model.Truck;
import repository.HouseholdRepository;


public class HouseholdController {
    Validation valid;
    HouseholdRepository repo;
    Truck truck;
    
    public HouseholdController(){
        valid = new Validation();
        repo = new HouseholdRepository();
        truck = new Truck();
    }
    
    public void run(){
        System.out.println("===== Collecting Household Waste ====");
        repo.calculateTime(truck);
        repo.calculateCost(truck);
        repo.printEstimateCost(truck);
    }
}