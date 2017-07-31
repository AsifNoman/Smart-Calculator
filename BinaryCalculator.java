package SmartCalculator;
import java.util.*;
import java.math.*;

public class BinaryCalculator extends Base{
	
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
		System.out.println("\t #### Binary Calculator ####");
		BinaryCalculation();
	}
	
	public void BinaryCalculation()
	{
		System.out.println("\nEnter 1st Binary Number:");
		Scanner input = new Scanner(System.in);
		String Number = input.nextLine();
		
		System.out.println("\nEnter 2nd Binary Number:");
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
				
				else if(   (  Number.contains(Character.toString('2')) || Number.contains(Character.toString('3'))
					  || Number.contains(Character.toString('4')) || Number.contains(Character.toString('5'))
					  || Number.contains(Character.toString('6')) || Number.contains(Character.toString('7'))
					  || Number.contains(Character.toString('8')) || Number.contains(Character.toString('9')) ) ||
					  
					  (  Number2.contains(Character.toString('2')) || Number2.contains(Character.toString('3'))
					     || Number2.contains(Character.toString('4')) || Number2.contains(Character.toString('5'))
					     || Number2.contains(Character.toString('6')) || Number2.contains(Character.toString('7'))
						 || Number2.contains(Character.toString('8')) || Number2.contains(Character.toString('9')) )
				  ) 
				{
					System.out.println("\nOnly 0 and 1 are allowed here");
					BacktoBase();
				}
				
			else if( ( Number.contains(Character.toString('0')) || Number.contains(Character.toString('1')) ) &&
					( Number2.contains(Character.toString('0')) || Number2.contains(Character.toString('1')) )
				  )
				{
					System.out.println("\nEnter an operator(ex: + - * /):");
					Scanner OperatorInput = new Scanner(System.in);
					String operator = OperatorInput.nextLine();
					
					int BinaryNumber=Integer.parseInt(Number,2);
					int BinaryNumber2=Integer.parseInt(Number2,2);
					
					try
					{
						if(operator.contains(Character.toString('+')))
						{
							int Result = BinaryNumber + BinaryNumber2;
							System.out.println("\n"+Integer.toBinaryString(Result));
							AgainBinaryCalculation(Result);
						}
						else if(operator.contains(Character.toString('-')))
						{
							int Result = BinaryNumber - BinaryNumber2;
							System.out.println("\n"+Integer.toBinaryString(Result));
							AgainBinaryCalculation(Result);
						}
						else if(operator.contains(Character.toString('*')))
						{
							int Result = BinaryNumber * BinaryNumber2;
							System.out.println("\n"+Integer.toBinaryString(Result));
							AgainBinaryCalculation(Result);
						}
						else if(operator.contains(Character.toString('/')))
						{
							int Result = BinaryNumber / BinaryNumber2;
							System.out.println("\n"+Integer.toBinaryString(Result));
							AgainBinaryCalculation(Result);
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
				 else
				 {
					 System.out.println("\nInvalid Input");
					 BacktoBase();
				 }
		}
		catch(Exception e)
		{
			System.out.println("\n Error !!!");
			BacktoBase();
			
		}
		
		
	}
	
	public void AgainBinaryCalculation(int BinaryNumber)
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
					Scanner BinaryInput = new Scanner(System.in);
					String AnotherBinary = BinaryInput.nextLine();
					
					try
				    {
						new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						System.out.println("\t #### Binary Calculator ####");
				    }
				    catch (Exception e)
				    {
				        System.out.println("\nError!!");
				    }
					
					int AnotherBinaryNumber = Integer.parseInt(AnotherBinary,2);
					
					if(operator.contains(Character.toString('+')))
					{
						BinaryNumber = BinaryNumber + AnotherBinaryNumber;
						System.out.println("\n"+Integer.toBinaryString(BinaryNumber));
					}
					else if(operator.contains(Character.toString('-')))
					{
						BinaryNumber = BinaryNumber - AnotherBinaryNumber;
						System.out.println("\n"+Integer.toBinaryString(BinaryNumber));
					}
					else if(operator.contains(Character.toString('*')))
					{
						BinaryNumber = BinaryNumber * AnotherBinaryNumber;
						System.out.println("\n"+Integer.toBinaryString(BinaryNumber));
					}
					else if(operator.contains(Character.toString('/')))
					{
						BinaryNumber = BinaryNumber / AnotherBinaryNumber;
						System.out.println("\n"+Integer.toBinaryString(BinaryNumber));
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
