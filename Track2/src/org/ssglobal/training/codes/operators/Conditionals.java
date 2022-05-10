package org.ssglobal.training.codes.operators;

public class Conditionals {

	char test1 = '0';
	//tes1 = 'a';
	public void createConditions() {
		float amount1 = 100.2F;
		float amount2 = 56.5F;
		boolean ce1 = amount1 == amount2;
		System.out.println(ce1);
		if (ce1) {
			System.out.println("amount1 is equal to amount2");
		}else {
			System.out.println("amount2 is equal to amount1");
		}
		
		char test1 = 'a';
		char test2 = 'b';
		boolean ce2 = test1 > test2; // test1 should come last after test2
		if (ce2) {
			System.out.println("test1 comes last");
		}else {
			System.out.println("test1 comes first before test2");
		}
	}
	
	public void createComplexConditions() {
		
		byte data = 10; // to check if within 50 to 100
		boolean le1 = data >= 50 & data <= 100; // bitwise AND
		if(le1) {
			System.out.println("within the range");
		}else {
			System.out.println("invalid data");
		}
		
		// Problem: sickLeave (boolean) withOT (boolean)
		char sickLeave = 'S'; // S=sickleave, V=vacationleave, X=none
		char withOT = 'N'; //Y=OT, N=no OT
		int approval = 0;
		boolean le2 = sickLeave == 'S' | withOT++ == 'Y' | approval++ < -1; // bitwise OR
		System.out.println(withOT);
		System.out.println(approval);
		System.out.println(le2);
		
		// bitwise OR |
		// short-circuit OR || true to stop
		// bitwise AND &
		// short-circuit AND && false to stop
		// not - !
		
		
	}
	
	public void createTernary() {
		
		int choice = 15;
		// [0 - 10] -> RED
		// [10 - 20] -> BLUE
		// [20 - 30] -> GREEN
		// OTHERWISE -> COLORLESS
		
		String color = (choice >= 0 && choice <= 10)? "RED" : //T : F
						(choice > 10 && choice <= 20)? "BLUE" :
						(choice > 20 && choice <= 30)? "GREEN" : "COLORLESS";
		System.out.println(color);
		
	}
	
	public void applyShiftOps() {
		// left shift ops MULTIPLICATIVE
		
		int counter = 1;
		int se1 = counter << 5; // shift to the left by 5 (binary value)
		
		// 1  = 1 x 2^0 = 0001
		// 2  = 1 x 2^1 = 0010
		// 4  = 1 x 2^2 = 0100
		// 8  = 1 x 2^3 = 1000
		// 16 = 1 x 2^4 = 10000
		// 32 = 1 x 2^5 = 100000
		
		System.out.println(se1);
		
		counter = se1; // equal to 32
		
		
		// right shift ops DIVISIBILITY
		int se2 = counter >> 5;
		
		// 16 = 32 / 2^1 = 010000
		// 8  = 32 / 2^2 = 001000
		// 4  = 32 / 2^3 = 000100
		// 2  = 32 / 2^4 = 000010
		// 1  = 32 / 2^5 = 000001
		System.out.println(se2);
	}
}
