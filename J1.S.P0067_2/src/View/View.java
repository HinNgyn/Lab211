package View;

import Model.DataModel;
import java.util.List;

public class View {

public void printResult(DataModel model) {
    System.out.println(" -----Result Analysis-----");
    
    printCategory("Perfect Square Numbers: ", model.getPerfectSquareNumbers());
    printCategory("Odd Numbers: ", model.getOddNumbers());
    printCategory("Even Numbers: ", model.getEvenNumbers());
    printCategory("All Numbers: ", model.getAllNumbers());
    printCategory("Uppercase Characters: ", model.getUppercaseCharacters());
    printCategory("Lowercase Characters: ", model.getLowercaseCharacters());
    printCategory("Special Characters: ", model.getSpecialCharacters());
    printCategoryAllCharacters("All Characters: ", model.getAllCharacters());
}

private <T> void printCategory(String category, List<T> data) {
    System.out.print(category);
    for (T item : data) {
        System.out.print(item);
    }
    System.out.println();
}

private void printCategoryAllCharacters(String category, List<Character> data) {
    System.out.print(category);
    for (Character c : data) {
        if (Character.isLetter(c)) {
            System.out.print(c);
        }
    }
    System.out.println();
}


}
