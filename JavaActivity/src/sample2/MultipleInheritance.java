package sample2;

 interface Interface {
    int a = 5, b = 6; //  public static final int a = 5, b = 6, c= 0;
    default void add(){
        System.out.println("Calling Interface");
    }
    void sub();

}

 interface Interface1 {

	   default void add(){
	    System.out.println("Calling Interface1");
	   }

	   void sub(int a,int b);
	}


public class MultipleInheritance implements Interface, Interface1{

    @Override
    public void add() {
        Interface.super.add();
        Interface1.super.add();
    }

    @Override
    public void sub() {
       int c = a - b;
       System.out.println(c);
    }

    @Override
    public void sub(int a, int b) {
        int c = a - b;
        System.out.println(c);
    }

    public static  void main(String[] args){
        MultipleInheritance obj = new MultipleInheritance();
        obj.add();
        obj.sub();
        obj.sub(10,20);
    }
}

