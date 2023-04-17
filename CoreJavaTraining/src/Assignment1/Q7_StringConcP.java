package Assignment1;

public class Q7_StringConcP {
	
	public String concate(String s1, String s2) {
		
		String s = s1.concat(" ").concat(s2);
		return s;
	}
	
	public String StringBuild(String s1, String s2) {
		
		StringBuilder sb = new StringBuilder();
		sb.append(s1).append(" ").append(s2);
		return sb.toString();
	}
	
	public String StringBuf(String s1, String s2) {
		StringBuffer sbuf = new StringBuffer();
		sbuf.append(s1).append(" ").append(s2);
		return sbuf.toString();
	}
	
	public String add(String s1, String s2) {
		String s = s1+" "+s2;
		return s;
	}
	
	public static void main(String[] args) {
		
		Q7_StringConcP o = new Q7_StringConcP();
		
		System.out.println(o.concate("Ram", "Dasharath"));
		System.out.println(o.StringBuild("Seetha", "Janaka"));
		System.out.println(o.StringBuf("Laxman", "Dasharath"));
		System.out.println(o.add("Hanuman", "Kesari"));
	}

}
