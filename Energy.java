package SmartCalculator;
import java.sql.*;
import java.util.*;

public class Energy extends UnitConversion{
	
	private static UnitConversion unit = new UnitConversion();
	
	public void Show()
	{
		try
	    {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	    }
	    catch (Exception e)
	    {
	        System.out.println("\nError!!");
	    }
		System.out.println("\t #### Energy Conversion ####");
		System.out.println("\n1.Calorie to Joule");
		System.out.println("\n2.Joule to Calorie.");
		System.out.println("\n3.Back.");
		
		System.out.println("\nSelect any of these:");
		
		try
		{
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			
			if(choice==1)
			{
				CalToJoule();
			}
			else if(choice==2)
			{
				JouleToCal();
			}
			
			else if(choice==3)
			{
				 unit.ShowTitle();
			}
			else
			{
				System.out.println("\nInvalid input");
			    BacktoUnitConversion();
			}
		}
		catch(Exception e)
		{
			System.out.println("\nInvalid Input!!!");
			BacktoUnitConversion();
		}
	}
	
	public void CalToJoule()
	{	
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nCalorie to Joule");
			
			System.out.println("\nEnter a Number(Calorie):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `energy` WHERE id=1";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Joule the value is:" + Number*value);
	        		BacktoUnitConversion();
	        	}
	        }
	        catch(Exception e)
	        {
	        	System.out.println("\n Error !!!");
	        	BacktoUnitConversion();
	        }
		}
		catch(Exception e)
		{
			System.out.println("\n Error !!!");
			BacktoUnitConversion();
		}
	}
	
	public void JouleToCal()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nJoule to Calorie.");
			
			System.out.println("\nEnter a Number(Joule):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `energy` WHERE id=2";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Calorie the value is:" + Number*value);
	        		BacktoUnitConversion();
	        	}
	        }
	        catch(Exception e)
	        {
	        	System.out.println("\n Error !!!");
	        	BacktoUnitConversion();
	        }
		}
		catch(Exception e)
		{
			System.out.println("\n Error !!!");
			BacktoUnitConversion();
		}
	}
	
	

}
