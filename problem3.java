import java.util.Scanner;

public class problem3 {
    public static void main(String[] args ) {
        Scanner kb = new Scanner(System.in);
        String words[] = new String[10];
        String conjunction = "";
        String type = "";
        
        int numberOfRealWords = 0;
        for (int i = 0; i<10; i++) {
            String input = kb.nextLine();
            if (input.equals("AND") || input.equals("OR")) {
                conjunction = input;
            } else if (input.equals("HARVARD") || input.equals("CANADA")) {
                type = input;
                break;
            } else {
                words[i] = input;
                numberOfRealWords++;
            }
        }
        
        if (numberOfRealWords == 1) {
            System.out.println(words[0]);
        } else if (numberOfRealWords == 2) {
            System.out.println(words[0] + " " + conjunction + " " + words[1]);
        } else {
            for (int i = 0; i<numberOfRealWords; i++) {
                if (type.equals("HARVARD") && i==numberOfRealWords-1) {
                    String word = words[i];
                    words[i] = conjunction + " " + word;
                    break;
                } else if (type.equals("CANADA") && i==numberOfRealWords-2) {
                    String word1 = words[i];
                    String word2 = words[i+1];
                    words[i] = word1 + " ";
                    words[i+1] = conjunction + " " + word2;
                    break;
                } else {
                    String word = words[i];
                    words[i] = word + ", ";
                }
            }
            for (int i = 0; i < numberOfRealWords; i++) {
            System.out.print(words[i]);
        }
        }
    }
}