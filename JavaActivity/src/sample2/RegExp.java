package sample2;


import java.util.regex.*;


public class RegExp {

    public static void main(String[] args){
        Pattern P = Pattern.compile("[ab]");
        Matcher m = P.matcher("a");
        boolean b = m.matches();   // Type 1 for writing regex
        System.out.println("b = "+b);

        boolean a2=Pattern.compile(".s").matcher("as").matches();
        System.out.println(a2);

        boolean b1 = Pattern.compile("[abc]").matcher("d").matches(); // Type 2 for writing regex
        System.out.println("b1 = "+b1);

        boolean b2 = Pattern.matches("[^a]","bc"); // Type 3 for writing regex
        System.out.println("b2 = "+b2);
        System.out.println(Pattern.matches("[^a]","bc"));

        boolean b3 = Pattern.matches("W","@"); //
        System.out.println("b3 = "+b3);

        System.out.println(Pattern.matches("[amn]", "a"));
    }

}

