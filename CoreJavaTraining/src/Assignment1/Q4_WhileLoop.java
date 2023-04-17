package Assignment1;

public class Q4_WhileLoop {

	
	int n = 0;
	
	public void loop() {
		
		while(n < 12) {
			
			System.out.println("Loop executed for "+n);
			
			n++;
		}
		
		System.out.println();
		System.out.println("Loop completed for " +n);
	}
	
	public static void main(String[] args) {
		
		Q4_WhileLoop w = new Q4_WhileLoop();
		w.loop();

	}

}
