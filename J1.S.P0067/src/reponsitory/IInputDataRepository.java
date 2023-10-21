package reponsitory;

import model.InputData;


public interface IInputDataRepository {

    void getCharacter(String s, InputData data);

    void getNumber(String s, InputData data);
    
}
