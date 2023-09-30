
package View;

import Controller.EquationManagement;

public class Main {
    public static void main(String[] args) {
        String title = "=============== Equation program ================";
        String[] s = new String[]{"Calculate Superlative Equation", "Calculate Quadratic Equation","Exit"};
        EquationManagement manage = new EquationManagement(title, s);
        manage.run();
    }
}
