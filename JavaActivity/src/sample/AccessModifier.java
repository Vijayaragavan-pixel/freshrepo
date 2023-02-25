package sample;

public class AccessModifier {
    

     public void a(){
         
         System.out.println("Public method called");
     }
     private void b(){
        
         System.out.println("Private method called");
     }
     protected void c(){
         
         System.out.println("Protected method called");
     }
     void d(){
        
         System.out.println("Default method called");
     }

     public static void main(String[] args){
         AccessModifier obj = new AccessModifier();
         obj.a(); // Public modifiers can be accessible

         obj.b(); // Private modifiers can be accessible

         obj.d(); // default modifier can be accessible

         obj.c(); // protected modifier can be accessible
     }

}
 class CheckingAccessModifiers{
    public static void main(String[] args){
    	
        AccessModifier obj = new AccessModifier();
        obj.a(); // Public modifiers can be accessible

       // obj.b(); // Private method cannot access outside the class

        obj.d(); // default modifier can be accessible

        obj.c(); // protected modifier can be accessible
    }
}
 class Modifier extends AccessModifier{
	 public static void main(String[] args){
		
		 Modifier m = new Modifier();
		 m.a();
		 m.c();
		 m.d();
		// m.b(); // private method not accessible
	 }
 }