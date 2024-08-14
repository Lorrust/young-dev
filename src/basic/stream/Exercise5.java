package basic.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Exercise5 {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Yen");
		names.add("Strolt");
		names.add("Fax");
		names.add("Portis");
		names.add("Humberto");
		names.add("Marrie");
		names.add("Noni");
		names.add("Alon");
		names.add("Toget");
		names.add("Epis");
		
		System.out.println(new Exercise5().searchFirstBerto(names));
		
	}
	
	public String searchFirstBerto(List<String> names) {
		return names.stream()
				.filter(Objects::nonNull)
				.filter(name -> name.endsWith("berto"))
				.findFirst()
				.orElseThrow(() -> new ZeroBertoException("No berto was found."));
	}

}
