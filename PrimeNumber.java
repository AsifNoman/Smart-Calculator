package SmartCalculator;
import java.util.*;

public class PrimeNumber extends Start {

	public void ShowTitle()
	{
		try
		{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			
			System.out.println("\n\t #### Prime Number Finder ####");
			System.out.println("\n1.Continue.");
			System.out.println("\n2.Back.");
			
			System.out.println("\nSelect any of these:");
			
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			
			if(choice==1)
			{
				PrimeFinder();
			}
			else if(choice==2)
			{
				Start.CalculatorMenu();
			}
			else
			{
				System.out.println("\nInvalid input");
				BacktoPrime();
			}
		}
		catch(Exception e)
		{
			System.out.println("\n Invalid!!!");
			BacktoPrime();
		}
	}
	
	public void PrimeFinder()
	{
		try
		{
			String  primeNumbers = "";
			int number = 0;
			int primecount = 0; 
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("\nFrom:");
			int firstNumber = input.nextInt();
			
			System.out.println("\nTo:");
			int lastNumber = input.nextInt();
			
			if( firstNumber < 0 || lastNumber < 0 )
			{
				System.out.println("\n your input numbers have to be greater or equal to 0 ");
				BacktoPrime();
			}
			
			else if( firstNumber < lastNumber)
			{
				for (int i = firstNumber; i <= lastNumber; i++)
				{
					int counter = 0;
					
					for(number =i; number>=1; number--)
					{
						if( i % number==0 )
						{
							counter = counter + 1;
						}
					}
					
					if (counter ==2)
					{
					    primeNumbers = primeNumbers + i + " ";
				        primecount++;
					}
				}
				
				System.out.println("\nTotal Prime Numbers:"+primecount);
			    System.out.println("\nPrime numbers from " + firstNumber + " to " + lastNumber + " are:");
			    System.out.println(primeNumbers);
			    BacktoPrime();
			}
			
			else if( firstNumber > lastNumber )
			{
				System.out.println("\n Second input has to be greater or equal to First Input");
				BacktoPrime();
			}
			
		}
		catch(Exception e)
		{
			System.out.println("\n Invalid!!!");
			BacktoPrime();
		}
	}
	
	public void BacktoPrime()
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
		    BacktoPrime();
	}
}
