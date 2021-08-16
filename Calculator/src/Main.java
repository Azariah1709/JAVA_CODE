import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		
		char operator;
	    Double number1, number2 ;

	   
	    Scanner input = new Scanner(System.in);
	    

	    System.out.println("Choose an operator: +, -, *, or / : ");
	    operator = input.next().charAt(0);
	   

	    System.out.println("Enter first number");
	    number1 = input.nextDouble();

	    System.out.println("Enter second number");
	    number2 = input.nextDouble();
	    
	    Methods obj= new Methods();
	    
	    switch (operator) {

	      // performs addition between numbers
	      case '+':
	    	  obj.add(number1,number2);
	        break;

	      // performs subtraction between numbers
	      case '-':
	    	  obj.subtract(number1,number2);
	        break;

	      // performs multiplication between numbers
	      case '*':
	    	  obj.multiply(number1,number2);
	        break;

	      // performs division between numbers
	      case '/':
	    	System.out.println("Note: Do not enter '0' ");
	        obj.divide(number1,number2);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }
        input.close();
	}
	

}
