package org.ssglobal.training.codes.arrays;
// Sample edit for GIT
public class SampleArrays {
	
//	public char[] letters = new char[5]; 
	
	public void createSingleArrays() {
		
		// PRIMITIVE VARIABLES
		// INITIALIZE FIRST
		char[] letters = new char[5]; // always indicate array length size = 5
	//	System.out.println(letters[0]); // 0 or \0 --> DEFAULT TYPES
		// THEN INDEXING
		letters[0] = 64; // index is always 0
		letters[1] = 'a';
		letters[2] = '\u20B1';
		letters[3] = 'C';
		letters[4] = '\t';
		
		System.out.println(letters[2]); // 0 or \0 --> DEFAULT TYPES
		String names[] = new String[10]; // Array of objects / no constructor
		names[names.length -1] = "ABBA"; // ACCESSING LAST ELEMENT
		int lenArray = letters.length; // BUILT-IN CONSTANT VALUE FOR ARRAY LENGTH
		System.out.println(names[0]); // NULL (default of object)
		
	//	double[] grades = new double[] {78.5, 90.6, 100.5}; // INITIALIZATION OF ARRAY VALUES
		double[] grades = {78.5, 90.6, 100.5}; // INITIALIZATION OF ARRAY VALUES
		grades[0] = 90.00; // TO UPDATE VALUE BUT CANNOT CHANGE LENGTH  
		System.out.println(grades[0]);
		
		// TO CHANGE DATA OR LENGTH --> INSTANTIATE AGAIN
		grades = null;
		grades = new double[] {66.0, 90.5, 22.5, 100.5};
	}

	public void createMatrix() {
		//NOT INITIALIZED
		int[][] matrix = new int[3][3]; // rows x columns (index based starting at 0)
		
		// row 1
		matrix[0][0]=2;
		matrix[0][1]=5;
		matrix[0][2]=10;
		
		// row 2
		matrix[1][0]=1;		// 2 5 10
		matrix[1][1]=1;		// 1 1 1
		matrix[1][2]=1;		// 2 2 2
		
		// row 3
		matrix[2][0]=2;
		matrix[2][1]=2;
		matrix[2][2]=2;
		
		// INITIALIZED
		double[][] prices = new double [][] { { 2.2, 3.3, 4.5 },
											   { 8.9, 4.5, 1.1 },
											   { 3.4, 6.6, 4.5 } };
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) { // matrix[i].length for number of columns
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(); // \n
		}
		
		for (double[] rowLookup : prices) {
			for(double columnLookup : rowLookup) {
				System.out.print(columnLookup + " ");
			}
			System.out.println(); // \n
		}
											   
											   
	}
	
}
