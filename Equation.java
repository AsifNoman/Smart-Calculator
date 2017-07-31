package SmartCalculator;
import java.util.Scanner;

public class Equation extends Start{
	
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
		
		System.out.println("\n\t #### Equation Calculator ####");
		System.out.println("\n1.ax+by=c");
		System.out.println("\n2.ax^2+by+c=0");
		System.out.println("\n3.ax+by+cz=d");
		System.out.println("\n4.Back");
		
		System.out.println("\nSelect any of these:");
		
		try
		{
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			
			if(choice==1)
			{
				Equation_axbyc();
			}
			else if(choice==2)
			{
				Equation_ax2byc();
			}
			else if(choice==3)
			{
				Equation_axbyczd();
			}
			else if(choice==4)
			{
				Start.CalculatorMenu();
			}
			else
			{
				System.out.println("\nInvalid input");
				BacktoEquation();
			}
		}
		catch(Exception e)
		{
			System.out.println("\nInvalid Input !!!");
			BacktoEquation();
		}
	}
	
	
	public void Equation_axbyc()
	{
		try
		{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			
			System.out.println("\n\t #### Equation Calculator ####");
			
			System.out.println("\nEquation Type:ax+by=c");
			
			System.out.println("\nFirst Equation values:");
			
			System.out.println("\nEnter the value of a1:");
			Scanner input = new Scanner(System.in);
			double a1 = input.nextDouble();
			
			System.out.println("\nEnter the value of b1:");
			double b1 = input.nextDouble();
			
			System.out.println("\nEnter the value of c1:");
			double c1 = input.nextDouble();
			
            System.out.println("\nSecond Equation values:");
			
			System.out.println("\nEnter the value of a2:");
			double a2 = input.nextDouble();
			
			System.out.println("\nEnter the value of b2:");
			double b2 = input.nextDouble();
			
			System.out.println("\nEnter the value of c2:");
			double c2 = input.nextDouble(); 
			
			double valueof_b = a2*(a1+b1) - (a1*(a2+b2));
			double valueof_c = (a2*c1) - (a1*c2);
				
			double valueof_y = valueof_c / valueof_b;
				
			double valueof_x = (c1 - (b1*valueof_y))/a1;
				
			System.out.println("\nThe Result is:\n" + "X: "+ valueof_x + " Y: "+valueof_y);
			BacktoEquation();
		}
		catch(Exception e)
		{
			System.out.println("\n Error!!");
			BacktoEquation();
		}
	}
	
	
	public void Equation_ax2byc()
	{	
		try
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			
			System.out.println("\n\t #### Equation Calculator ####");
			
			System.out.println("\nEquation Type:ax^2+by+c=0");
			
			System.out.println("\nEnter the value of a:");
			Scanner input = new Scanner(System.in);
			double a = input.nextDouble();
			
			System.out.println("\nEnter the value of b:");
			double b = input.nextDouble();
			
			System.out.println("\nEnter the value of c:");
			double c = input.nextDouble();
			
			
			double squareRootpart = (b*b) - (4*a*c);
			
			if(squareRootpart<0)
			{
				squareRootpart = Math.abs(squareRootpart);
				
				double positiveX = ( - b + Math.sqrt(squareRootpart) ) / (2*a) ;
				double NegativeX = ( - b - Math.sqrt(squareRootpart) ) / (2*a) ;
				
				System.out.println("\nThe result is:\n\n"+"X="+positiveX+"i , X="+NegativeX+"i");
				BacktoEquation();
			}
			
			else
			{
				double positiveX = ( - b + Math.sqrt(squareRootpart) ) / (2*a) ;
				double NegativeX = ( - b - Math.sqrt(squareRootpart) ) / (2*a) ;
				
				System.out.println("\nThe result is:\n\n"+"X="+positiveX+" , X="+NegativeX);
				BacktoEquation();
			}
		}
		catch(Exception e)
		{
			System.out.println("\n Error!!");
			BacktoEquation();
		}
	}
	
	
	public void Equation_axbyczd()
	{
		try
		{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			
			System.out.println("\n\t #### Equation Calculator ####");
			
			System.out.println("\nEquation Type:ax+by+cz=d");
			
			System.out.println("\nFirst Equation values:");
			
			System.out.println("\nEnter the value of a1:");
			Scanner input = new Scanner(System.in);
			double a1 = input.nextDouble();
			
			System.out.println("\nEnter the value of b1:");
			double b1 = input.nextDouble();
			
			System.out.println("\nEnter the value of c1:");
			double c1 = input.nextDouble();
			
			System.out.println("\nEnter the value of d1:");
			double d1 = input.nextDouble();
			
            System.out.println("\nSecond Equation values:");
			
			System.out.println("\nEnter the value of a2:");
			double a2 = input.nextDouble();
			
			System.out.println("\nEnter the value of b2:");
			double b2 = input.nextDouble();
			
			System.out.println("\nEnter the value of c2:");
			double c2 = input.nextDouble(); 
			
			System.out.println("\nEnter the value of d2:");
			double d2 = input.nextDouble(); 
			
           System.out.println("\nThird Equation values:");
			
			System.out.println("\nEnter the value of a3:");
			double a3 = input.nextDouble();
			
			System.out.println("\nEnter the value of b3:");
			double b3 = input.nextDouble();
			
			System.out.println("\nEnter the value of c3:");
			double c3 = input.nextDouble(); 
			
			System.out.println("\nEnter the value of d3:");
			double d3 = input.nextDouble(); 
			
			double equation1 = ( a1*( (b2*c3) - (b3*c2) ) ) - ( b1*( (a2*c3)- (a3*c2) ) ) + ( c1*( (a2*b3) - (a3*b2) ) );
			
			double equationX = ( d1*( (b2*c3) - (b3*c2) ) ) - ( b1*( (d2*c3)- (d3*c2) ) ) + ( c1*( (d2*b3) - (b2*d3) ) );
			
			double equationY = ( a1*( (d2*c3) - (d3*c2) ) ) - ( d1*( (a2*c3) - (a3*c2) ) ) + ( c1*( (a2*d3) - (a3*d2) ) );
			
			double equationZ = ( a1*( (b2*d3) - (b3*d2) ) ) - ( b1*( (a2*d3)- (a3*d2) ) ) + ( d1*( (a2*b3) - (a3*b2) ) );
			
			double valueX = equationX / equation1;
			
			double valueY = equationY / equation1;
			
			double valueZ = equationZ / equation1;
			
			
			System.out.println("\nThe result is:\n\n"+"X="+valueX+" , Y="+valueY+" , Z="+valueZ);
			BacktoEquation();
		}
		catch(Exception e)
		{
			System.out.println("\n Error!!");
			BacktoEquation();
		}
	}
	
	
	public void BacktoEquation()
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
		    BacktoEquation();
	}

}
