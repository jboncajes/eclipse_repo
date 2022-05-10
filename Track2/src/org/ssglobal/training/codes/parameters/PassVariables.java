package org.ssglobal.training.codes.parameters;

public class PassVariables {
	
	public void passPrimitive (int number) {
		number = 100;
		System.out.format("The new number is %d \n", number);
		
	}
	
	public void passRefVar(StringBuilder sb) { // sb is same as testSb (pointer like ot turo turo to "Manila")
		sb.append(" in the Philippines"); // dot operator to access
		System.out.format("The new sb is %s. \n", sb.toString());
	}
	
	public void passStrVal(String str) {
		str = "Pasig";
		System.out.format("The new str is %s. \n", str);
	}

}
