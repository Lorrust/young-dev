package com.first_exam;

import javax.swing.JOptionPane;

public class DownloadTime {

	public static void main(String[] args) {

		int internetSpeed = Integer.parseInt(JOptionPane.showInputDialog("Enter your internet speed in mb/s:"));
		int fileSize = Integer.parseInt(JOptionPane.showInputDialog("Enter the file size in mb:"));
		int downloadRate = Math.round(fileSize / internetSpeed);
		
		JOptionPane.showMessageDialog(null, "It will take " + (Math.floorDiv(downloadRate, 60)) + " minutes and " + (downloadRate % 60) + " seconds.");
		
	}

}
