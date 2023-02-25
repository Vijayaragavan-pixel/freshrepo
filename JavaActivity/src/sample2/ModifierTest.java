package sample2;

import sample.AccessModifier;

public class ModifierTest {

	
	
	public static void main(String[] args) {
		AccessModifier g = new AccessModifier();
		g.a(); // public only accessible globally
		
//		g.b(); // private not accessible globally
	
//		g.c(); // protected not accessible globally
	
//		g.d(); // default not accessible globally
	}
	
	
}
