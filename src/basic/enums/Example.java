package basic.enums;

import java.math.BigDecimal;
import java.util.Objects;

public class Example {
	
	public static void main(String[] args) {
		
		double d = 0.1 + 0.2;
		System.out.println(d);
		
		BigDecimal b1 = BigDecimal.valueOf(0.1);
		BigDecimal b2 = BigDecimal.valueOf(0.2);
		
		b1 = b1.add(b2);
		System.out.println(b1);
		
		String a = "Poker";
		String b = null;
		
		System.out.println(a.equals(b));
//		System.out.println(b.equals(a)); NullPointerException
		System.out.println(Objects.equals(b, a));
		
	}

}
