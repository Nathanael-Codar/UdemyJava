package apllication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the row and column numbers ");
		System.out.print("Column: ");
		int n = sc.nextInt();
		System.out.print("Line: ");
		int m = sc.nextInt();
		
		int[][] array = new int[n][m];
		
		System.out.println("Enter the value.");
		for (int i=0; i < n; ++i)
			for (int j=0; j < m; ++j) {
				System.out.printf("Array %d, %d: ", i, j );
				array[i][j] = sc.nextInt();	
			}
		
		System.out.println();
		System.out.println("Matrix created:");
		
		for (int i=0; i<n; ++i) {
			for (int j=0; j<m; ++j) {
				System.out.printf("%d ", array[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println();
		
		int x = sc.nextInt();
		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				if (array[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + array[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + array[i-1][j]);
					}
					if (j < array[i].length-1) {
						System.out.println("Right: " + array[i][j+1]);
					}
					if (i < array.length-1) {
						System.out.println("Down: " + array[i+1][j]);
					}
				}
			}
		}

		sc.close();
	} 
}
