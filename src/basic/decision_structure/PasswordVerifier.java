package basic.decision_structure;

import javax.swing.JOptionPane;
import java.util.regex.Pattern;

public class PasswordVerifier {

	public static void main(String[] args) {
		
		String password = JOptionPane.showInputDialog("Enter your password:"
														+ "\n- Must be 8 characters long."
														+ "\n- Must contain a lowercase letter"
														+ "\n- Must contain an uppercase letter"
														+ "\n- Must contain a number"
														+ "\n- Must contain a special character");
		
		if (Pattern.matches("[a-zA-Z0-9!@#$%&*]+", password) && (password.length() >= 8)) {
			
			if ((JOptionPane.showInputDialog("Enter your password again:").equals(password))) {
				JOptionPane.showMessageDialog(null, "Password approved.");
			} else JOptionPane.showMessageDialog(null, "Passwords do not match.");
			
		} else JOptionPane.showMessageDialog(null, "Your password does not match the criteria.");
	}
}