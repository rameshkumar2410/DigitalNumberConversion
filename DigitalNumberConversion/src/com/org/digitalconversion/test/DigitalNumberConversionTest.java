package com.org.digitalconversion.test;

import static org.junit.jupiter.api.Assertions.*;

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

	@AfterEach
	void tearDown() throws Exception {
	}

	
	@Test
	void matrixPatterTest1() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(1);
		assertArrayEquals(pattern1, matrix);
	}

	@Test
	void matrixPatterTest2() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(2);
		assertArrayEquals(pattern2, matrix);
	}

	@Test
	void matrixPatterTest3() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(3);
		assertArrayEquals(pattern3, matrix);
	}

	@Test
	void matrixPatterTest4() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(4);
		assertArrayEquals(pattern4, matrix);
	}

	@Test
	void matrixPatterTest5() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(5);
		assertArrayEquals(pattern5, matrix);
	}

	@Test
	void matrixPatterTest6() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(6);
		assertArrayEquals(pattern6, matrix);
	}

	@Test
	void matrixPatterTest7() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(7);
		assertArrayEquals(pattern7, matrix);
	}

	@Test
	void matrixPatterTest8() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(8);
		assertArrayEquals(pattern8, matrix);
	}

	@Test
	void matrixPatterTest9() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(9);
		assertArrayEquals(pattern9, matrix);
	}

	@Test
	void matrixPatterTest0() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(0);
		assertArrayEquals(pattern0, matrix);
	}

	@Test
	void digitalConversionSingleNumberTest() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		int matrix[][] = digitalNumberConversion.getMatrixPattern(8);
		String digitalValue = digitalNumberConversion.printDigitalOutput(matrix);
		assertNotNull(digitalValue);
		System.out.println(digitalValue);
	}

	@Test
	void digitalConversionMultipleNumberTest() {
		DigitalNumberConversion digitalNumberConversion = new DigitalNumberConversion();
		for (int i = 0; i < 10; i++) {
			String digitalValue = digitalNumberConversion
					.printDigitalOutput(digitalNumberConversion.getMatrixPattern(Integer.valueOf(i)));
			assertNotNull(digitalValue);
			System.out.println(digitalValue);
		}

	}

}
