package org.ssglobal.training.codes.parameters;

public class TestPassVariables {

	public static void main(String[] args) {
		PassVariables cv = new PassVariables();
		
		// Primitive Variables - Parameter passing by copy
		int testX = 10;
				// "=" is referred to as "is assigned"
		System.out.format("This is the original num is %d \n", testX);
		cv.passPrimitive(testX);
		System.out.format("The new num is %d \n", testX);
		
		
		//											  Memory Address of Manila
		// [0000555FFAAB]testSb -> [12356644ABCD] ==> 12356644ABCD("Manila")
		// Reference Variables
		StringBuilder testSb = new StringBuilder("Manila"); // [12356644ABCD] ("Manila")
							// "=" is referred to as "pointed to at"
							// read as "We let testSb pointed to at [12356644ABCD] that has access to ("Manila")."
															// "Manila" cannot be transfered directly to testSb
		System.out.format("This is the original sb is %s \n", testSb);
		cv.passRefVar(testSb);
		System.out.format("This is the original sb is %s \n", testSb);
		//System.out.println(sb.getClass());
		
		// Pointer like String object
		String testStr = new String("Manila"); // new String("Manila") is an OBJECT
		System.out.format("This is the original str is %s \n", testStr);
		cv.passStrVal(testStr); // no passing of address
		System.out.format("This is the new str is %s \n", testStr);
		
	}

}
