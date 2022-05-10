// NO PROGRAM ON TEST CLASS
// INSTANCES HERE

package org.ssglobal.training.codes.declaration;

public class TestNumDiff {
	
	public static void main(String[] args) {
		String num = args[0];
		int numVal = Integer.parseInt(num);
		
		NumDiff diff = new NumDiff(); // NumDiff() is a Constructor
		int result = diff.calculateNumDiff(numVal); // how to capture return value or result
					// use "diff" to access all operators using dot
		System.out.println(result);

	}

}
