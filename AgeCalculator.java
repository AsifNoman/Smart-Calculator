package SmartCalculator;

import java.util.*;

public class AgeCalculator extends Start{
	
	public void ShowTitle()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\t #### Age Calculator ####");
			System.out.println("\n1.Continue.");
			System.out.println("\n2.Back.");
			
			System.out.println("\nSelect any of these:");
			
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			
			if(choice==1)
			{
				YearMonth();
			}
			else if(choice==2)
			{
				Start.CalculatorMenu();
			}
			else
			{
				System.out.println("\nInvalid input");
				BacktoAge();
			}
		}
		catch(Exception e)
		{
			System.out.println("\n Invalid Input");
			BacktoAge();
		}
	}
	
	public void AgeCalculation(int byear,int bmonth,int cyear,int cmonth)
	{
		try
		{
			int birthmonth,birthyear;
			int currentmonth,currentyear;
			int agey,agem;
			
			birthyear = byear;
			birthmonth = bmonth;
			currentyear = cyear;
			currentmonth = cmonth;
			
			if( cyear < byear )
			{
				System.out.println("\nWrong Input, Birth year needs to be earlier than current date.\n");
				BacktoAge();
			}
			
			if( currentmonth < birthmonth )
			{
			    agem=currentmonth+12-birthmonth;
			    currentyear=currentyear-1;
			    agey=currentyear-birthyear;
			}
			else
			{
				agem=currentmonth-birthmonth;
			    agey=currentyear-birthyear;
			}
			
			System.out.println("\n\n\t\tYour Age is " + agey + " Years And " + agem + " Months \n\n");
			BacktoAge();
		}
		catch(Exception e)
		{
			System.out.println("\n Invalid Input");
			BacktoAge();
		}

	}
	
	public void YearMonth()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\t #### Age Calculator ####");
			
			 System.out.println("\nEnter Your Birth Year (Eg:1994):");
			 Scanner input = new Scanner(System.in);
			 int birthyear = input.nextInt();
			 
			 System.out.println("\nEnter Your Birth Month (Eg:2):");
			 int birthmonth = input.nextInt();
			 
			 System.out.println("\nEnter Current Year (Eg:2016):");
			 int currentyear = input.nextInt();
			 
			 System.out.println("\nEnter Current Month (Eg:2):");
			 int currentmonth = input.nextInt();
			 
			 if( (birthyear < 1 || birthyear > 9999) || (currentyear < 1 || currentyear > 9999) )
			 {
				 System.out.println("\nWrong Input of Year\n");
				 YearMonth();
			 }
			 
			 if( (birthmonth < 1 || birthmonth > 12) || (currentmonth < 1 || currentmonth > 9999) )
			 {
				 System.out.println("\nWrong Input of Month\n");
				 YearMonth();
			 }
			 
			 else
			 {
				  AgeCalculation(birthyear,birthmonth,currentyear,currentmonth);
			 }
			 
		}
		catch(Exception e)
		{
			System.out.println("\n Invalid input!!!");
			BacktoAge();
		}
	}
	
	public void BacktoAge()
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
		    BacktoAge();
	}
}
