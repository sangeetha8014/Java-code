package Test1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fileoutputstream;
		
		try {
			
			fileoutputstream = new FileOutputStream("abc.txt");
			String msg = "Welcome to Java!";
			
			byte byteArray[] =  msg.getBytes();
			 
			fileoutputstream.write(byteArray);
			 
			 System.out.println("Message written to file successfully");
			 
		}	 catch (FileNotFoundException e) {
				// TODO Auto-generated method stub
				 System.out.println("File not found");
		} 	catch(IOException e) {
				// TODO Auto-generated method stub
				System.out.println("IO Exception");
			}
	}

}
