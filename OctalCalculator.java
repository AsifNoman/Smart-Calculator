package SmartCalculator;
import java.util.*;
import java.math.*;

public class OctalCalculator extends Base{
	
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
		System.out.println("\t #### Octal Calculator ####");
		OctalCalculation();
	}
	
	public void OctalCalculation()
	{
		System.out.println("\nEnter 1st Octal Number:");
		Scanner input = new Scanner(System.in);
		String Number = input.nextLine();
		
		System.out.println("\nEnter 2nd Octal Number:");
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
					
					int OctalNumber=Integer.parseInt(Number,8);
					int OctalNumber2=Integer.parseInt(Number2,8);
					
					try
					{
						if(operator.contains(Character.toString('+')))
						{
							int Result = OctalNumber + OctalNumber2;
							System.out.println("\n"+Integer.toOctalString(Result));
							AgainOctalCalculation(Result);
						}
						else if(operator.contains(Character.toString('-')))
						{
							int Result = OctalNumber - OctalNumber2;
							System.out.println("\n"+Integer.toOctalString(Result));
							AgainOctalCalculation(Result);
						}
						else if(operator.contains(Character.toString('*')))
						{
							int Result = OctalNumber * OctalNumber2;
							System.out.println("\n"+Integer.toOctalString(Result));
							AgainOctalCalculation(Result);
						}
						else if(operator.contains(Character.toString('/')))
						{
							int Result = OctalNumber / OctalNumber2;
							System.out.println("\n"+Integer.toOctalString(Result));
							AgainOctalCalculation(Result);
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
	
	public void AgainOctalCalculation(int OctalNumber)
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
					Scanner OctInput = new Scanner(System.in);
					String AnotherOct = OctInput.nextLine();
					
					try
				    {
						new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
						System.out.println("\t #### Octal Calculator ####");
				    }
				    catch (Exception e)
				    {
				        System.out.println("\nError!!");
				    }
					
					int AnotherOctNumber = Integer.parseInt(AnotherOct,8);
					
					if(operator.contains(Character.toString('+')))
					{
						OctalNumber = OctalNumber + AnotherOctNumber;
						System.out.println("\n"+Integer.toOctalString(OctalNumber));
					}
					else if(operator.contains(Character.toString('-')))
					{
						OctalNumber = OctalNumber - AnotherOctNumber;
						System.out.println("\n"+Integer.toOctalString(OctalNumber));
					}
					else if(operator.contains(Character.toString('*')))
					{
						OctalNumber = OctalNumber * AnotherOctNumber;
						System.out.println("\n"+Integer.toOctalString(OctalNumber));
					}
					else if(operator.contains(Character.toString('/')))
					{
						OctalNumber = OctalNumber / AnotherOctNumber;
						System.out.println("\n"+Integer.toOctalString(OctalNumber));
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
