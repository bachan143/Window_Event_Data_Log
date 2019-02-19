
 
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Detalis
{
	private String label;
	private String date;
	private String time;
	private String sourse;
	private int event_Id;
	private String task_category;
	
	

    public void setLabel(String label) 
    {
        this.label = label;
    }
    public String getLabel()
	{
        return label;
    }
    public void setDate(String date) 
    {
        this.date = date;
    }

    public String getDate()
    {
    	return date;
    }
    public void setTime(String time) 
    {
        this.time = time;
    }

    public String getTime()
    {
    	return time;
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
	
	
	public String toString() {
		return "\nDetalis [label=" + getLabel() + ", date=" + getDate()+ ",time="+getTime()+","
				+ " sourse=" + getSourse() + ", event_Id=" + getEvent_Id()
				+ ", task_category=" + getTask_Category() + "]";
	}
	
	
}
 

public class Window_Read2
{
	public static void main(String[] args)
	{
		System.out.println("input the Eventid");
		Scanner sc=new Scanner(System.in);
		int eventid=sc.nextInt();
		
		BufferedReader buffer = null;
		String line=null;
		Scanner scanner=null;
		int index=0;
	
		List<Detalis> detalis=new ArrayList<>();
		
		try
		{
			
			
			buffer = new BufferedReader(new FileReader("f://window/bachan100.csv"));
			
		
			while ((line = buffer.readLine()) != null) 
			{
				Detalis det = new Detalis();
				scanner = new Scanner(line);
				while(scanner.hasNext())
				{
					
					
					String data = scanner.next();
						
					  if (index == 0)
						det.setLabel(data);
					  else if (index == 1)
						det.setDate(data);
					  else if(index==2)
						  det.setTime(data);
					   
					  else if (index == 3)
					   	det.setSourse(data);
					   else if (index == 4)
						det.setEvent_Id(Integer.parseInt(data));
						else if (index == 5)
							det.setTask_Category(data);
					  index++;
					  
				
					
				}
				index=0;
				detalis.add(det);
				System.out.println("================");
				
			
				
				
			}
			System.out.println(detalis);
			
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
}
	

	