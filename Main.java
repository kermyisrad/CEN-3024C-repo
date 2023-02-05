
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Main {

public static void main(String[] args) throws IOException {

				Map<String, Integer> wordCounts = new HashMap<>();
		BufferedReader bufferedReader = new BufferedReader(new FileReader("src//SDLC.txt"));

		String line;

		while ((line = bufferedReader.readLine()) != null) {
			
		for (String word : words) {

				word = word.trim();

				if (word.length() > 0) {

					if (wordCounts.containsKey(word)) {
						wordCounts.put(word, wordCounts.get(word) + 1);
					} else {
						wordCounts.put(word, 1);
					}
				}
			}
		}

		
		System.out.printf("%-20s%15s\n", "Word", "Frequency");

		System.out.printf("%-20s%15s\n", "====", "=========");
		
		Map<String, Integer> sortedWordCounts = wordCounts.entrySet().stream()
				.sorted(Collections.reverseOrder(Entry.comparingByValue()))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		for (Map.Entry<String, Integer> entry : sortedWordCounts.entrySet()) {

			System.out.printf("%-20s%10s\n", entry.getKey(), entry.getValue());
		}

		bufferedReader.close();
	}

}
