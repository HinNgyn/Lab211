package view;

import manager.Manager;
import manager.Validation;

public class Menu {

    public void Menu() {
        Manager mn = new Manager();
        //loop until user want to exit
        while (true) {
            int choice = menu();
            switch (choice) {
                case 1:
                    mn.findPersonInfo();
                    break;
                case 2:
                    mn.copyWordOneTimes();
                    break;
                case 3:
                    return;
            }
        }
    }
    //display menu
    public int menu() {
        Validation validation = new Validation();
        System.out.println("1. Find person info.");
        System.out.println("2. Copy Text to new file.");
        System.out.println("3. Exit.");
        System.out.print("Enter your choice: ");
        int choice = validation.checkInputIntLimit(1, 3);
        return choice;
    }
}
