
 
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
class Detalis
{
	String label;
	String date_time;
	String sourse;
	int event_Id;
	String task_category;
	

    public void setLabel(String label) 
    {
        this.label = label;
    }
    public String getLabel()
	{
        return label;
    }
    public void setDate_Time(String date_time) 
    {
        this.date_time = date_time;
    }

    public String getDate_Time()
    {
    	return date_time;
    }
    public void setSourse(String sourse)
    {
    	this.sourse=sourse;
    }
    public String getSourse()
    {
    	return sourse;
    }
    public void setEvent_Id(int event_Id)
    {
    	this.event_Id=event_Id;
    	
    }
	public int getEvent_Id()
	{
		return event_Id;
	}
	public void setTask_Category(String task_category)
	{
		this.task_category=task_category;
	}
	public String getTask_Category()
	{
		return task_category;
	}
	ArrayList<Detalis> obj=new ArrayList<Detalis>();
	//obj=
}
 

public class Window_Read2
{
	public static void main(String[] args)
	{
		
		BufferedReader buffer = null;
		
		try
		{
			String line;
			buffer = new BufferedReader(new FileReader("f://window/bachan.csv"));
			
		
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