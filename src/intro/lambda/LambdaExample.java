package intro.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class LambdaExample {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(i);
				}
			}

		});

//		System.out.println("Starting thread.");
//		t.start();
//		System.out.println("Finishing program.");
//
//		Runnable r = new Runnable() {
//
//			@Override
//			public void run() {
//				for (int i = 0; i < 100; i++) {
//					System.out.println(i);
//				}
//			}
//
//		};
//		
//		Thread t1 = new Thread(r);
//		
//		Runnable r1 = () -> {
//			for (int i = 0; i < 100; i++) {
//				System.out.println(i);
//			}
//		};
//		
//		Runnable printNumbers = () -> {
//            for (int i = 1; i <= 100; i++) {
//                System.out.println(i);
//            }
//        };

		List<String> names = new ArrayList<>();
		names.add("Larry");
		names.add("Calvin");
		names.add("Peter");
		names.forEach(System.out::println);
		
		names.removeIf(name -> name.startsWith("C"));
		System.out.println("");
//		names.forEach(System.out::println);
		System.out.println("teste");
		
//		Supplier<String> supplier = () -> "test";-
//		String s = heavySearch();
		
		names.stream()
		.map(name -> name.length())
		.forEach(System.out::println);

	}
	
	public static String heavySearch() {
//		Let's suppose that this method accesses the database, executes a long query and retrieves a String response
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "1000 clients";
		
	}

}