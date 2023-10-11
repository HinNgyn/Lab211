package View;

import Controller.Manager;
import Model.History;
import Model.Worker;
import java.util.ArrayList;

public class Menu {
    public void realMenu() {
        ArrayList<Worker> lw = new ArrayList<>();
        ArrayList<History> lh = new ArrayList<>();
        Manager mn  = new Manager();
        //loop until user want to exit
        while (true) {
            int choice = mn.menuNe();
            switch (choice) {
                case 1:
                    mn.addWorker(lw);
                    break;
                case 2:
                    mn.changeSalary(lw, lh, 1);
                    break;
                case 3:
                    mn.changeSalary(lw, lh, 2);
                    break;
                case 4:
                    mn.printListHistory(lh);
                    break;
                case 5:
                    break;
            }
        }
    }
}
