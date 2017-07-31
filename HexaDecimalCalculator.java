package SmartCalculator;
import java.util.*;
import java.math.*;

public class HexaDecimalCalculator extends Base{

	public void ShowName()
	{
		try
	    {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	    }
	    catch (Exception e)
	    {
	        System.out.println("\nError!!");
	    }
		System.out.println("\t #### HexaDecimal Calculator ####");
		HexaDecimalCalculation();
	}
	
	public void HexaDecimalCalculation()
	{
		System.out.println("\nEnter 1st HexaDecimal Number:");
		Scanner input = new Scanner(System.in);
		String Number = input.nextLine();
		
		System.out.println("\nEnter 2nd HexaDecimal Number:");
		Scanner input2 = new Scanner(System.in);
		String Number2 = input2.nextLine();
		
		try
		{
			if( ( Number.contains(Character.toString('.')) || Number.contains(Character.toString('(')) || Number.contains(Character.toString(')')) ) ||
				    ( Number2.contains(Character.toString('.')) || Number2.contains(Character.toString('(')) || Number2.contains(Character.toString(')')) )
				  )
				{
				     System.out.println("\nInvalid input!!!");
					BacktoBase();
				}
				
					System.out.println("\nEnter an operator(ex: + - * /):");
					Scanner OperatorInput = new Scanner(System.in);
					String operator = OperatorInput.nextLine();
					
					int HexaDecimalNumber=Integer.parseInt(Number,16);
					int HexaDecimalNumber2=Integer.parseInt(Number2,16);
					
					try
					{
						if(operator.contains(Character.toString('+')))
						{
							int Result = HexaDecimalNumber + HexaDecimalNumber2;
							System.out.println("\n"+Integer.toHexString(Result));
							AgainHexCalculation(Result);
						}
						else if(operator.contains(Character.toString('-')))
						{
							int Result = HexaDecimalNumber - HexaDecimalNumber2;
							System.out.println("\n"+Integer.toHexString(Result));
							AgainHexCalculation(Result);
						}
						else if(operator.contains(Character.toString('*')))
						{
							int Result = HexaDecimalNumber * HexaDecimalNumber2;
							System.out.println("\n"+Integer.toHexString(Result));
							AgainHexCalculation(Result);
						}
						else if(operator.contains(Character.toString('/')))
						{
							int Result = HexaDecimalNumber / HexaDecimalNumber2;
							System.out.println("\n"+Integer.toHexString(Result));
							AgainHexCalculation(Result);
						}
						else
						{
							System.out.println("\nInvalid Input");	
							BacktoBase();
						}
					}
					catch(Exception e)
					{
						System.out.println("\nError!!!");
						BacktoBase();
					}
		}
		catch(Exception e)
		{
			System.out.println("\n Error !!!");
			BacktoBase();
		}
		
		
	}
	
	public void AgainHexCalculation(int HexNumber)
	{	
		for(;;)
		{
			Scanner OperatorInput = new Scanner(System.in);
			String  operator = OperatorInput.nextLine();
			
			try
			{	
				if( operator.contains(Character.toString('E')) || operator.contains(Character.toString('e')) )
				{
					BacktoBase();
				}
				
		   else if(operator.contains(Character.toString('+')) || operator.contains(Character.toString('-')) ||
				   operator.contains(Character.toString('*')) || operator.contains(Character.toString('/'))
				  )
				{
					Scanner HexInput = new Scanner(System.in);
					String AnotherHex = HexInput.nextLine();
					
					try
				    {
						new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						System.out.println("\t #### HexaDecimal Calculator ####");
				    }
				    catch (Exception e)
				    {
				        System.out.println("\nError!!");
				    }
					
					int AnotherHexNumber = Integer.parseInt(AnotherHex,16);
					
					if(operator.contains(Character.toString('+')))
					{
						HexNumber = HexNumber + AnotherHexNumber;
						System.out.println("\n"+Integer.toHexString(HexNumber));
					}
					else if(operator.contains(Character.toString('-')))
					{
						HexNumber = HexNumber - AnotherHexNumber;
						System.out.println("\n"+Integer.toHexString(HexNumber));
					}
					else if(operator.contains(Character.toString('*')))
					{
						HexNumber = HexNumber * AnotherHexNumber;
						System.out.println("\n"+Integer.toHexString(HexNumber));
					}
					else if(operator.contains(Character.toString('/')))
					{
						HexNumber = HexNumber / AnotherHexNumber;
						System.out.println("\n"+Integer.toHexString(HexNumber));
					}
					else
					{
						System.out.println("\nInvalid Input");
						BacktoBase();	
					}
				}
				
				else
				{
					System.out.println("\nInvalid Input");
					BacktoBase();	
				}
			}
			catch(Exception e)
			{
				System.out.println("\nError!!");
				BacktoBase();
			}
		}
	}
}
