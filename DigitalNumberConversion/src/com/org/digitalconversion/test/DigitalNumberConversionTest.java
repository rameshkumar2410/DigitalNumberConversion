package com.org.digitalconversion.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.org.digitalconversion.DigitalNumberConversion;

/**
 * 
 * @author Ramesh
 *
 */
public class DigitalNumberConversionTest {
	
	//Hardcode Matrix for Digital Display
	int[][] pattern1 = { { 0, 0, 0 },

			{ 0, 0, 1 },

			{ 0, 0, 1 } };

	int[][] pattern2 = { { 0, 1, 0 },

			{ 0, 1, 1 },

			{ 1, 1, 0 } };

	int[][] pattern3 = { { 0, 1, 0 },

			{ 0, 1, 1 },

			{ 0, 1, 1 } };

	int[][] pattern4 = { { 0, 0, 0 },

			{ 1, 1, 1 },

			{ 0, 0, 1 } };

	int[][] pattern5 = { { 0, 1, 0 },

			{ 1, 1, 0 },

			{ 0, 1, 1 } };

	int[][] pattern6 = { { 0, 1, 0 },

			{ 1, 1, 0 },

			{ 1, 1, 1 } };

	int[][] pattern7 = { { 0, 1, 0 },

			{ 0, 0, 1 },

			{ 0, 0, 1 } };

	int[][] pattern8 = { { 0, 1, 0 },

			{ 1, 1, 1 },

			{ 1, 1, 1 } };

	int[][] pattern9 = { { 0, 1, 0 },

			{ 1, 1, 1 },

			{ 0, 1, 1 } };

	int[][] pattern0 = { { 0, 1, 0 },

			{ 1, 0, 1 },

			{ 1, 1, 1 } };

	@BeforeEach
	void setUp() throws Exception {

	}

	@Test
	void matrixPatternTest1() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(1);
		assertArrayEquals(pattern1, matrix);
	}

	@Test
	void matrixPatternTest2() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(2);
		assertArrayEquals(pattern2, matrix);
	}

	@Test
	void matrixPatternTest3() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(3);
		assertArrayEquals(pattern3, matrix);
	}

	@Test
	void matrixPatternTest4() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(4);
		assertArrayEquals(pattern4, matrix);
	}

	@Test
	void matrixPatternTest5() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(5);
		assertArrayEquals(pattern5, matrix);
	}

	@Test
	void matrixPatternTest6() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(6);
		assertArrayEquals(pattern6, matrix);
	}

	@Test
	void matrixPatternTest7() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(7);
		assertArrayEquals(pattern7, matrix);
	}

	@Test
	void matrixPatternTest8() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(8);
		assertArrayEquals(pattern8, matrix);
	}

	@Test
	void matrixPatternTest9() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(9);
		assertArrayEquals(pattern9, matrix);
	}

	@Test
	void matrixPatternTest0() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(0);
		assertArrayEquals(pattern0, matrix);
	}

	@Test
	void matrixPatternTestDoubleDigitNumber() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(25);
		assertNull(matrix);

	}

	@Test
	void digitalConversionSingleNumberTest() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(8);
		char[][] digitMap=new char[3][3];
		char[][] digitalValue = digitalNumberConversion.printDigitalOutput(matrix, 0, digitMap);
		assertNotNull(digitalValue);
		// System.out.println(digitalValue);
	}

	@Test
	void digitalConversionMultipleNumberTest() {
		int index=0;
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		char[][] digitMap=new char[3][10*3];
		for (int i = 0; i < 10; i++) {
			digitMap=digitalNumberConversion.printDigitalOutput(digitalNumberConversion.getMatrixPattern(Integer.valueOf(i)),
					index,digitMap);
			index += 3;
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < digitMap[0].length; j++) {
				System.out.print(Character.toString(digitMap[i][j]));
			}
			System.out.println();
		}
		

	}

	@Test
	void digitalConversionBigNumberTest() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(28);
		char[][] digitMap=new char[3][3];
		char[][] digitalValue = digitalNumberConversion.printDigitalOutput(matrix, 0, digitMap);
		assertTrue(digitalValue.length == 3);
	//	System.out.println(digitalValue);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

}
