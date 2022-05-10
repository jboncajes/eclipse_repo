package org.ssglobal.training.codes.parameters;

import org.ssglobal.training.codes.arrays.SampleArrays;

public class VarArg {
	
	public SampleArrays sample = new SampleArrays();
	
						// "data type" + "... " + "variable" 
	public void printNums(int... nums) { // not exactly an array 
		for(int lookup: nums) {
			System.out.println(lookup);
		}	
		
// 		PROCEEDS EVEN IF HAVE NULL VALUE		
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
		
//		WE CAN USE IF LOOP
//		for(int.length == 0) {
//			System.out.println("EMPTY LIST");
//		TO VERIFY TRANSACTION FIRST
		
	}
	
//	public void acceptComplexData(int x, String... names) {
		
//	}
}
