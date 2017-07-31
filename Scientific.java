package SmartCalculator;
import java.util.*;
import java.math.*;

public class Scientific extends Start{
	
	private Calculate calculate = new Calculate();
	private double number;
	
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
		
		System.out.println("\t #### Scientific Calculator ####");
		System.out.println("\n1.General Calculation.");
		System.out.println("\n2.Advanced Calculation.");
		System.out.println("\n3.Back.");
		
		System.out.println("\nSelect any of these:");
		
		try
		{
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			
			if(choice==1)
			{
				GeneralCalculationPermission();
			}
			else if(choice==2)
			{
				AdvancedCalculation();
			}
			else if(choice==3)
			{
				Start.CalculatorMenu();
			}
			else
			{
				System.out.println("\nInvalid input");
				BacktoScientific();
			}
		}
		catch(Exception e)
		{
			System.out.println("\nInvalid Input !!!");
			BacktoScientific();
		}
	}
	
	public void GeneralCalculationPermission()
	{
		try
	    {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	    }
	    catch (Exception e)
	    {
	        System.out.println("\nError!!");
	    }
		
		System.out.println("\nGeneral Calculation");
		System.out.println("\n1.Continue.");
		System.out.println("\n2.Back.");
		
		System.out.println("\nSelect any of these:");
		
		try
		{
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			
			if(choice==1)
			{
				GeneralCalculation();
			}
			else if(choice==2)
			{
				ShowTitle();
			}
			else
			{
				System.out.println("\nInvalid input");
				BacktoScientific();
			}
		}
		catch(Exception e)
		{
			System.out.println("\nInvalid Input !!!");
			BacktoScientific();
		}
		
	}
	
	public void GeneralCalculation()
	{
		try
	    {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	    }
	    catch (Exception e)
	    {
	        System.out.println("\nError!!");
	    }
		
		System.out.println("\nGeneral Calculation");
		System.out.println("\nEnter Operation:");
		Scanner input = new Scanner(System.in);
		String Number = input.nextLine();
			
		   if( (  Number.contains(Character.toString('0')) || Number.contains(Character.toString('1')) 
			   || Number.contains(Character.toString('2')) || Number.contains(Character.toString('3'))
			   || Number.contains(Character.toString('4')) || Number.contains(Character.toString('5'))
			   || Number.contains(Character.toString('6')) || Number.contains(Character.toString('7'))
			   || Number.contains(Character.toString('8')) || Number.contains(Character.toString('9'))
			   || Number.contains(Character.toString('.')) ) && (Number.contains(Character.toString('+'))
			   || Number.contains(Character.toString('-')) || Number.contains(Character.toString('*'))
			   || Number.contains(Character.toString('/')) || Number.contains(Character.toString('%'))
			   || Number.contains(Character.toString('^'))
			       ) )
				
			{
				calculate.Calculation(Number.replaceAll("([-+*/%^()])", " $1 "));
			}
		   
			else
			{
				System.out.println("\nInvalid Input");
				BacktoScientific();
			}
    }
	
	
	public void AdvancedCalculation()
	{
		try
	    {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	    }
	    catch (Exception e)
	    {
	        System.out.println("\nError!!");
	    }
		
		System.out.println("\nAdvanced Calculation");
		System.out.println("\nChoose an operation:");
		System.out.println("\n1.Root");
		System.out.println("\n2.Sin");
		System.out.println("\n3.Sinh");
		System.out.println("\n4.Cos");
		System.out.println("\n5.Cosh");
		System.out.println("\n6.tan");
		System.out.println("\n7.tanh");
		System.out.println("\n8.log");
		System.out.println("\n9.Factorial");
		System.out.println("\n10.nCr");
		System.out.println("\n11.nPr");
		System.out.println("\n12.Back");
		System.out.println("\nSelect:->>");
		
		try
		{
			Scanner op = new Scanner(System.in);
			int operation = op.nextInt();
			
			
			if(operation==10 || operation==11)
			{
				int nfactorial = 1;
				int rfactorial = 1;
				int nrfactorial = 1;
				
				System.out.println("\nEnter the value of n:");
				int n = op.nextInt();
				
				System.out.println("\nEnter the value of r:");
				int r = op.nextInt();
				
				for(int i=1;i<=n;i++)
				{
					nfactorial=nfactorial*i;
				}
				
				for(int i=1;i<=r;i++)
				{
					rfactorial=rfactorial*i;
				}
				
				for(int i=1;i<=n-r;i++)
				{
					nrfactorial=nrfactorial*i;
				}
				
				if(operation==10)
				{
					if( n < 0 || r < 0)
					{
						System.out.println("\nNegative value is not allowed");
						BacktoScientific();
					}
					
					else if(n > r || n==r)
					{
						int nCr = (nfactorial) / ( nrfactorial * rfactorial );
						System.out.println("\n"+nCr);
						AgainAdvancedCalculation(Integer.toString(nCr));
					}
					else if(n < r)
					{
						System.out.println("\nValue of n has to be greater than or equal to value of r");
						BacktoScientific();
					}
				}
				else if(operation==11)
				{
					if( n < 0 || r < 0)
					{
						System.out.println("\nNegative value is not allowed");
						BacktoScientific();
					}
					else if(n > r || n==r)
					{
						int nPr = (nfactorial) / (nrfactorial);
						System.out.println("\n"+nPr);
						AgainAdvancedCalculation(Integer.toString(nPr));
					}
					else if(n < r)
					{
						System.out.println("\nValue of n has to be greater than or equal to value of r");
						BacktoScientific();
					}
				}
			}
			
			else if(operation==12)
			{
					ShowTitle();
			}
			
			else if(operation > 12)
			{
				System.out.println("\nInvalid Input");
				BacktoScientific();
			}
			
			System.out.println("\nEnter Number:");
			Scanner input = new Scanner(System.in);
			String Number = input.nextLine();
				
			   if( (  Number.contains(Character.toString('0')) || Number.contains(Character.toString('1')) 
				   || Number.contains(Character.toString('2')) || Number.contains(Character.toString('3'))
				   || Number.contains(Character.toString('4')) || Number.contains(Character.toString('5'))
				   || Number.contains(Character.toString('6')) || Number.contains(Character.toString('7'))
				   || Number.contains(Character.toString('8')) || Number.contains(Character.toString('9'))
				   || Number.contains(Character.toString('.'))) )
					
				{
				   number = Double.parseDouble(Number);
				   
					if(operation==1)
					{
						System.out.println("\n"+Math.sqrt(number));
						AgainAdvancedCalculation(Double.toString(Math.sqrt(number)));
					}
					
					else if(operation==2)
					{
						System.out.println("\n"+Math.sin(number));
						AgainAdvancedCalculation(Double.toString(Math.sin(number)));
					}
					else if(operation==3)
					{
						System.out.println("\n"+Math.sinh(number));
						AgainAdvancedCalculation(Double.toString(Math.sinh(number)));
					}
					else if(operation==4)
					{
						System.out.println("\n"+Math.cos(number));
						AgainAdvancedCalculation(Double.toString(Math.cos(number)));
					}
					else if(operation==5)
					{
						System.out.println("\n"+Math.cosh(number));
						AgainAdvancedCalculation(Double.toString(Math.cosh(number)));
					}
					else if(operation==6)
					{
						System.out.println("\n"+Math.tan(number));
						AgainAdvancedCalculation(Double.toString(Math.tanh(number)));
					}
					else if(operation==7)
					{
						System.out.println("\n"+Math.tanh(number));
						AgainAdvancedCalculation(Double.toString(Math.tanh(number)));
					}
					else if(operation==8)
					{
						System.out.println("\n"+Math.log10(number));
						AgainAdvancedCalculation(Double.toString(Math.log10(number)));
					}
					else if(operation==9)
					{
						if(Number.contains(Character.toString('.')))
						{
							System.out.println("\nMath Error!!");
							BacktoScientific();
						}
						if(number < 0)
						{
							System.out.println("\nNumber have to be greater than or equal to 0");
							BacktoScientific();
						}
						else
						{
							int factorial = 1;
							
							for(int i=1;i<=number;i++)
							{
								factorial=factorial*i;
							}
							
							System.out.println("\n"+factorial);
							AgainAdvancedCalculation(Double.toString(factorial));
						}
					}
					
					else
					{
						System.out.println("\nInvalid Input");
						BacktoScientific();
					}
				}
				
				else
				{
					System.out.println("\nInvalid Input");
					BacktoScientific();
				}
		}
		catch(Exception e)
		{
			System.out.println("\n Invalid Input !!!");
			BacktoScientific();
		}
		
		
	}
	
	
	public void AgainAdvancedCalculation(String string)
	{	
		Scanner se = new Scanner(System.in);
		String stringExtend = se.nextLine();
		
		string = string.concat(stringExtend);
		
		if( ( string.contains(Character.toString('0')) || string.contains(Character.toString('1')) 
				   || string.contains(Character.toString('2')) || string.contains(Character.toString('3'))
				   || string.contains(Character.toString('4')) || string.contains(Character.toString('5'))
				   || string.contains(Character.toString('6')) || string.contains(Character.toString('7'))
				   || string.contains(Character.toString('8')) || string.contains(Character.toString('9'))
				   || string.contains(Character.toString('.')) ) && ( string.contains(Character.toString('+'))
				   || string.contains(Character.toString('-')) || string.contains(Character.toString('*'))
				   || string.contains(Character.toString('/')) || string.contains(Character.toString('%'))
				   || string.contains(Character.toString('^'))
				       ) )
					
				{
					calculate.Calculation(string.replaceAll("([-+*/%^()])", " $1 "));
				}
		
		else if(string.contains(Character.toString('e')))
		{
			BacktoScientific();
		}
		
		else
		{
			System.out.println("\nInvalid Input");
			BacktoScientific();
		}
	}
	
	
	public void ScientificResultPrint(double result)
	{
		try
	    {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	    }
	    catch (Exception e)
	    {
	        System.out.println("\nError!!");
	    }
		System.out.println("\t #### Scientific Calculator ####");
		System.out.println("\n"+result);
		AgainScientificCalculation(result);
	}
	
	
	public void AgainScientificCalculation(double result)
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
						BacktoScientific();
					 }
					 else
					 {
						 calculate.Calculation(Result.concat(MoreInput.toString().replaceAll("([-+*/%^()])", " $1 ")));
					 }
				 }
		}
		catch(Exception e)
		{
			System.out.println("\n Error !!!");
			Start.BacktoCalculatorMenu();
		}
		
	}
	
	
	public void BacktoScientific()
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
		    BacktoScientific();
	}

}
