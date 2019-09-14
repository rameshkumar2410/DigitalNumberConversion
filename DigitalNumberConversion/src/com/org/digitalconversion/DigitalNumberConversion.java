package com.org.digitalconversion;

import java.util.Scanner;

/**
 * This class is used to convert the number to Digital Format
 * 
 * @author Ramesh
 *
 */
public class DigitalNumberConversion extends MatrixPattern {
	
	private StringBuffer sb = null;

	private static Scanner scanner;

	private static StringBuffer digitalSB = null;

	private static DigitalNumberConversion digitalNumberMatrix;

	/**
	 * 
	 * @param num[][]
	 * @return This method is used to return the Digital output for the integer which has passed
	 */
	public String printDigitalOutput(int num[][]) {
		sb = new StringBuffer();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i % 2 == 0) {
					// System.out.println("value of i,j ===== "+i+" Value of J === "+j+" Value of
					if (num[i][j] == 1) {
						if (j == 0 || j == 2) {
							sb.append("|");
						} else {
							sb.append("_");
						}
					} else {
						sb.append(".");
					}
				} else {
					// System.out.println("value of i,j ===== "+i+" Value of J === "+j+" Value of
					if (num[i][j] == 1) {
						if (j == 1) {
							sb.append("_");
						} else {
							sb.append("|");
						}

					} else {
						sb.append(".");
					}
				}

			}
			sb.append(System.getProperty("line.separator"));

		}
		return sb.toString();

	}

	public static void main(String arg[]) {

		digitalNumberMatrix = new DigitalNumberConversion();
		scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		digitalSB = new StringBuffer();
		String split[] = inputValue.split("");
		for (int i = 0; i < split.length; i++) {
			digitalSB.append(digitalNumberMatrix
					.printDigitalOutput(digitalNumberMatrix.getMatrixPattern(Integer.valueOf(split[i]))));
		}
		System.out.println(digitalSB.toString());

	}

}