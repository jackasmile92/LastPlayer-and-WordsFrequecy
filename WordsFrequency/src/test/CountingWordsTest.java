package test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import src.CountingWords;

public class CountingWordsTest {

	@Test
	public void testCountingWords() {
        System.out.println("countWords");
        String text = "Temmie only wants the Temmie Flakes ";
        Map<String, Integer> expResult = new HashMap<>();
        expResult.put("Temmie", 2);
        expResult.put("only", 1);
        expResult.put("wants", 1);
        expResult.put("the", 1);
        expResult.put("Flakes", 1);
        Map<String, Integer> result = CountingWords.countWords(text);
        assertEquals(expResult, result);

    }
}
