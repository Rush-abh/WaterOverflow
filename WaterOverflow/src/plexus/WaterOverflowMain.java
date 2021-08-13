package plexus;
// Program to calculate liquid in jth glass in ith row with K liter water

// To-do: Object oriented, validations, unit test, document, 2-3 hrs

import java.util.Scanner;

import controller.GlassOperations;
import controller.GlassValidators;

public class WaterOverflowMain {

	public static void main(String[] args) {

		GlassOperations gops = new GlassOperations();
		GlassValidators gval = new GlassValidators();
		
		Scanner my_scan = new Scanner(System.in);

		// take input of row, column and water(liter)
		System.out.println("Enter the volume of water in liters: ");
		float water_vol_float = my_scan.nextFloat();

		System.out.println("Enter the row number of the glass: ");
		int row_val = my_scan.nextInt();

		System.out.println("Enter the column number of the glass: ");
		int col_val = my_scan.nextInt();

		System.out.println("Water liters: " + water_vol_float + " Glass Row: " + row_val + "Glass column: " + col_val);
		my_scan.close();

		// validate input
		gval.validateColumnNumber(row_val, col_val);
		gval.validateWaterVolume(water_vol_float);
		
		// process input and display required glass quantity
		System.out.println("Amount of water in " + col_val + "th " + "glass of " + row_val + " row is: "
				+ gops.findWater(row_val, col_val, water_vol_float));
	}
}
