package Controller;

import Common.Validation;
import model.InputData;
import reponsitory.InputDataRepository;

public class InputDataController {
    Validation valid;
    InputDataRepository repo;
    InputData data;
    
    public InputDataController(){
        valid = new Validation();
        repo = new InputDataRepository();
        data = new InputData();
    }
    
    public void run(){
        System.out.println("===== Analysis String program ====");
        String s = valid.inputString("Input String");
        System.out.println("-----Result Analysis------");
        repo.getNumber(s, data);
        repo.getCharacter(s, data);
    }
}
