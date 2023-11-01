/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.FileData;
import Repository.DataCopyRepository;

/**
 *
 * @author ASUS
 */
public class DataCopyController {

    protected DataCopyRepository repo;
    protected FileData data;

    public DataCopyController() {
        repo = new DataCopyRepository();
        data = new FileData();
    }

    public void run() {
        repo.dataCopy(data);
    }

}