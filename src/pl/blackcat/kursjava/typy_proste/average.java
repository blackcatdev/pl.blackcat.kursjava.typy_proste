package pl.blackcat.kursjava.typy_proste;

import java.util.Scanner;

//print average from 3 school subjects, 4 marks; first time using user input

public class average {
	private static double averageCount(int sum, int elements) {
		return (sum / (double) elements);

	}

	private static void average_helper(int[][] marks) {
		int total_sum = 0;
		for (int i = 0; i < 3; i++) {
			int subject_sum = 0;
			for (int j = 0; j < 4; j++) {
				subject_sum = subject_sum + marks[i][j];
			}
			total_sum = total_sum + subject_sum;
			System.out.println("Subject no " + i + " average: " + averageCount(subject_sum, 4));
		}
		System.out.println("Total average: " + averageCount(total_sum, 12));

	}

	public static void main(String[] args) {
		int[][] marks = new int[3][4];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("School subject no: " + i);
			for (int j = 0; j < 4; j++) {
				System.out.print("Provide mark from school subject no " + i + ": ");
				marks[i][j] = input.nextInt();

			}
		}
		average_helper(marks);
	}
}
