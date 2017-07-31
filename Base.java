package SmartCalculator;
import java.util.*;
import java.math.*;

public class Base extends Start {
	
	private Calculate calculate = new Calculate();
	private static BinaryCalculator Binary = new BinaryCalculator();
	private static HexaDecimalCalculator Hex = new HexaDecimalCalculator();
	private static OctalCalculator oct = new OctalCalculator();
	
	private static int choice;
	
	public void ShowTitle()
	{
		try
	    {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	    }
	    catch (Exception e)
	    {
	        System.out.println("\nError!!");
	    }
		
		System.out.println("\t #### Base Calculator ####");
		System.out.println("\n1.Decimal to Binary.");
		System.out.println("\n2.Decimal to Hex.");
		System.out.println("\n3.Decimal to Octal.");
		System.out.println("\n4.Binary Calculation.");
		System.out.println("\n5.HexaDecimal Calculation.");
		System.out.println("\n6.Octal Calculation.");
		System.out.println("\n7.Back.");
		
		System.out.println("\nSelect any of these:");
		
		try
		{
			Scanner input = new Scanner(System.in);
			choice = input.nextInt();
			
			if(choice==1)
			{
				DecimaltoBinary();
			}
			else if(choice==2)
			{
				DecimaltoHex();
			}
			else if(choice==3)
			{
				DecimaltoOctal();
			}
			else if(choice==4)
			{
				Binary.ShowName();
			}
			else if(choice==5)
			{
				Hex.ShowName();
			}
			else if(choice==6)
			{
				oct.ShowName();
			}
			else if(choice==7)
			{
				Start.CalculatorMenu();
			}
			else
			{
				System.out.println("\nInvalid input");
				BacktoBase();
			}
		}
		catch(Exception e)
		{
			System.out.println("\nInvalid input!!!");
			BacktoBase();
		}

	}
	
	public void DecimaltoBinary()
	{
		try
	    {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	    }
	    catch (Exception e)
	    {
	        System.out.println("\nError!!");
	    }
		
		System.out.println("\nDecimal to Binary");
		System.out.println("\nEnter Operation:");
		Scanner input = new Scanner(System.in);
		String Number = input.nextLine();
		
		if(Number.contains(Character.toString('.')))
		{
			System.out.println("\nFractional values are not allowed");
			BacktoBase();
		}
		
		if( (  Number.contains(Character.toString('0')) || Number.contains(Character.toString('1')) 
				   || Number.contains(Character.toString('2')) || Number.contains(Character.toString('3'))
				   || Number.contains(Character.toString('4')) || Number.contains(Character.toString('5'))
				   || Number.contains(Character.toString('6')) || Number.contains(Character.toString('7'))
				   || Number.contains(Character.toString('8')) || Number.contains(Character.toString('9'))) 
				   || (Number.contains(Character.toString('+'))|| Number.contains(Character.toString('-')) 
				   || Number.contains(Character.toString('*')) || Number.contains(Character.toString('/')) 
		   ) )
					
				{
			         calculate.Calculation(Number.replaceAll("([-+*/%^()])", " $1 "));
				}
		
		 else
			{
				System.out.println("\nInvalid Input");
				BacktoBase();
			}
	}
	
	public void DecimaltoHex()
	{
		try
	    {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	    }
	    catch (Exception e)
	    {
	        System.out.println("\nError!!");
	    }
		
		System.out.println("\nDecimal to Hex");
		System.out.println("\nEnter Operation:");
		Scanner input = new Scanner(System.in);
		String Number = input.nextLine();
		
		if(Number.contains(Character.toString('.')))
		{
			System.out.println("\nFractional values are not allowed");
			BacktoBase();
		}
		
		if( (  Number.contains(Character.toString('0')) || Number.contains(Character.toString('1')) 
				   || Number.contains(Character.toString('2')) || Number.contains(Character.toString('3'))
				   || Number.contains(Character.toString('4')) || Number.contains(Character.toString('5'))
				   || Number.contains(Character.toString('6')) || Number.contains(Character.toString('7'))
				   || Number.contains(Character.toString('8')) || Number.contains(Character.toString('9'))) 
				   || (Number.contains(Character.toString('+'))|| Number.contains(Character.toString('-')) 
				   || Number.contains(Character.toString('*')) || Number.contains(Character.toString('/')) 
		   ) )
					
				{
			         calculate.Calculation(Number.replaceAll("([-+*/%^()])", " $1 "));
				}
			   
		 else
		 {
				System.out.println("\nInvalid Input");
				BacktoBase();
		 }
	}
	
	public void DecimaltoOctal()
	{
		try
	    {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	    }
	    catch (Exception e)
	    {
	        System.out.println("\nError!!");
	    }
		
		System.out.println("\nDecimal to Octal");
		System.out.println("\nEnter Operation:");
		Scanner input = new Scanner(System.in);
		String Number = input.nextLine();
		
		if(Number.contains(Character.toString('.')))
		{
			System.out.println("\nFractional values are not allowed");
			BacktoBase();
		}
		
		if( (  Number.contains(Character.toString('0')) || Number.contains(Character.toString('1')) 
				   || Number.contains(Character.toString('2')) || Number.contains(Character.toString('3'))
				   || Number.contains(Character.toString('4')) || Number.contains(Character.toString('5'))
				   || Number.contains(Character.toString('6')) || Number.contains(Character.toString('7'))
				   || Number.contains(Character.toString('8')) || Number.contains(Character.toString('9'))) 
				   || (Number.contains(Character.toString('+'))|| Number.contains(Character.toString('-')) 
				   || Number.contains(Character.toString('*')) || Number.contains(Character.toString('/')) 
		   ) )
					
				{
			             calculate.Calculation(Number.replaceAll("([-+*/%^()])", " $1 "));
				}
			   
		 else
		 {
			 System.out.println("\nInvalid Input");
			 BacktoBase();
		 }
	}
	
	public void BaseResult(double result)
	{
		if(Base.choice==1)
		{
			System.out.println("\nResult In Binary:"+Integer.toBinaryString((int)result));
			BacktoBase();
		}
		else if(Base.choice==2)
		{
			System.out.println("\nResult In Hex:"+Integer.toHexString((int)result));
			BacktoBase();
		}
		else if(Base.choice==3)
		{
			System.out.println("\nResult In Octal:"+Integer.toOctalString((int)result));
			BacktoBase();
		}
	}
	
	public void BacktoBase()
	{	
		System.out.println("\nWant to try Again(Y or y / N or n):");
		Scanner input = new Scanner(System.in);
		String decisn = input.nextLine();
		
		if(decisn.contains(Character.toString('Y')) || decisn.contains(Character.toString('y')))
			                                                                             ShowTitle();
		else if(decisn.contains(Character.toString('N')) || decisn.contains(Character.toString('n')))
                                                                                         Start.CalculatorMenu();
		else
			System.out.println("\nInvalid input");
		    BacktoBase();
	}
}
