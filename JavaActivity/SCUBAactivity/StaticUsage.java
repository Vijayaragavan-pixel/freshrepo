package sample2;

class StaticTest {

	// non-static instance variable
    int a = 2;
    int b = 2;
    
	// non-static method
    int multiply(){
        return a * b;
    }

    // static method
    static int add(int a, int b){
    	
        return a + b;      // non-static instance not able to use in static method
    }
}

public class StaticUsage {

   public static void main( String[] args ) {

       
        StaticTest st = new StaticTest();

        System.out.println(" 2 * 2 = " + st.multiply()); // call the non-static method

        System.out.println(" 10 + 20 = " + StaticTest.add(10,20));  // call the static method
   }
}