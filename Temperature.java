package SmartCalculator;
import java.sql.*;
import java.util.*;

public class Temperature extends UnitConversion{
	
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
		System.out.println("\t #### Temperature Conversion ####");
		System.out.println("\n1.Degree Celsius to Degree Fahrenheit");
		System.out.println("\n2.Degree Celsius to Kelvin.");
		System.out.println("\n3.Degree Fahrenheit to Degree Celsius.");
		System.out.println("\n4.Degree Fahrenheit to Kelvin.");
		System.out.println("\n5.Kelvin to Degree Celsius.");
		System.out.println("\n6.Kelvin to Degree Fahrenheit.");
		System.out.println("\n7.Back.");
		
		System.out.println("\nSelect any of these:");
		
		try
		{
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			
			if(choice==1)
			{
				DCtoDF();
			}
			else if(choice==2)
			{
				DCtoK();
			}
			else if(choice==3)
			{
				DFtoDC();
			}
			else if(choice==4)
			{
				DFtoK();
			}
			else if(choice==5)
			{
				KtoDC();
			}
			else if(choice==6)
			{
				 KtoDF();
			}
			else if(choice==7)
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
	
	public void DCtoDF()
	{	
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nDegree Celsius to Degree Fahrenheit");
			
			System.out.println("\nEnter a Number(Degree Celsius):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `temperature` WHERE id=1";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Degree Fahrenheit the value is:" + Number*value);
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
	
	public void DCtoK()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nDegree Celsius to Kelvin.");
			
			System.out.println("\nEnter a Number(Degree Celsius):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `temperature` WHERE id=2";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Kelvin the value is:" + Number*value);
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
	
	public void DFtoDC()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nDegree Fahrenheit to Degree Celsius");
			
			System.out.println("\nEnter a Number(Degree Fahrenheit ):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `temperature` WHERE id=3";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Degree Celsius the value is:" + Number*value);
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
	
	public void DFtoK()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nDegree Fahrenheit to Kelvin.");
			
			System.out.println("\nEnter a Number(Degree Fahrenheit):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `temperature` WHERE id=4";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Kelvin the value is:" + Number*value);
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
	
	public void KtoDC()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nKelvin to Degree Celsius");
			
			System.out.println("\nEnter a Number(Kelvin):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `temperature` WHERE id=5";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Degree Celsius the value is:" + Number*value);
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
	
	public void KtoDF()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nKelvin to Degree Fahrenheit.");
			
			System.out.println("\nEnter a Number(Kelvin):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `temperature` WHERE id=6";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Degree Fahrenheit the value is:" + Number*value);
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
