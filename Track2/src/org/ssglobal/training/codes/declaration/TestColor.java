package org.ssglobal.training.codes.declaration;

public class TestColor {

	public static void main(String[] args) { // command line parameter
											// can only be run as Java App when with public static void main	
		
		// Assumption: should have 1 item as input
		String color = args[0];
		int colorNum = Integer.parseInt(color); //convert arrays from args (String) to int
												//"Integer" is a wrapper
		
		Color c = new Color();
		c.guessColor(colorNum);
		
		// TO RUN OR INPUT
		// 1 Run As
		// 2 Run Configurations
		// 3 Select Class
		// 4 Click on Arguments
		// 5 Input data on Program arguments
		// 6 Apply
		// 7 Run
	}

}

class Color{
	
	public void guessColor(int color) {
		
		if(color >= 0 & color <= 10) {
			System.out.println("blue");
		}else if(color > 10 & color <= 20) {
			System.out.println("red");
		}else if(color > 20 & color <= 30) {
			System.out.println("green");
		}
	
	}
	
}