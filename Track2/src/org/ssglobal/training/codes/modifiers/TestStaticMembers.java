package org.ssglobal.training.codes.modifiers;

public class TestStaticMembers {

	public static void main(String[] args) {
		
		StaticMember sm1 = new StaticMember();
		StaticMember sm2 = new StaticMember();
		StaticMember sm3 = new StaticMember();

		
		// instance variables
		sm1.e = 3.17;
		System.out.println(sm1.e);
		sm2.e = 4.17;
		System.out.println(sm2.e);
		sm3.e = 5.17;
		System.out.println(sm3.e);
		
		StaticMember.pie = 4.141617;
		System.out.println(StaticMember.pie);
		System.out.println(StaticMember.pie);
		System.out.println(StaticMember.pie);
		
		// Methods
		sm1.isZero(0);
		sm2.isZero(100);
		sm3.isZero(-1);
		
		StaticMember.even(-10); // cannot use instance (sm1) since static
		StaticMember.even(100);
		StaticMember.even(5);
	
	}

}
