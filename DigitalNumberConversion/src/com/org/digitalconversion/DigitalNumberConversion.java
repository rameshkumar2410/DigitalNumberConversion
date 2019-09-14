package com.org.digitalconversion;

import java.util.Scanner;

/**
 * This class is used to convert the number to Digital Format
 * 
 * @author Ramesh
 *
 */
public class DigitalNumberConversion extends MatrixPattern {

	private static Scanner scanner;

	private static char[][] digitMap;

	private static DigitalNumberConversion digitalNumberMatrix;

	private static int indexY = 0;

	/**
	 * 
	 * @param       num[][]
	 * @param index
	 * @param       digitMap[]][]
	 * @return This method is used to return the Digital output for the integer
	 *         which has passed
	 */
	public char[][] printDigitalOutput(int num[][], int index, char[][] digitMap) {
		if (num != null) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (i % 2 == 0) {
						// System.out.println("value of i,j ===== "+i+" Value of J === "+j+" Value of
						// num[i][j]"+num[i][j]);
						if (num[i][j] == 1) {
							if (j == 0 || j == 2) {
								digitMap[i][j + index] = '|';
							} else {
								digitMap[i][j + index] = '_';
							}
						} else {
							digitMap[i][j + index] = '.';
						}
					} else {
						// System.out.println("value of i,j ===== "+i+" Value of J === "+j+" Value of
						// num[i][j]"+num[i][j]);
						if (num[i][j] == 1) {
							if (j == 1) {
								digitMap[i][j + index] = '_';
							} else {
								digitMap[i][j + index] = '|';
							}

						} else {
							digitMap[i][j + index] = '.';
						}
					}

				}
			}
		}
		return digitMap;

	}

	/**
	 * This method will iterate the value of digitMap to print the digital Value
	 * @param inputValue
	 */
	public void displayDigitalValue(String inputValue) {

		String split[] = inputValue.split("");
		digitMap = new char[3][split.length * 3];
		for (int i = 0; i < split.length; i++) {

			digitMap = digitalNumberMatrix.printDigitalOutput(
					digitalNumberMatrix.getMatrixPattern(Integer.valueOf(split[i])), indexY, digitMap);
			indexY += 3;
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < digitMap[0].length; j++) {
				System.out.print(Character.toString(digitMap[i][j]));
			}
			System.out.println();
		}

	}

	public static void main(String arg[]) {
		digitalNumberMatrix = new DigitalNumberConversion();
		scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		digitalNumberMatrix.displayDigitalValue(inputValue);

	}

}