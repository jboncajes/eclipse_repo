package org.ssglobal.training.codes.parameters;

public class CompareVariables {

	public void comparePrimitive() {
		int x1 = 10;
		int x2 = 20;
		System.out.println(x1 == x2);
		
	}
	
	public void compareRefVar() {
		StringBuilder sb1 = new StringBuilder("Manila"); // no two objects are same unless cloned
		StringBuilder sb2 = new StringBuilder("Manila");
		//System.out.println(sb1 == sb2); // always false
		System.out.println(sb1.toString().equals(sb2.toString()));
	}
	
	public void compareStrVal() {
		String str1 = new String("Manila"); // "new" means create an offspring
		String str2 = new String("Manila");
		System.out.println(str1.hashCode()); // hashCode = HEX memory address converted to int
		System.out.println(str2.hashCode());
		System.out.println(str1 == str2); // always false
		//System.out.println(str1.equals(str2));
		
	}
}
