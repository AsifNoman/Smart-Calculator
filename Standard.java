package SmartCalculator;
import java.util.*;
import java.math.*;

public class Standard extends Start{
	
	private Calculate calculate = new Calculate();
	
	public void ShowTitle()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			
			System.out.println("\n\t #### Standard Calculator ####");
			System.out.println("\n1.Calculation.");
			System.out.println("\n2.Back.");
			
			System.out.println("\nSelect any of these:");
			
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			
			if(choice==1)
			{
				StandardCalculation();
			}
			else if(choice==2)
			{
				Start.CalculatorMenu();
			}
			else
			{
				System.out.println("\nInvalid input");
				BacktoStandard();
			}
		}
		catch(Exception e)
		{
			System.out.println("\nInvalid Input !!!");
			BacktoStandard();
		}
	}
	
	
	public void StandardCalculation()
	{
		try
	    {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	    }
	    catch (Exception e)
	    {
	        System.out.println("\nError!!");
	    }
		
		System.out.println("\n\t #### Standard Calculator ####");
		System.out.println("\nEnter an Operation:");
		Scanner input = new Scanner(System.in);
		String number = input.nextLine();
			
			if ( number.contains(Character.toString('(')) || number.contains(Character.toString(')')) || number.contains(Character.toString('^')) )
			{
				System.out.println("\nParanthesis and Square features are available in Scientific mode");
				BacktoStandard();
			}
			
			else if( ( number.contains(Character.toString('0')) || number.contains(Character.toString('1')) 
			   || number.contains(Character.toString('2')) || number.contains(Character.toString('3'))
			   || number.contains(Character.toString('4')) || number.contains(Character.toString('5'))
			   || number.contains(Character.toString('6')) || number.contains(Character.toString('7'))
			   || number.contains(Character.toString('8')) || number.contains(Character.toString('9'))
			   || number.contains(Character.toString('.')) ) && (number.contains(Character.toString('+'))
			   || number.contains(Character.toString('-')) || number.contains(Character.toString('*'))
			   || number.contains(Character.toString('/')) || number.contains(Character.toString('%'))
			       ) )
				
			{
				calculate.Calculation(number.replaceAll("([-+*/%])", " $1 "));
			}
			
			else
			{
				System.out.println("\nInvalid Input");
				BacktoStandard();
			}
    }
	
	
	public void StandardResultPrint(double result)
	{
		try
	    {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	    }
	    catch (Exception e)
	    {
	        System.out.println("\nError!!");
	    }
		System.out.println("\n\t #### Standard Calculator ####");
		System.out.println("\n"+result);
		AgainStandardCalculation(result);
	}
	
	
	public void AgainStandardCalculation(double result)
	{
		String Result = Double.toString(result);
		
		Scanner input = new Scanner(System.in);
		String number = input.nextLine();
		
		char[] CharResult = number.toCharArray();
		StringBuffer MoreInput = new StringBuffer();
		
		try
		{
				for (int i = 0; i < CharResult.length;i++)
				 {
						MoreInput.append(CharResult[i]);
				 }
				 
				 for(;;)
				 {
					 if( MoreInput.toString().contains(Character.toString('e')) ||  MoreInput.toString().contains(Character.toString('E')) )
					 {
						 BacktoStandard();
					 }
					 else if ( MoreInput.toString().contains(Character.toString('(')) || MoreInput.toString().contains(Character.toString(')')) || MoreInput.toString().contains(Character.toString('^')) )
						{
							System.out.println("\nParanthesis and Square features are available in Scientific mode");
							BacktoStandard();
						}
					 else
					 {
						 calculate.Calculation(Result.concat(MoreInput.toString()).replaceAll("([-+*/%])", " $1 "));
					 }
				 }
		}
		catch(Exception e)
		{
			System.out.println("\n Error !!!");
			Start.BacktoCalculatorMenu();
		}
		
	}
	
	
	public void BacktoStandard()
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
		    BacktoStandard();
	}

}
 