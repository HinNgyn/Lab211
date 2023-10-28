package repository;

import model.Truck;

public interface IHouseholdRepository {

    void calculateCost(Truck truck);

    void calculateTime(Truck truck);

    void printEstimateCost(Truck truck);
    
}