/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAccess.DataCopyDao;
import Model.FileData;

/**
 *
 * @author ASUS
 */
public class DataCopyRepository implements IDataCopyRepository{

    @Override
     public void dataCopy(FileData data) {
        DataCopyDao.Instance().dataCopy(data);
    }
}
