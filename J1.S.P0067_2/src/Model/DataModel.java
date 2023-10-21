package Model;

import java.util.ArrayList;
import java.util.List;

public class DataModel {

    private List<Integer> perfectSquareNumbers = new ArrayList<>();
    private List<Integer> oddNumbers = new ArrayList<>();
    private List<Integer> evenNumbers = new ArrayList<>();
    private List<Integer> allNumbers = new ArrayList<>();

    private List<Character> lowercaseCharacters = new ArrayList<>();
    private List<Character> uppercaseCharacters = new ArrayList<>();
    private List<Character> specialCharacters = new ArrayList<>();
    private List<Character> allCharacters = new ArrayList<>();

    public DataModel(String inputString) {
        analyzeNumbers(inputString);
        analyzeCharacters(inputString);
    }

    private void analyzeNumbers(String inputString) {
        String number = inputString.replaceAll("\\D+", ",");
        if (!number.isEmpty()) {
            if (number.startsWith(",")) {
                number = number.substring(1);
            }
            if (number.endsWith(",")) {
                number = number.substring(0, number.length() - 1);
            }
            String[] listNumber = number.split(",");
            for (String numStr : listNumber) {
                int numberCheck = Integer.parseInt(numStr);
                if (numberCheck % 2 == 1) {
                    oddNumbers.add(numberCheck);
                } else {
                    evenNumbers.add(numberCheck);
                }
                if (checkSquareNumber(numberCheck)) {
                    perfectSquareNumbers.add(numberCheck);
                }
                allNumbers.add(numberCheck);
            }
        }
    }

    private void analyzeCharacters(String inputString) {
        for (char c : inputString.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseCharacters.add(c);
            } else if (Character.isLowerCase(c)) {
                lowercaseCharacters.add(c);
            } else if (!Character.isLetterOrDigit(c)) {
                specialCharacters.add(c);
            }
            allCharacters.add(c);
        }
    }

    private boolean checkSquareNumber(int n) {
        return Math.sqrt(n) * Math.sqrt(n) == n;
    }

    public List<Integer> getPerfectSquareNumbers() {
        return perfectSquareNumbers;
    }

    public List<Integer> getOddNumbers() {
        return oddNumbers;
    }

    public List<Integer> getEvenNumbers() {
        return evenNumbers;
    }

    public List<Integer> getAllNumbers() {
        return allNumbers;
    }

    public List<Character> getLowercaseCharacters() {
        return lowercaseCharacters;
    }

    public List<Character> getUppercaseCharacters() {
        return uppercaseCharacters;
    }

    public List<Character> getSpecialCharacters() {
        return specialCharacters;
    }

    public List<Character> getAllCharacters() {
        return allCharacters;
    }
}
