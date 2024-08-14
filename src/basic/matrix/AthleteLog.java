package basic.matrix;

import javax.swing.JOptionPane;

public class AthleteLog {

	public static void main(String[] args) {

//		Register athletes, distances and time records.

		int athleteAmount = Integer.parseInt(JOptionPane.showInputDialog("How many athletes?"));
		int distanceAmount = Integer.parseInt(JOptionPane.showInputDialog("How many distances?"));

		String[] athletes = new String[athleteAmount];
		String[] distances = new String[distanceAmount];
		int[][] records = new int[athleteAmount][distanceAmount];

		for (int i = 0; i < records.length; i++) {
			distances[i] = JOptionPane.showInputDialog("Distance" + (i + 1));

		}

		for (int i = 0; i < records.length; i++) {
			athletes[i] = JOptionPane.showInputDialog("Athlete" + (i + 1));
			for (int j = 0; j < records[i].length; j++) {
				records[i][j] = Integer.parseInt(
						JOptionPane.showInputDialog(athletes[i] + "'s time for distance " + distances[j] + " km:"));
			}
		}

		String result = "";
		for (int i = 0; i < records.length; i++) {
			int sum = 0;
			for (int j = 0; j < records[i].length; j++) {
				sum += records[i][j];
			}
			result += athletes[i] + " - " + ((double) sum / distances.length) + "\n";
		}
		JOptionPane.showMessageDialog(null, result);

	}

}
