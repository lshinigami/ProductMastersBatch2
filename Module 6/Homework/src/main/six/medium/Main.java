package six.medium;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) throws IOException {
    HashMap<String, Integer> wordCount = new HashMap<>();
    HashSet<String> resultSet = new HashSet<>();

    String inputFile = "Module 6/Homework/src/main/six/medium/words.txt";

    try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
      String line;
      while ((line = reader.readLine()) != null) {
        String[] words = line.split("\\s+");
        for (String word : words) {
          word = word.toLowerCase().replaceAll("[^a-zA-Z]", "");
          if (word.isEmpty()) {
            continue;
          } else {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
          }
        }
      }
    } catch (IOException e) {
      throw e;
    }

    for (String key : wordCount.keySet()) {
      if (wordCount.get(key) == 1) {
        resultSet.add(key);
      }
    }
    System.out.println(wordCount);
    System.out.println(resultSet);
  }
}
