package basic.oop;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("Edward");
		p.setHeight(5.0); // Setting height above maximum limit
		System.out.println(p.getName() + ": "+ Person.maxHeight);
		
		System.out.println(p.getHeight());
		
	}

}
