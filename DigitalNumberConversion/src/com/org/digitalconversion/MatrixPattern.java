package com.org.digitalconversion;

/**
 * Matrix Pattern for number to digits
 * 
 * @author Ramesh
 *
 */
public class MatrixPattern {

	private int[][] matrixPattern;

	boolean flag = false;

	/**
	 * 
	 * @param num
	 * @return Returns the 3 by 3 matrix for the parameter
	 */
	public int[][] getMatrixPattern(int num) {

		matrixPattern = new int[3][3];
		if (num == 1) {
			int[][] pattern1 = { { 0, 0, 0 },

					{ 0, 0, 1 },

					{ 0, 0, 1 } };
			flag = true;
			matrixPattern = pattern1;

		}

		if (num == 2) {

			int[][] pattern2 = { { 0, 1, 0 },

					{ 0, 1, 1 },

					{ 1, 1, 0 } };
			flag = true;
			matrixPattern = pattern2;

		}

		if (num == 3) {

			int[][] pattern3 = { { 0, 1, 0 },

					{ 0, 1, 1 },

					{ 0, 1, 1 } };
			flag = true;
			matrixPattern = pattern3;

		}

		if (num == 4) {

			int[][] pattern4 = { { 0, 0, 0 },

					{ 1, 1, 1 },

					{ 0, 0, 1 } };
			flag = true;
			matrixPattern = pattern4;

		}

		if (num == 5) {

			int[][] pattern5 = { { 0, 1, 0 },

					{ 1, 1, 0 },

					{ 0, 1, 1 } };
			flag = true;
			matrixPattern = pattern5;

		}

		if (num == 6) {

			int[][] pattern6 = { { 0, 1, 0 },

					{ 1, 1, 0 },

					{ 1, 1, 1 } };
			flag = true;
			matrixPattern = pattern6;

		}

		if (num == 7) {

			int[][] pattern7 = { { 0, 1, 0 },

					{ 0, 0, 1 },

					{ 0, 0, 1 } };
			flag = true;
			matrixPattern = pattern7;

		}

		if (num == 8) {

			int[][] pattern8 = { { 0, 1, 0 },

					{ 1, 1, 1 },

					{ 1, 1, 1 } };
			flag = true;
			matrixPattern = pattern8;

		}

		if (num == 9) {

			int[][] pattern9 = { { 0, 1, 0 },

					{ 1, 1, 1 },

					{ 0, 1, 1 } };
			flag = true;
			matrixPattern = pattern9;

		}

		if (num == 0) {

			int[][] pattern0 = { { 0, 1, 0 },

					{ 1, 0, 1 },

					{ 1, 1, 1 } };
			flag = true;
			matrixPattern = pattern0;

		}

		if (flag) {
			return matrixPattern;
		}

		return null;

	}

}
