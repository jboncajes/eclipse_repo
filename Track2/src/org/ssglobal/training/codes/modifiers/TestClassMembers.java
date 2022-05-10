package org.ssglobal.training.codes.modifiers;

public class TestClassMembers {

	public static void main(String[] args) {
		ClassMembers cm = new ClassMembers();
		cm.id = 3L;
		cm.showData();

		
		cm.salary = 6000.0;
		cm.printData(); 
		
		cm.key = 123123123;
		cm.authenticate();
		
	}

}

class OldMembers{
	
	public String memberName = "Alpha";
	
	public void accessTest( ) {
		TestClassMembers tcm = new TestClassMembers();
		tcm.toString();
		
	}
}
