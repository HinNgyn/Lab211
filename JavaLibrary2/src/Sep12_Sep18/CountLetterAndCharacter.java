import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountLetterAndCharacter {
    public static void main(String[] args) {
        // Nhập chuỗi từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào nội dung: ");
        String inputString = scanner.nextLine();

        // Đếm số lượng từ và ký tự
        Map<String, Integer> letterCountMap = new HashMap<>();
        Map<Character, Integer> characterCountMap = new HashMap<>();

        // Tách chuỗi thành các từ
        String[] words = inputString.split("\\s+");

        // Đếm số lượng từ và ký tự
        for (String word : words) {
            letterCountMap.put(word, letterCountMap.getOrDefault(word, 0) + 1);

            for (char ch : word.toCharArray()) {
                if (!Character.isWhitespace(ch)) {
                    characterCountMap.put(ch, characterCountMap.getOrDefault(ch, 0) + 1);
                }
            }
        }
        
        // In ra số lượng từ và ký tự
        System.out.println("Số lượng từ trong chuỗi là: " + letterCountMap);
        System.out.println("Số lượng ký tự trong chuỗi là: " + characterCountMap);
    }
}