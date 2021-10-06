/**
 * @author Kidus Olana
 */
import java.util.*;

public class GuessMyName implements StupidTextGame {
	
	//Accepts Scanner
	public void play(Scanner console) {
		System.out.println("Of the names below, which one is mine?");
		List<String> names = new ArrayList<String>();
		names.add("Kidus");
		names.add("Sam");
		names.add("Mary");
		names.add("Bro");
		for(String name: names) {
			System.out.print(name);
			System.out.print("  ");
		}
		
		
		String selectedName = myName(names);
		String input = console.next();
		
		if(selectedName.equalsIgnoreCase(input)) {
			System.out.println("You have got it right");
		}
		else {
			
			System.out.println("Nope");
			System.out.println("The choosen name was " + selectedName);
		}
	
	}
	public static String myName(List<String> names) {
		String name = null;
		Random rand = new Random();
		int num = rand.nextInt(names.size());
		return names.get(num); 
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Guess the name";
	}
}
