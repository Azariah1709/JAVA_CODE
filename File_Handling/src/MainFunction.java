import java.io.IOException;
import java.util.Scanner;


public class MainFunction {
	public static void main(String args[]) throws IOException{
		char operator;
		
	    
	    Scanner input = new Scanner(System.in);
	    MethodHolders obj= new MethodHolders();

	    
	    	System.out.println("Choose\n 1: for file write\n 2: for file read\n 3: for appending file\n 4: for file delete : ");
		    operator = input.next().charAt(0);
		    
		    switch (operator) {


		      case '1':
		    	  obj.file_write();
		        break;

		      
		      case '2':
		    	  obj.file_read();
		        break;

		     
		      case '3':
		    	  obj.append_file();
		        break;

		      
		      case '4':
		    	
		        obj.delete_file();
		        break;

		      default:
		        System.out.println("Invalid operator!");
		        break;
		    }
		    
		   
		    
	    
	    
      input.close();
	}

}
