package org.ssglobal.training.codes.declaration;

public class MyDataType {

	// global variables
	public static final double PIE = 3.141617; //constants can be class variable
	public static long versionId = 1L; //contributes to class characteristics
	public static String creature = "vertebrate"; //these three are called LEGENDS/MARKERS
	public static int error_level = 0; //can be easily changed or tampered (not crucial values)
	
	
	public byte counter;
	public short numProducts;
	public int  numCells = 20000;
	public long numTcellsb = 20000L;
	
	public float weight = 0.05F;
	public double billGatesMoney = 0.05;
	
	
	public char letter;
	public String personName = "";
	
	public void createVars() {
		// local variables
		int age = 0;
		float salary;
		final float MY_PIE = 90.6F; // once with "final", considered as constant
		
		System.out.println(counter);
		System.out.println(age);
		System.out.println(letter);
		System.out.println(personName);
	}

	public void manageArguments(final float weight, final byte counter) {
		// local parameters
		// weight = 10.0F; // ARGUMENT - no need to indicate "float" again since already indicated on public void
		System.out.println(weight);
	}
	
	// Block Variables Examples
	public void createBlockVarsThruIf(int option) {
		
		if (option == 0) {
			int err_val = 10; //err_val can be accessed on this if block only (lines 39-41)
			option = option + err_val;
			System.out.println(option);
		}else {
			int otherwise_val = -10;
			option = option + otherwise_val;
			System.out.println(option);
		}
		
	//	System.out.println(err_val); cannot be used/printed outside the block. Collision will occur.
		
	}
	
	public void createBlockVarsThruLoop(int[] ids) {
		
		
		for(int i = 0; i < ids.length; i++) {
			System.out.println(ids[i]);	
		}

	}
	
	public void createBlockVarsThruSwitch(int option) {
		
		switch(option) {
			case 1:
				float amount = 1000.50F;
				System.out.println(1);
				break;
			case 2:
				System.out.println(2);
				break;
			default:
				System.out.println(-1);
				break;
		}
	}
	
	public void assignLiterals() {
		// integral types
		counter = 127; // within the range -128 to 127 (no error)
		numProducts = 32000;
		numCells = 787878878; // default integral type is int (always coerce to int)
		numTcellsb = 7878788789L; // caused problem: coercion
									// Perl: '2' + 2 == '4'
									// JavaScript = '2' + 2 == '22'
									// ===
		
		// real number types
		billGatesMoney = 999999999999.89; // default real type is double
		weight = 89.5F;
		
		// character literal types
		
		
		//ASCII until 127 characters only
		letter = 'H';
		System.out.println(letter);
		
		// Numerical value - coercion applies on ASCII only, nothing else
		letter = 0; // means null or empty (not actually 0)
					// 0 is \0
		System.out.println(letter);
		letter = 68; // ASCII value is D
		System.out.println(letter);
		
		// Unicode characters (UTF-8) until 65000 only
		// in hexadecimal form
		// TO ACTIVATE UTF-8
		// 1 Right click on project
		// 2 Properties
		// 3 Text file encoding
		// 4 others (change to UTF-8)
		letter = '\u00F1';
		System.out.println(letter);
		
		// String literals (because it is composed of several characters)
		personName = "Juan Luna\n";
		System.out.println(personName);
	}
	
	public void literalConversion() {
		numProducts = 10; // identity conversion
		
		// widening conversions
		int amount = 32000;
		double salary = 67800.5F;
		
		// narrowing conversions
		byte param = (byte) 128; // (byte) and (float) are casts
		System.out.println(param);
		float price = (float) 89.6; // since 89.6 is double by default, use (float) cast
		System.out.println(price);
		
		
			
	}
	
}


	
	
class TestMyDataType{
	
	public static void main(String[] args) { //String[] args is the only Command Line Parameter
		MyDataType mdt = new MyDataType(); //to access MyDataType
		System.out.println(MyDataType.PIE);
		
		MyDataType.error_level = -1;
		System.out.println(MyDataType.error_level);
		mdt.manageArguments(89.6F, (byte) 0); //still may vary
		// mdt.manageArguments(75.6F, 7); // will cause coercion error to int (solution is casting, put "(byte)")
		mdt.createBlockVarsThruLoop(new int[] {10, 20, 45, 89}); // initialized array
		System.out.println(mdt.billGatesMoney); //instance variables

		mdt.createVars();
		mdt.assignLiterals();
		mdt.literalConversion();
		
	}
}