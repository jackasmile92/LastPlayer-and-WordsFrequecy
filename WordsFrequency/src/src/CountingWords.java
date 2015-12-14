package src;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountingWords {
	
    public static Map<String, Integer> countWords(String inputText) {
    	
        HashMap<String, Integer> result = new HashMap<>();
        String[] words = inputText.split(" +");
        result.put(words[0], 1); 
        boolean existing = false;
        
        for (int indexWord = 1; indexWord < words.length; indexWord++) {
            Iterator<String> keysIterator = result.keySet().iterator();
            while (keysIterator.hasNext()) {
                String checkingWord = keysIterator.next();
                if (words[indexWord].equalsIgnoreCase(checkingWord)) {
                    result.put(checkingWord, result.get(checkingWord) + 1);
                    existing = true;
                    break;
                }
            }
            if (existing == false) {
                result.put(words[indexWord], 1);
            } else {
                existing = false;
            }
        }
        return result;
    }
}
