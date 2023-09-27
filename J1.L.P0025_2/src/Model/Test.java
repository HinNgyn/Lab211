    
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
        try {
            StringBuffer sb = new StringBuffer();//instantiate a string buffer 
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            //instantiate a bufferresder to read from file
            String text;
            while ((text = br.readLine()) != null) {
                //read the text into String buffer
                sb.append(text + System.lineSeparator());
            }
            text = sb.toString(); //output to string variable 
            System.out.println("Raw Text: \n" + text);
            text = text.toLowerCase(); //change all characters to lowercase   
            text = text.substring(0, 1).toUpperCase() + text.substring(1); //change first character to uppercase  
            text = text.replaceAll("\\s{2,}", " "); //remove two or more spaces 
            text = text.replaceAll("([\\s]+)([.,])", "$2"); //remove space before , or .    
            text = text.replaceAll("([.,:])([\\S])", "$1 $2"); //add space after , or . or :  
            text = text.replaceAll("(\")[\\s]*([\\w\\s]*[\\w])[\\s]*(\")", "$1$2$3"); //remove space after or before "  
            text = text.replaceAll("([^.])$", "$1."); //add . at the end
            Matcher m = Pattern.compile("([.])([\\s]*)([\\w])").matcher(text); //create a pattern for detecting . and a character
            text = m.replaceAll(r -> r.group(1) + " " + r.group(3).toUpperCase()); //turn first character to uppercase 
            text = text.replaceAll("([.])([\\s])([\\w])", "$1 $3");
            text = text.substring(0, text.length() - 1);  //remove extra . at the end
            System.out.println("Text after normalization: \n" + text);
        } catch (FileNotFoundException e) { //if input file not found
            System.out.println(e);
        } catch (IOException e) {   //if no input is given to buffered reader
            System.out.println(e);
        }
    }
}
