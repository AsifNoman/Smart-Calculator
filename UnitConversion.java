package SmartCalculator;
import java.util.*;

public class UnitConversion extends Start{
	
	private static Angle angle = new Angle();
	private static Area area = new Area();
	private static Temperature temp = new Temperature();
	private static Energy energy = new Energy();

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
		
		System.out.println("\t #### Unit Conversion ####");
		System.out.println("\n1.Angle.");
		System.out.println("\n2.Area.");
		System.out.println("\n3.Temperature.");
		System.out.println("\n4.Energy.");
		System.out.println("\n5.Back.");
		
		System.out.println("\nSelect any of these:");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		try
		{
			if(choice==1)
			{
				angle.Show();
			}
			else if(choice==2)
			{
				area.Show();
			}
			else if(choice==3)
			{
				temp.Show();
			}
			else if(choice==4)
			{
				energy.Show();
			}
			else if(choice==5)
			{
				Start.CalculatorMenu();
			}
			else
			{
				System.out.println("\nInvalid input");
			    BacktoUnitConversion();
			}
		}
		catch(Exception e)
		{
			System.out.println("\nInvalid Input !!!");
			BacktoUnitConversion();
		}
	}
	
	public void BacktoUnitConversion()
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
		    BacktoUnitConversion();
	}
}
