package intro.basics;

public class TimeMeasure {

	public static void main(String[] args) {
		
		String[] names = new String[100000];
		
		for (int i = 0; i < names.length; i++) {
			names[i] = "name " + i;
		}
		
		String[] searches = {"X", "name 99999", "name 0"};
		
		for (String search: searches) {
				String result = "Doesn't exist.";
				long t0 = System.nanoTime();
				
				for (String name: names) {
				if (search.equals(name)) {
					result = "Found it.";
				}
			}
				System.out.println(result);
				long t1 = System.nanoTime();
				
				System.out.println(t1 - t0);
		
		
		}
	}
}
