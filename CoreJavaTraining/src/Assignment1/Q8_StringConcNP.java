package Assignment1;

public class Q8_StringConcNP {
	
	String s1 = "Krishna";
	String s2 = "Vasudev";
	
	public String concate() {
		
		String s = s1.concat(" ").concat(s2);
		return s;
	}
	
	public String StringBuild() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(s1).append(" ").append(s2);
		return sb.toString();
	}
	
	public String StringBuf() {
		StringBuffer sbuf = new StringBuffer();
		sbuf.append(s1).append(" ").append(s2);
		return sbuf.toString();
	}
	
	public String add() {
		String s = s1+" "+s2;
		return s;
	}
	
	public static void main(String[] args) {
		
		Q8_StringConcNP o = new Q8_StringConcNP();
		
		System.out.println(o.concate());
		System.out.println(o.StringBuild());
		System.out.println(o.StringBuf());
		System.out.println(o.add());
	}

}
