package intro.oop;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("Edward");
		p.setHeight(5.0); // Setting height above maximum limit
		System.out.println(Person.maxHeight);
		
		System.out.println(p.getHeight());
		
	}

}
