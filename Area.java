package SmartCalculator;
import java.sql.*;
import java.util.*;

public class Area extends UnitConversion{
	
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
		System.out.println("\t #### Area Conversion ####");
		System.out.println("\n1.Acre to Hectre");
		System.out.println("\n2.Acre to square_cent");
		System.out.println("\n3.Acre to square_feet");
		System.out.println("\n4.Acre to square_inch");
		System.out.println("\n5.Hect to Acres");
		System.out.println("\n6.Hect to Square_cent");
	    System.out.println("\n7.Hect to Square_feet");
	    System.out.println("\n8.Hect to Square inch");
	    System.out.println("\n9.Square_cent to Acres");
	    System.out.println("\n10.Square_cent to Hect");
	    System.out.println("\n11.Square_cent to Square feet");
	    System.out.println("\n12.Square_cent to Square inch");
	    System.out.println("\n13.Square feet to Acres");
	    System.out.println("\n14.Square feet to Hect");
	    System.out.println("\n15.Square feet to Square Cent");
	    System.out.println("\n16.Square feet to Square inch");
	    
	    
		System.out.println("\n17.Back.");
		
		System.out.println("\nSelect any of these:");
		
		try
		{
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			
			if(choice==1)
			{
				AcToHct(); 
			}
			else if(choice==2)
			{
				AcToSqCnt();  
			}
			else if(choice==3)
			{
				AcToSqFt();
			}
			else if(choice==4)
			{
				AcToSqInc(); 
			}
			else if(choice==5)
			{
				HctToAc(); 
			}
			else if(choice==6)
			{
				HctToSqCnt(); 
			}
			else if(choice==7)
			{
				HctToSqFt(); 
			}
			else if(choice==8)
			{
				HctToSqInc(); 
			}
			else if(choice==9)
			{
				SqCntToAc(); 
			}
			else if(choice==10)
			{
				SqCntToHct(); 
			}
			else if(choice==11)
			{
				SqCntToSqFt(); 
			}
			else if(choice==12)
			{
				SqCntSqInc(); 
			}
			else if(choice==13)
			{
				SqFtToAc(); 
			}
			else if(choice==14)
			{
				SqFtToHct(); 
			}
			else if(choice==15)
			{
				SqFtToSqCnt(); 
			}
			else if(choice==16)
			{
				SqFtToSqInc(); 
			}
			else if(choice==17)
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
	
	public void AcToHct()
	{	
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nAcre To Hectre");
			
			System.out.println("\nEnter a Number(Acre):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `area` WHERE id=1";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Hectre the value is:" + Number*value);
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
	
	public void AcToSqCnt()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nAcre to Square Cent.");
			
			System.out.println("\nEnter a Number(Acre):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `area` WHERE id=2";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Square Cent. the value is:" + Number*value);
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
	
	public void AcToSqFt()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nAcre to Square Feet");
			
			System.out.println("\nEnter a Number(Acre):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `area` WHERE id=3";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Square Feet the value is:" + Number*value);
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
	
	public void AcToSqInc()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nAcre to Square Inch");
			
			System.out.println("\nEnter a Number(Acre):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `area` WHERE id=4";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Square Inch the value is:" + Number*value);
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
	
	public void HctToAc()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nHectre to Acre");
			
			System.out.println("\nEnter a Number(Hectre):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `area` WHERE id=5";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Acre the value is:" + Number*value);
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
	
	public void HctToSqCnt()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nHectre to Square Cent.");
			
			System.out.println("\nEnter a Number(Hectre):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `area` WHERE id=6";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Square Cent. the value is:" + Number*value);
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
	public void HctToSqFt()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nHectre to Square Feet");
			
			System.out.println("\nEnter a Number(Hectre):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `area` WHERE id=7";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Square Feet the value is:" + Number*value);
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
	public void HctToSqInc()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nHectre to Square Inch");
			
			System.out.println("\nEnter a Number(Hectre):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `area` WHERE id=8";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Square Inch the value is:" + Number*value);
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
	public void SqCntToAc()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nSquare Cent. to Acre");
			
			System.out.println("\nEnter a Number(Square Cent.):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `area` WHERE id=9";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Acre the value is:" + Number*value);
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
	public void SqCntToHct()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nSquare Cent. to Hectre");
			
			System.out.println("\nEnter a Number(Square Cent.):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `area` WHERE id=10";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Hectre the value is:" + Number*value);
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
	public void SqCntToSqFt()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nSquare Cent. to Square Feet");
			
			System.out.println("\nEnter a Number(Square Cent.):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `area` WHERE id=11";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Square Feet the value is:" + Number*value);
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
	
	public void SqCntSqInc()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nSquare Cent. to Square Inch");
			
			System.out.println("\nEnter a Number(Square Cent.):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `area` WHERE id=12";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Square Inch the value is:" + Number*value);
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
	public void SqFtToAc()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nSquare Feet to Acre");
			
			System.out.println("\nEnter a Number(Square Feet):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `area` WHERE id=13";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Acre the value is:" + Number*value);
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
	public void SqFtToHct()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nSquare Feet to Hectre");
			
			System.out.println("\nEnter a Number(Square Feet):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `area` WHERE id=14";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Hectre the value is:" + Number*value);
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
	public void SqFtToSqCnt()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nSquare Feet to Square Cent.");
			
			System.out.println("\nEnter a Number(Square Feet):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `area` WHERE id=15";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Square Cent. the value is:" + Number*value);
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
	public void SqFtToSqInc()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\nSquare Feet to Square Inch");
			
			System.out.println("\nEnter a Number(Square Feet):");
			Scanner input = new Scanner(System.in);
			float Number = input.nextFloat();
			
			DataAccess da=new DataAccess();
	        ResultSet rs=null;
	        String query="SELECT * FROM `area` WHERE id=16";
	        rs=da.getData(query);
	        
	        try
	        {
	        	while(rs.next())
	        	{
	        		float value = rs.getFloat("Value");
	        		
	        		System.out.println("\nIn Square Inch the value is:" + Number*value);
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
