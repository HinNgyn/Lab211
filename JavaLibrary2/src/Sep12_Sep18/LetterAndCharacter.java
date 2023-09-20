package letterandcharacter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
public class LetterAndCharacter {
    private Map<Character, Integer> charCounter = new HashMap<Character, Integer>();
    private Map<String, Integer> wordCounter = new HashMap<String, Integer>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LetterAndCharacter counter = new LetterAndCharacter();
        counter.analyze();
        counter.display();
    }
    public void analyze() {
        System.out.println("Enter your content: ");
        String content = scanner.nextLine();
        for (char ch : content.toCharArray()) {
            if (Character.isSpaceChar(ch)) continue;
            if (!charCounter.containsKey(ch)) {
                charCounter.put(ch, 1);
            } else {
                charCounter.put(ch, ((int) charCounter.get(ch)) + 1);
            }
        }
        StringTokenizer tokenizer = new StringTokenizer(content);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (!wordCounter.containsKey(token)) {
                wordCounter.put(token, 1);
            } else {
                wordCounter.put(token, ((int) wordCounter.get(token)) + 1);
            }
        }
    }
        public void display() {
        System.out.println(wordCounter);
        System.out.println(charCounter);
    }
}