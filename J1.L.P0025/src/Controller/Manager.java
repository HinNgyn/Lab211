package Controller;

import Model.Test;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Manager {
    //Menu
    static void menu(){
        BufferedReader br = null;
        try {
            int countLine = Test.countLine();
            int count = 1;
            br = new BufferedReader(new FileReader(new File("input.txt")));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt", true)));
            String line;
            //write until end file
            while ((line = br.readLine()) != null) {
                //check line empty
                if (Test.isLineEmpty(line)) {
                    continue;
                }
                line = Test.formatOneSpace(line);
                line = Test.formatSpecialCharacters(line);
                line = Test.afterDotUpperCase(line);
                line = Test.noSpaceQuotes(line);
                line = Test.firstUpercase(line);
                line = Test.lastAddDot(line);
                pw.print(line);
                if (count < countLine) {
                    pw.print(System.getProperty("line.separator"));
                }
                count++;
            }
            br.close();
            pw.close();
            System.out.println("Normalize successful.");
        } catch (FileNotFoundException ex) {
            System.err.println("Can't not found");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


}