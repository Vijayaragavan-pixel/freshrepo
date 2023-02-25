package sample2;

import sample.AccessModifier;

public class AccessModifierVal extends AccessModifier {
	
	public static void main(String[] args) {

		AccessModifierVal n = new AccessModifierVal();
	   
       n.a(); // Public modifiers can be accessible

      // n.b(); // Private method not accessible
       
       //n.d(); // default method not accessible

       n.c(); // protected modifier can be accessible 
	}
}
