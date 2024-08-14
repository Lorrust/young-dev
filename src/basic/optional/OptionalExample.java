package basic.optional;

import java.time.LocalDateTime;
import java.util.Optional;

public class OptionalExample {
	
	public static void main(String[] args) {
		
		String s = getString();
		
		Optional<String> optS = Optional.ofNullable(s);
		
		System.out.println(optS.orElse("Was unable to get string."));
		
		System.out.println(optS.orElseGet(() -> "Was unable to get string."));
		
		System.out.println(optS.orElseGet(OptionalExample::getDefaultValue));
		
//		if (s != null) {
//			System.out.println(s);
//		} else {
//			System.out.println("Was unable to get string.");
//		}
		
	}
	
	private static String getDefaultValue() {
		System.out.println("Entered the getDefaultValue method.");
		return "Was unable to get string,";
	}
	
	private static String getString() {
		if (LocalDateTime.now().getSecond() % 2 == 0) {
			return "Returned";
		}
		return null;
	}

}
