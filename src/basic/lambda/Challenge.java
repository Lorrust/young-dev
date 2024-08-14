package basic.lambda;

import java.util.ArrayList;
import java.util.List;

public class Challenge {
	
	public static void main(String[] args) {
		
		List<String> sentences = new ArrayList<>();
		
		Printer upperCase = text -> text.toUpperCase();
		
		String[] phrases = {"Hello, World!", "painting on an invisible canvas", "VSauce", "google idx", "merci beacoup"};
		
		for (String p : phrases) {
			sentences.add(p);
		}
		
		sentences.forEach(s -> upperCase.print(s));
		
		
	}

}
