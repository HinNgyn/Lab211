package Controller;

import Model.History;
import Model.Worker;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class Manager {
    Validate vali = new Validate();


    //show menu
    public int menuNe() {
        System.out.println("1. Add worker.");
        System.out.println("2. Increase salary for worker.");
        System.out.println("3. Decrease for worker");
        System.out.println("4. Show adjusted salary worker information");
        System.out.println("5. Exist");
        System.out.print("Enter your choice: ");
        int choice = vali.checkInputIntLimit(1, 5);
        return choice;
    }

    //allow user add worker
    public void addWorker(ArrayList<Worker> lw) {
        System.out.print("Enter code: ");
        String id = vali.checkInputString();
        while (true) {
            id = vali.checkInputString();

            // Validate if the ID is numeric and has a length between 1 and 2 digits
            if (!id.matches("\\d{1,2}")) {
                System.err.println("Invalid ID. Please enter a numeric ID with a length between 1 and 2 digits.");
                System.err.print("Enter again:");
            } else if (vali.checkIdExist(lw, id)) {
                System.err.println("Id already exists. Please enter a different id.");
                System.err.print("Enter again:");
            } else {
                break;
            }
        }

        System.out.print("Enter name: ");
        String name = vali.checkInputString();
        System.out.print("Enter age: ");
        int age = vali.checkInputIntLimit(18, 50);
        System.out.print("Enter salary: ");
        int salary = vali.checkInputSalary();
        System.out.print("Enter work location: ");
        String workLocation = vali.checkInputString();
        if (!vali.checkWorkerExist(lw, id, name, age, salary, workLocation)) {
            System.err.println("Duplicate.");
        } else {
            lw.add(new Worker(id, name, age, salary, workLocation));
            System.err.println("Add success.");
        }
    }

    //allow user increase salary for user
    public void changeSalary(ArrayList<Worker> lw, ArrayList<History> lh, int status) {
        if (lw.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        System.out.print("Enter code: ");
        String id = vali.checkInputString();
        Worker worker = getWorkerByCode(lw, id);
        if (worker == null) {
            System.err.println("Not exist worker.");
        } else {
            int salaryCurrent = worker.getSalary();
            int salaryUpdate;
            //check user want to update salary
            if (status == 1) {
                System.out.print("Enter salary: ");
                //loop until user input salary update > salary current
                while (true) {
                    salaryUpdate = vali.checkInputSalary();
                    //check user input salary update > salary current
                    if (salaryUpdate <= salaryCurrent) {
                        System.err.println("Must be greater than current salary.");
                        System.out.print("Enter again: ");
                    } else {
                        break;
                    }
                }
                lh.add(new History("UP", getCurrentDate(), worker.getId(),
                        worker.getName(), worker.getAge(), salaryUpdate,
                        worker.getWorkerlocation()));
            } else {
                System.out.print("Enter salary: ");
                //loop until user input salary update < salary current
                while (true) {
                    salaryUpdate = vali.checkInputSalary();
                    //check user input salary update < salary current
                    if (salaryUpdate >= salaryCurrent) {
                        System.err.println("Must be smaller than current salary.");
                        System.out.print("Enter again: ");
                    } else {
                        break;
                    }
                }
                lh.add(new History("DOWN", getCurrentDate(), worker.getId(),
                        worker.getName(), worker.getAge(), salaryUpdate,
                        worker.getWorkerlocation()));
            }
            worker.setSalary(salaryUpdate);
            System.err.println("Update success");
        }
    }

    //allow user print history
    public void printListHistory(ArrayList<History> lh) {
        if (lh.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        System.out.printf("%-5s%-15s%-5s%-10s%-10s%-20s\n", "Code", "Name", "Age",
                "Salary", "Status", "Date");
        Collections.sort(lh);
        //print history from first to last list
        for (History history : lh) {
            printHistory(history);
        }
    }

    //get worker by code
    public Worker getWorkerByCode(ArrayList<Worker> lw, String id) {
        for (Worker worker : lw) {
            if (id.equalsIgnoreCase(worker.getId())) {
                return worker;
            }
        }
        return null;
    }

    //get current date 
    public String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        return dateFormat.format(calendar.getTime());
    }

    //print history
    public void printHistory(History history) {
        System.out.printf("%-5s%-15s%-5d%-10d%-10s%-20s\n", history.getId(),
                history.getName(), history.getAge(), history.getSalary(),
                history.getStatus(), history.getDate());
    }
}
