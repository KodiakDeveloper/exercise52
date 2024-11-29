package bookExercises;

import javax.swing.JOptionPane;

public class Ex52 {

	public static void main(String[] args) {

		int[] numbers1 = new int[10];

		int[] numbers2 = new int[10];

		int userInput;

		String userAnswer;

		do {

			for (int i = 0; i < numbers1.length; i++) {

				userInput = Integer.parseInt(
						JOptionPane.showInputDialog(null, "Insert the values of the first array" + "\nIndex: " + i));

				numbers1[i] = userInput;

				if (numbers1[i] % 2 == 0) {

					numbers1[i] *= 5;

				}

				System.out.print(numbers1[i] + "  ");

			}

			for (int i = 0; i < numbers2.length; i++) {

				userInput = Integer.parseInt(
						JOptionPane.showInputDialog(null, "Insert the values of the second array" + "\nIndex: " + i));

				numbers1[i] = userInput;

				if (numbers1[i] % 2 == 1) {

					numbers1[i] += 5;

				}
				
				
				System.out.print(numbers2[i] + "  ");


			}

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

	}

}
