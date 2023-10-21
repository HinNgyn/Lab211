package reponsitory;

import dataAccess.InputDataDao;
import model.InputData;

public class InputDataRepository implements IInputDataRepository{

    @Override
    public void getNumber(String s, InputData data) {
        InputDataDao.Instance().getNumber(s, data);
    }

    @Override
    public void getCharacter(String s, InputData data) {
        InputDataDao.Instance().getCharacter(s, data);
    }
    
}
