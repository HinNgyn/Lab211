package Model;

import java.util.Scanner;

public class Manager {
    //real menu
    public void realMenu(){
        ClassModel clModel = new ClassModel();
         //loop until user want to exit
        while (true) {
            int choice = mennu();
            switch (choice) {
                case 1:
                    clModel.normalCalculator();
                    break;
                case 2:
                    clModel.BMICalculator();
                    break;
                case 3:
                    return;
            }
        }
    }

    //display menu
    public int mennu() {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = checkInputIntLimit(1, 3);
        return choice;
    }

    //check user input number limit
    public int checkInputIntLimit(int min, int max) {
        Scanner in = new Scanner(System.in);
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }




}
