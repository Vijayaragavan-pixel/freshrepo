package Practice;

import java.io.FileWriter;

public class FileWrite {
	
	
	    public static void main(String args[]){    
	         try{    
	           FileWriter fw=new FileWriter("C:\\Users\\vijayaraghavanj\\output.txt");    
	           fw.write("Welcome to javaTpoint.");    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	     }    
	  

}
