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
//    public void processInput(String inputString) {
//        if (!inputString.isEmpty()) {
//            // Analyze the input string
//            HashMap<String, ArrayList<Integer>> numberData = new HashMap<>();
//            HashMap<String, String> characterData = new HashMap<>();
//
//            model = new DataModel(inputString);
//
//            // Number analysis
//            numberData.put("Perfect Square Numbers: ", model.getPerfectSquareNumbers());
//            numberData.put("Odd Numbers: ", model.getOddNumbers());
//            numberData.put("Even Numbers: ", model.getEvenNumbers());
//            numberData.put("All Numbers: ", model.getAllNumbers());
//
//            // Character analysis
//            characterData.put("Uppercase Characters: ", model.getUppercaseCharacters());
//            characterData.put("Lowercase Characters: ", model.getLowercaseCharacters());
//            characterData.put("Special Characters: ", model.getSpecialCharacters());
//            characterData.put("All Characters: ", model.getAllCharacters());
//
//            // Call the view to display the result
//            view.printResult(numberData, characterData);
//        } else {
//            System.out.println("Input string is empty.");
//        }
//    }
//}

