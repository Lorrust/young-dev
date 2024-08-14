package basic.exceptions;

public class Exercise3 {

	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {

		try {
			int result = 5 / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		try {
			String name = null;
			name.equals("test");
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		try {
			String phrase = "Hello!";
			char letter = phrase.charAt(6);
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		try {
			
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
		
		}

	}
