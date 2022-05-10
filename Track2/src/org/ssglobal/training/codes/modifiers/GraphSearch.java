package org.ssglobal.training.codes.modifiers;

public class GraphSearch extends MyLog { // error if MyLog is "final"
	
	
	public void plot() {
		GraphMe gm = new GraphMe(); // instantiate first to access
		gm.scatter(); // sharing or reusing method (from GraphMe)
		
//		MyLog log = new MyLog();
		computeLogBase10(); // can be used since MyLog is extended (abstract)
		
	}
	
}
