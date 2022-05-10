package org.ssglobal.training.codes.modifiers;

public class StaticMember {

	public static double pie = 3.14; // Italicized only not bold like final
	public double e = 2.17;
	
	public static boolean even(int value) {
		return value % 2 == 0;
	}
	
	
	public boolean isZero(int value) {
		return value == 0;
	}
	
}
