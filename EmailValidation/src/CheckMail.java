import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class CheckMail extends MailValidation {
	public String s;
	int k=1;
	Scanner input= new Scanner(System.in);

	public void mail_check(){
		ArrayList<String> emails = new ArrayList<String>();    
        emails.add("tcurtayne0@chronoengine.com");  
        emails.add("wdepero0@netlog.com");  
        emails.add("dlaver1@sphinn.com");  
        emails.add("eedlin2@xinhuanet.com");  
        emails.add("aschlagh3@woothemes.com");  
        emails.add("cmoorton4@pbs.org");  
        emails.add("wgarrett7@youtube.com");  
        emails.add("bsommersett6@ibm.com");  
        emails.add("bwinteringham5@netscape.com");
        emails.add("idiosynchronous@gmail.com"); 
        
    	while(k==1){
			System.out.println("Enter your e-mail id :");
			s = input.next();
			for(String i:emails){
				if(s.equals(i)){
					System.out.println("The entered e-mail id is valid. :" + i);
					k=0;
				}
				
					
				
			}
			if(k==1){
				System.out.println("Invalid e-mail id. ");
			}
			
			
		}
        
	}

	
	
}
