package Assignment1;

public class Q5_Calculation {
	
	public int add(int a, int b){
		
		int c = a + b;
		return c;
	}
	
	public float sub(float a, float b) {
		float c = a - b;
		return c;
	}
	
	public double mul(double a, double b) {
		double c = a*b;
		return c;
	}
	
	public float div(float a, float b) {
		float c = a/b;
		return c;
	}

	public static void main(String[] args) {
		
		Q5_Calculation c = new Q5_Calculation();
		
		System.out.println("Addition: "+c.add(2, 3));
		System.out.println("Subtraction: "+c.sub(2.3f, 3.45f));
		System.out.println("Multiplication: "+c.mul(45.974384939843923, 34.258743949284202093));
		System.out.println("division: "+c.div(3.3456f, 6.345f));

	}

}
