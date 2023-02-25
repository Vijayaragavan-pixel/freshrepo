package sample2;


public class ExceptionHandling {

	
    public static void main(String[] args) {
    	 String s = null;
        try {
            int d = 100 / 0;
            System.out.println(d);    

        }catch(ArithmeticException e){

            System.out.println(e); // Arithmetic Exception handling

       }
 try{
        	 
              System.out.println(s.length());
              
        }catch (NullPointerException e){
        	
        	 System.out.println(e); // Null Pointer Exception handling
        }
         try {
        	  int i=Integer.parseInt(s);
              System.out.println(i);
         
        }catch(NumberFormatException e){

            System.out.println(e); // Number Format Exception handling

        }

         System.out.println("Hello");
    }
}
