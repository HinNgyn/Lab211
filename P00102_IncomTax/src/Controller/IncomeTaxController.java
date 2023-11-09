/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Validation;
import Model.Children;
import Model.Parent;
import Model.Person;
import java.util.ArrayList;
import java.util.List;
import repository.IncomeTaxRepository;

/**
 *
 * @author ASUS
 */
public class IncomeTaxController {
    Validation valid;
    Person person;
    List<Children> childrens;
    List<Parent> parents;
    IncomeTaxRepository repo;

    public IncomeTaxController(){
        valid = new Validation();
        person =  new Person();
        childrens = new ArrayList<>();
        parents = new ArrayList<>();
        repo = new IncomeTaxRepository();
    }
    
    public void run(){
        System.out.println("========Income Tax Program=========");
        repo.inputData(person, childrens, parents);
        repo.detailOfDeduction(person, childrens, parents);
    }
}
