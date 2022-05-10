// ALL PROGRAMS ARE HERE IN SOLUTION CLASS
// NO INSTANCES
// ONLY CALLINGS

package org.ssglobal.training.codes.declaration;

public class NumDiff {
	
		public int calculateNumDiff(int x) {
			int numdiff = calculateCube(x) - calculateSquare(x); // no declaration here
																// calling thru method names
			return numdiff;
		}

		public int calculateSquare(final int x) { //declare here
			int square = x * x; // declare
			return square;	
		}
		
		public int calculateCube(final int x) { //declare here
			int cube = x * x * x; // declare
			return cube;
		}
		
		// transactional classes
}
