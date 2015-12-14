package test;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.LinkedList;

import org.junit.Test;
import src.FindingWinner;

public class TestFindingWinner {

	@Test
	public void test() {
        Collection<String> players = new LinkedList<String>(); 
        players.add("Inga");
        players.add("Stepa");	 
        players.add("Putin");
        players.add("Vasya");
        players.add("Varya");
        
        FindingWinner<String> finding = new FindingWinner<>();
        String result = finding.FindWinner(players);
        String expResult = "Putin";
        System.out.println(result);
        assertEquals(expResult, result);
        
        players.add("Pokemon");
        
        finding = new FindingWinner<>();
        result = finding.FindWinner(players);
        expResult = "Varya";
        System.out.println(result);
        assertEquals(expResult, result);
        
        players.add("Digimon");
        
        finding = new FindingWinner<>();
        result = finding.FindWinner(players);
        expResult = "Pokemon";
        System.out.println(result);
        assertEquals(expResult, result);
        
	}

}
