package sample2;


public class SingletonClass {

    public static void main(String[] args) {
        B text = B.getInstance();
        System.out.println(text.s);
        text.Ether();
        B d  = B.getInstance();
        d.Ether();

    }

}

class B{
    static B obj = new B(); // Instantiating with static
    public String s;
    // constructor with private access
    private B(){
    s = "Hello World";
    }

    public void Ether(){
        int a = 5,b = 6,c = 0;
        c= a+b;
        System.out.println(c);
    }
    // Creating static method
     static B getInstance(){
        return obj;
    }

}
