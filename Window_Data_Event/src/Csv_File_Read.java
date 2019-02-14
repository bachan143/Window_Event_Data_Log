import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Csv_File_Read 
{


	public static void main(String[] args) throws IOException
	{
		String filename="f://window/data.csv";
		FileReader file=new FileReader(filename);
	    System.out.println("input the event id ");
	    int event;
		Scanner sc=new Scanner(System.in);
		event=sc.nextInt();
		try {
			int i;
			
			
			while((i=file.read())!=-1)
			{
				
			
				
				System.out.print((char)i);
			}
			System.out.println();
		
		} 
		catch (FileNotFoundException e) 
		{
		
			e.printStackTrace();
		}
		
	}

}
