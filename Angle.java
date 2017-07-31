package SmartCalculator;
import java.sql.*;
import java.util.*;

public class Angle extends UnitConversion{
	
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
		System.out.println("\t #### Angle Conversion ####");
		System.out.println("\n1.Degree to Gradian");
		System.out.println("\n2.Degree to Radian.");
		System.out.println("\n3.Gradian to Degree.");
		System.out.println("\n4.Gradian to Radian.");
		System.out.println("\n5.Radian to Degree.");
		System.out.println("\n6.Radian to Gradian.");
		System.out.println("\n7.Back.");
		
		System.out.println("\nSelect any of these:");
		
		try
		{
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			
			if(choice==1)
			{
				DegreetoGradian();
			}
			else if(choice==2)
			{
				DegreetoRadian();
			}
			else if(choice==3)
			{
				GradiantoDegree();
			}
			else if(choice==4)
			{
				GradiantoRadian();
			}
			else if(choice==5)
			{
				RadiantoDegree();
			}
			else if(choice==6)
			{
				 RadiantoGradian();
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
	
	public void DegreetoGradian()
	{	
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nDegree to Gradian");
			
			System.out.println("\nEnter a Number(Degree):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `angle` WHERE id=1";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Gradian the value is:" + Number*value);
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
	
	public void DegreetoRadian()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nDegree to Radian");
			
			System.out.println("\nEnter a Number(Degree):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `angle` WHERE id=2";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Radian the value is:" + Number*value);
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
	
	public void GradiantoDegree()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nGradian to Degree");
			
			System.out.println("\nEnter a Number(Gradian):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `angle` WHERE id=3";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Degree the value is:" + Number*value);
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
	
	public void GradiantoRadian()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nGradian to Radian");
			
			System.out.println("\nEnter a Number(Gradian):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `angle` WHERE id=4";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Radian the value is:" + Number*value);
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
	
	public void RadiantoDegree()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nRadian to Degree");
			
			System.out.println("\nEnter a Number(Radian):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `angle` WHERE id=5";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Degree the value is:" + Number*value);
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
	
	public void RadiantoGradian()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nRadian to Gradian");
			
			System.out.println("\nEnter a Number(Radian):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `angle` WHERE id=6";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Gradian the value is:" + Number*value);
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
