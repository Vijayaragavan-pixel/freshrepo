package Assignment1;

public class Q1_DataTypes {

	static boolean b ;
	static char c;
	static char c1 = '\u0000';
	static byte B;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static String S;
	static int[] a;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		boolean ch = (c1 == c);
		System.out.println("Default boolean value: "+b);
		System.out.println("Default char value: "+c);
		System.out.println("Verify '\\u0000' is the default char value: "+ch);
		System.out.println("Default byte value: "+B);
		System.out.println("Default short value: "+s);
		System.out.println("Default int value: "+i);
		System.out.println("Default long value: "+l);
		System.out.println("Default float value: "+f);
		System.out.println("Default double value: "+d);
		System.out.println("Default String value: "+S);
		System.out.println("Default array integer value: "+a);
	}

}
