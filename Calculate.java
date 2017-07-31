/*


Reference: 1.https://drive.google.com/file/d/0B899y6CQKvp8cEU5MENHbWFxeWc/view?ts=57129d1e
           2.https://drive.google.com/file/d/0B899y6CQKvp8dEZOUVlzTktHeDA/view?ts=57129d1e

*/

package SmartCalculator;
import java.util.*;
import java.math.*;

public class Calculate{
	
	private static Standard standard = new Standard();
	private static Scientific scientific = new Scientific();
	private static Base base = new Base();
	private double result;
	
	public double Calculation(String operation)
    {
       char[] InputOperation = operation.toCharArray(); 
       Stack<Double> number = new Stack<Double>();
       Stack<Character> operator = new Stack<Character>();
       
       try
       {
    	   for (int i = 0; i < InputOperation.length; i++)
           {
               if (InputOperation[i] == ' ')
                            continue;
               
               if (InputOperation[i] >= '0' && InputOperation[i] <= '9' || InputOperation[i] == '.')
               {
                     StringBuffer MoreInput = new StringBuffer();
                          
                     while(i < InputOperation.length && (InputOperation[i] >= '0' && InputOperation[i] <= '9' || InputOperation[i]=='.'))
                     {
                        		MoreInput.append(InputOperation[i++]);
                     }
                               number.push(Double.parseDouble(MoreInput.toString()));
                     
                   }
               	
                   else if (InputOperation[i] == '(')
                   {
                   	 operator.push(InputOperation[i]);
                   }
           
                   else if (InputOperation[i] == ')')
                   {
                       while (operator.peek() != '(')
                       {
                       	 number.push(permittedOperator(operator.pop(), number.pop(), number.pop()));
                       }
                            operator.pop();
                   }
        
                 
                   else if (InputOperation[i] == '+' || InputOperation[i] == '-' || InputOperation[i] == '*' || InputOperation[i] == '/' || InputOperation[i] == '^' || InputOperation[i] == '%')
                   {
                       while (!operator.empty() && OperatorRank(InputOperation[i], operator.peek()))
                       {
                       	number.push(permittedOperator(operator.pop(), number.pop(), number.pop()));
                       }
                           operator.push(InputOperation[i]);
                   }
               }
    
           while (!operator.empty())
           {
           	 number.push(permittedOperator(operator.pop(), number.pop(), number.pop()));
           }
    
           result=number.pop();
         
       }
       catch(Exception e)
       {
    	   System.out.println("\nError In Calculation!!!");
    	   Start.BacktoCalculatorMenu();
       }
       
       if(Start.choice==1)
       {
    	   standard.StandardResultPrint(result);
       }
       
       else if(Start.choice==2)
       {
    	   scientific.ScientificResultPrint(result);
       }
       
       else if(Start.choice==3)
       {
    	    base.BaseResult(result);
       }

        return result;
    }
 
  
    public boolean OperatorRank(char operator, char TopOperator)
    {	
    	if (TopOperator == '(' || TopOperator == ')')
            return false;
    	
    	if (( operator == '*' ||  operator == '/') && (TopOperator == '+' || TopOperator == '-'))
            return false;
    	
    	if (( operator == '%') && (TopOperator == '/' || TopOperator == '*'))
            return false;
    	
    	if (( operator == '%') && (TopOperator == '+' || TopOperator == '-'))
            return false;
        
        if (( operator == '^') && (TopOperator == '/' || TopOperator=='*'))
            return false;
        
        if (( operator == '^') && (TopOperator == '+' || TopOperator=='-'))
            return false;
        
        else
            return true;
    	
    }
     
    public double permittedOperator(char operator, double input2, double input1)
    {
    	double sum;
    	
    	try
    	{
    		if(operator=='+')
        	{
        		return sum=input1 + input2;
        	}
        	else if(operator=='-')
        	{
        		return sum=input1 - input2;
        	}
        	else if(operator=='*')
        	{
        		return sum=input1 * input2;
        	}
        	else if(operator=='/')
        	{	
        		return sum=input1/input2;
        	}
        	else if(operator=='^')
        	{	
        		return sum=Math.pow(input1, input2);
        	}
        	else if(operator=='%')
        	{	
        		return sum=(input1*input2)/100;
        	}
    	}
    	catch(Exception e)
    	{
    		System.out.println("\nError !!!");
    	}
    	
        return 0;
}
    
}