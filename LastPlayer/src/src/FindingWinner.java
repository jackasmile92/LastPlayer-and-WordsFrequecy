package src;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FindingWinner <T extends Object> {
	
	public T FindWinner(Collection<? extends T> players) {
        List<T> listOfPlayers = new LinkedList<>(players);
        Iterator<T> iteratorOfPlayers = listOfPlayers.iterator();
        
        int evenIndex = 0; 
        
        while (listOfPlayers.size() != 1) {
            while (iteratorOfPlayers .hasNext()) {
                if (evenIndex == 1) {
                	evenIndex = 0;
                    iteratorOfPlayers.next();
                    iteratorOfPlayers.remove();
                } else {
                	iteratorOfPlayers.next();
                	evenIndex++;
                }
            }
            iteratorOfPlayers  = listOfPlayers.iterator();
        }
        return listOfPlayers.get(0);
    }

}
