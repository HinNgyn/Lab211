package Controller;

import Model.Manager;
import View.Menu;


public class EquationManagement extends Menu{

    public EquationManagement() {
    }

    public EquationManagement(String title, String[] s) {
        super(title, s);
    }
    
    @Override
    public void execute(int choice) {
        Manager mn = new Manager();
        switch (choice) {
            case 1:
                mn.superlativeEquation();
                break;
            case 2:
                mn.quadraticEquation();
                break;
            case 3: 
                System.out.println("Exited");
                return;
            default:
                System.err.println("Choose 1-3");
        }
    } 
}
