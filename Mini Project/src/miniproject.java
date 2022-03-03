
import java.io.*;
import java.util.*;

public class miniproject {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(new File("D:\\Downloads\\Java Programs\\complaints.csv"));  
		sc.useDelimiter(",");   //sets the delimiter pattern  
		while (sc.hasNext())  //returns a boolean value  
		{  
		System.out.print(sc.next());  //find and returns the next complete token from this scanner  
		}   
		sc.close(); 
		//closes the scanner  
		
	}

}
