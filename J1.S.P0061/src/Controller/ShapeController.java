/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import repository.ShapeRepository;
import view.Menu;

/**
 *
 * @author ASUS
 */
public class ShapeController extends Menu{
    ShapeRepository repo;
    
    public ShapeController(){
        repo = new ShapeRepository();
    }

    @Override
    public void execute() {
        repo.calculate();
    }
    
}
