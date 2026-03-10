import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

// temporary: 6717-nJ1M-8172

public class KeywordScanner {

    public static void main(String[] args) {
        // Path to txt file
        String filePath = "file.txt"; 
        
        // Die 4 keywords
        String[] keywords = {"<TAG>", "<MAP>", "<CASE>", "<LOAD>"};

        try {
            // Read in the whole file
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            
            boolean found = false;

            // Check for keywords
            for (String word : keywords) {
                if (content.contains(word)) {
                    found = true;
                    break; // Break if one keyword is found
                }
            }

            // Result
            if (found) {
                System.out.println("Keyword found");
            } else {
                System.out.println("No Keywords found");
            }

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

}


