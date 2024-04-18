// Import the Arrays and List classes from the Java Standard Library
import java.util.Arrays;
import java.util.List;

public class ConcatenateWords {
    public static void main(String[] args) {
        // Convert the array of arguments to a List
        List<String> words = Arrays.asList(args);

        // Check if the number of words is between 2 and 5
        if (words.size() >= 2 && words.size() <= 5) {
            // If the condition is true, join the words into a single string with spaces between them and print it.
            System.out.println(String.join(" ", words));
        } else {
            // If the condition is false (i.e., the number of words is not between 2 and 5), print an error message.
            System.out.println("Please provide between 2 and 5 words.");
        }
    }
}