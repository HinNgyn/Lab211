package Controller;

import Model.DataModel;
import View.View;

public class Controller {
    private DataModel model;
    private View view;

    public Controller(DataModel model, View view) {
        this.model = model;
        this.view = view;
        
    }

       public void processInput(String inputString) {
           System.out.print("");
        if (inputString.isEmpty()) {
            System.out.println("Input string is empty.");
            return;
        }
        // Analyze the input string
        model = new DataModel(inputString);
        // Call the view to display the result
        view.printResult(model);
    }
}

