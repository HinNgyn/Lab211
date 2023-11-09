/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import Model.Children;
import Model.Parent;
import Model.Person;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface IIncomeTaxRepository {

    void detailOfDeduction(Person person, List<Children> childrens, List<Parent> parents);

    void inputData(Person person, List<Children> childrens, List<Parent> parents);
    
}

