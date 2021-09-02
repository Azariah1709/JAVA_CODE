import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class MethodHolders {
	public void file_write()throws IOException{
		
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter String :");
		 String str= input.next();
	      
	        FileWriter fw=new FileWriter("F:\\file\\file1.txt");
	  
	        
	        for (int i = 0; i < str.length(); i++)
	            fw.write(str.charAt(i));
	  
	        System.out.println("Writing successful");
	        
	        fw.close();
	        input.close();
	}
	public void file_read() throws IOException{
		 int ch;
		  
	        
	        FileReader fr=null;
	        try
	        {
	            fr = new FileReader("F:\\file\\file1.txt");
	        }
	        catch (FileNotFoundException fe)
	        {
	            System.out.println("File not found");
	        }
	  
	       
	        while ((ch=fr.read())!=-1)
	            System.out.print((char)ch);
	  
	       
	        fr.close();
	}
	
	public void append_file() throws IOException{
		 try { 
	         String data = "file append performed here";
	         File f1 = new File("F:\\file\\file1.txt");
	         if(!f1.exists()) {
	            f1.createNewFile();
	         } 
	         FileWriter fileWritter = new FileWriter(f1.getName(),true);
	         BufferedWriter bw = new BufferedWriter(fileWritter);
	         bw.write(data);
	         
	         bw.close();
	         System.out.println("Done");
	      } catch(IOException e){
	         e.printStackTrace();
	      }
	}
	
	public void delete_file() throws IOException {
		
		Path path= Paths.get("F:\\file\\file1.txt");

    
    try {

        Files.deleteIfExists(path);
    }
    catch (IOException e) {

        
        e.printStackTrace();
    }System.out.println("Deletion Completed!");
		
		
	}


}
