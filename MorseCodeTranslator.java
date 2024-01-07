import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCodeTranslator {

    private static final Map<String, String> morseCodeMap = new HashMap<>();

    static {
        morseCodeMap.put("A", ".-");
        morseCodeMap.put("B", "-...");
        morseCodeMap.put("C", "-.-.");
        morseCodeMap.put("D", "-..");
        morseCodeMap.put("E", ".");
        morseCodeMap.put("F", "..-.");
        morseCodeMap.put("G", "--.");
        morseCodeMap.put("H", "....");
        morseCodeMap.put("I", "..");
        morseCodeMap.put("J", ".---");
        morseCodeMap.put("K", "-.-");
        morseCodeMap.put("L", ".-..");
        morseCodeMap.put("M", "--");
        morseCodeMap.put("N", "-.");
        morseCodeMap.put("O", "---");
        morseCodeMap.put("P", ".--.");
        morseCodeMap.put("Q", "--.-");
        morseCodeMap.put("R", ".-.");
        morseCodeMap.put("S", "...");
        morseCodeMap.put("T", "-");
        morseCodeMap.put("U", "..-");
        morseCodeMap.put("V", "...-");
        morseCodeMap.put("W", ".--");
        morseCodeMap.put("X", "-..-");
        morseCodeMap.put("Y", "-.--");
        morseCodeMap.put("Z", "--..");
        morseCodeMap.put("1", ".----");
        morseCodeMap.put("2", "..---");
        morseCodeMap.put("3", "...--");
        morseCodeMap.put("4", "....-");
        morseCodeMap.put("5", ".....");
        morseCodeMap.put("6", "-....");
        morseCodeMap.put("7", "--...");
        morseCodeMap.put("8", "---..");
        morseCodeMap.put("9", "----.");
        morseCodeMap.put("0", "-----");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Morse Code Translator");
        System.out.println("1. Text to Morse Code");
        System.out.println("2. Morse Code to Text");
        System.out.print("Choose an option (1 or 2): ");

        int option = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (option == 1) {
            System.out.print("Enter text to translate to Morse Code: ");
            String text = scanner.nextLine().toUpperCase(); // Convert input to uppercase
            String morseCode = textToMorseCode(text);
            System.out.println("Morse Code: " + morseCode);
        } else if (option == 2) {
            System.out.print("Enter Morse Code to translate to text: ");
            String morseCode = scanner.nextLine();
            String text = morseCodeToText(morseCode);
            System.out.println("Text: " + text);
        } else {
            System.out.println("Invalid option. Exiting.");
        }

        scanner.close();
    }

    private static String textToMorseCode(String text) {
        StringBuilder morseCodeBuilder = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (c == ' ') {
                morseCodeBuilder.append(" ");
            } else {
                String morseSymbol = morseCodeMap.get(String.valueOf(c));
                if (morseSymbol != null) {
                    morseCodeBuilder.append(morseSymbol).append(" ");
                }
            }
        }

        return morseCodeBuilder.toString().trim();
    }

    private static String morseCodeToText(String morseCode) {
        StringBuilder textBuilder = new StringBuilder();

        String[] morseWords = morseCode.split("   "); // Three spaces represent a word break
        for (String morseWord : morseWords) {
            String[] morseChars = morseWord.split(" ");
            for (String morseChar : morseChars) {
                for (Map.Entry<String, String> entry : morseCodeMap.entrySet()) {
                    if (entry.getValue().equals(morseChar)) {
                        textBuilder.append(entry.getKey());
                    }
                }
            }
            textBuilder.append(" ");
        }

        return textBuilder.toString().trim();
    }
}
