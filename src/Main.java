import java.util.*;

/**
 * This program allows users to input multiple lines of text, collects and sorts all the words entered.
 */
public class Main {
    /**
     * The main method of the program.
     *
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> wordsList = new ArrayList<>();

        System.out.println("Enter lines of text (enter 'stop' to finish input): ");

        // Collecting words from input lines
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            String[] words = input.split("\\s+"); // Splitting the input into words
            Collections.addAll(wordsList, words); // Adding words to the list
        }

        // Sorting the words
        Collections.sort(wordsList);

        // Displaying the sorted words
        System.out.println("\nSorted words:");
        for (String word : wordsList) {
            System.out.println(word);
        }
    }
}
