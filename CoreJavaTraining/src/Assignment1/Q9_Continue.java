package Assignment1;

public class Q9_Continue {
	
	int n = 1;
	
	public void loop() {
	
	do {
		
		if(n==5 || n== 10 || n==15 || n==20) {
			
			n++;

			continue;
		}
		
		System.out.println(n);
		
		n++;
		
	} while (n<=20);	
	
	
	}
	
	public static void main(String[] args) {
		
		Q9_Continue l = new Q9_Continue();
		
		l.loop();
		
		
	}

}
