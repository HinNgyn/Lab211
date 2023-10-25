
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConsoleInputService {
    private Scanner sc;
    
    private static ConsoleInputService instance;
    
    private ConsoleInputService(){sc = new Scanner(System.in);}
    
    public static ConsoleInputService getInstance(){
        if (instance == null) {
            instance = new ConsoleInputService();
        }
        return instance;
    }
    
    public String getStringFromConsole(){return sc.nextLine();}
    
    public boolean checkStringWithPattern(String regexPattern, String value){
        Pattern pattern  = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }
}
