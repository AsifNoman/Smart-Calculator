/*

 Clear Screen Reference : http://stackoverflow.com/questions/2979383/java-clear-the-console

*/

package SmartCalculator;
import java.util.*;

public abstract class Start {
	
	private static Start standard = new Standard();
	private static Start scientific = new Scientific();
	private static Start base = new Base();
	private static Start unit = new UnitConversion();
	private static Start equation = new Equation();
	private static Start prime = new PrimeNumber();
	private static Start age = new AgeCalculator();
	
	public static int choice;
	
	
	public static void CalculatorLoad()
	{
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t    Loading.....\n");
			for(int i=0;i<11;i++)
			{
				System.out.print("::::::::::");
				Thread.sleep(500);
			}
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.println("\nError !!");
		}
		CalculatorMenu();
	}
	
	public static void CalculatorMenu()
	{
		try
	    {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	    }
	    catch (Exception e)
	    {
	        System.out.println("\nError!!");
	    }
		
		System.out.println("\n\t #### Smart Calculator Menu ####");
		System.out.println("\n1.Standard Calculator.");
		System.out.println("\n2.Scientific Calculator.");
		System.out.println("\n3.Base Calculator.");
		System.out.println("\n4.Equation Calculator.");
		System.out.println("\n5.Unit Conversion.");
		System.out.println("\n6.Age Calculation.");
		System.out.println("\n7.Prime Number Find.");
		System.out.println("\n8.Exit.");
		
		System.out.println("\nSelect any of these:");
		
		try
		{
			Scanner input = new Scanner(System.in);
			choice = input.nextInt();
			
			if(choice==1)
			{
				standard.ShowTitle();
			}
			else if(choice==2)
			{
				scientific.ShowTitle();
			}
			else if(choice==3)
			{
				base.ShowTitle();
			}
			else if(choice==4)
			{
				equation.ShowTitle();
			}
			else if(choice==5)
			{
				unit.ShowTitle();
			}
			else if(choice==6)
			{
				age.ShowTitle();
			}
			else if(choice==7)
			{
				prime.ShowTitle();
			}
			else if(choice==8)
			{
				System.exit(0);
			}
			else
			{
				System.out.println("\nInvalid input");
				BacktoCalculatorMenu();
			}
		}
		catch(Exception e)
		{
			System.out.println("\n Invalid Input !!!");
			BacktoCalculatorMenu();
		}
	}
	
	
	public static void BacktoCalculatorMenu()
	{	
		System.out.println("\nWant to try Again(Y or y / N or n):");
		Scanner input = new Scanner(System.in);
		
		String decisn = input.nextLine();
		
		if(decisn.contains(Character.toString('Y')) || decisn.contains(Character.toString('y')))
			                                                                            CalculatorMenu();
		else if(decisn.contains(Character.toString('N')) || decisn.contains(Character.toString('n')))
                                                                                         System.exit(0);
		else
			System.out.println("\nInvalid input");
		    BacktoCalculatorMenu();
		
	}
	
	public abstract void ShowTitle();
}
