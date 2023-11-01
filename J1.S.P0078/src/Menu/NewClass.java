/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import Controller.DataCopyController;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class NewClass {

    DataCopyController dataCC = new DataCopyController();
    private final Scanner sc = new Scanner(System.in);

    public void display() {
        while (true) {
            System.out.println("1. Copy Folder");
            System.out.println("2. Exit.");
            System.out.print("Enter your choose: ");
        }
    }
}
