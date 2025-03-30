import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramFinder {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java AnagramFinder <input_file>");
            return;
        }

        String inputFile = args[0];
        try {
            Map<String, List<String>> anagramGroups = findAnagrams(inputFile);
            printAnagramGroups(anagramGroups);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    private static Map<String, List<String>> findAnagrams(String inputFile) throws IOException {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }

                String word = line.trim();
                String sortedKey = sortChars(word);

                anagramGroups.computeIfAbsent(sortedKey, _ -> new ArrayList<>()).add(word);
            }
        }

        return anagramGroups;
    }

    private static String sortChars(String str) {
        char[] chars = str.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    private static void printAnagramGroups(Map<String, List<String>> anagramGroups) {
        for (List<String> group : anagramGroups.values()) {
            if (!group.isEmpty()) {
                System.out.println(String.join(" ", group));
            }
        }
    }
}
