package controller;

import java.util.Arrays;
import model.Glass;

public class GlassOperations {

	float glass_size = 250; // volume in milliliters

	// convert liter to ml
	public float convertToMilliliters(float litre) {
		return litre * 1000;
	}

	// return water in jth glass in ith row
	public float findWater(int i, int j, float liter) {

		float X = convertToMilliliters(liter);

		// find number of glasses
		int g = Math.round((i * (i + 1) / 2));
		float[] glass = new float[g + 50];

		// fill top glass
		int index = 0;
		glass[index] = X;

		// subtract glass capacity, distribute(equally) remaining water in bottom two glass
		// got to next glass, subtract, distribute the remaining
		for (int row = 1; row <= i; ++row) {
			// Fill glasses in a given row. Number of columns in a row is equal to row number
			for (int col = 0; col < row; ++col, ++index) {
				//System.out.println("r = " + row + " col = " + col + " index = " + index);
				
				// get water from current glass
				X = glass[index];

				// update excess water update index to max glass size
				glass[index] = (X >= glass_size) ? glass_size : X;

				// calculate remaining water amount
				X = (X >= glass_size) ? (X - glass_size) : 0.0f;

				// Distribute the remaining amount to the bottom two glasses
				glass[index + row] += X / 2;
				glass[index + row + 1] += X / 2;

				//System.out.println(Arrays.toString(glass));
			}
		}

		// Return specified glass index value
		return glass[(int) (i * (i - 1) / 2 + j - 1)];
	}
}
