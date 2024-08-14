package basic.oop.exercise8;

import javax.swing.JOptionPane;

public class Car extends Vehicle {

	@Override
	void throttle() {
		JOptionPane.showMessageDialog(null, "Vrum");
		
	}

}
