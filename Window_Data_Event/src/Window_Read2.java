
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
 

public class Window_Read2
{
	public static void main(String[] args)
	{
		
		BufferedReader buffer = null;
		
		try
		{
			String line;
			buffer = new BufferedReader(new FileReader("f://window/data1.csv"));
			
		
			while ((line = buffer.readLine()) != null) 
			{
				//System.out.println(line);
				System.out.println(  toArrayList(line) + "\n");
			}
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try
			{
				if (buffer != null) buffer.close();
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	

	public static ArrayList<String> toArrayList(String csv)
	{
		ArrayList<String> result = new ArrayList<String>();
		
		if (csv != null) 
		{
			String[] splitData = csv.split("\\s*,\\s*");
			for (int i = 0; i < splitData.length; i++)
			{
				if (!(splitData[i] == null) || !(splitData[i].length() == 0)) 
				{
					result.add(splitData[i].trim());
				}
			}
		}
		
		return result;
	}
	
}