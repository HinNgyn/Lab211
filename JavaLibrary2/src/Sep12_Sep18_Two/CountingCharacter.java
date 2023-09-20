package Sep12_Sep18;

import java.util.Scanner;

public class CountingCharacter {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int cnt = 0;
        System.out.print("Enter any string: ");
        String ch = sc.next();
        
        //EnterCharacter to count
        sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char c = sc.next().charAt(0);
        
        for (int i = 0; i < ch.length(); i++) {
            if(c == ch.charAt(i)){
                cnt++;
            }
        }
        System.out.println("The string has "+ cnt +" characters " + c + " in Java ");
    }
}
