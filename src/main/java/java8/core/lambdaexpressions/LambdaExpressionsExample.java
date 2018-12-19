package java8.core.lambdaexpressions;

import java8.core.functionalinterface.MathOperation;
import java8.core.functionalinterface.MessageService;

/**
 *
 * @author Naveen
 *
 */
public class LambdaExpressionsExample
{

	public static void main(String args[])
	{
		//with type declaration
		MathOperation addition = (int a, int b) -> a + b;
		MessageService messageService= message -> "ADDITION OF 10 , 15 = " ;
		LambdaExpressionsExample lambdaExpressionsExample=new LambdaExpressionsExample();
		System.out.println(lambdaExpressionsExample.printOperation(10,15,addition,messageService));

		//with out type declaration
		MathOperation subtraction = (a, b) -> a - b;
		messageService= message -> "SUBTRACTION OF 15 , 10 = " ;
		lambdaExpressionsExample=new LambdaExpressionsExample();
		System.out.println(lambdaExpressionsExample.printOperation(15,10,subtraction,messageService));

		//with return statement along with curly braces
		MathOperation multiplication  = (a, b) ->{ return  a*b; };
		messageService= message -> "MULTIPLICATION OF 15 , 10 = " ;
		lambdaExpressionsExample=new LambdaExpressionsExample();
		System.out.println(lambdaExpressionsExample.printOperation(15,10,multiplication,messageService));

		//without return statement and without curly braces
		MathOperation division   = (a, b) ->  a/b;
		messageService= message -> "DIVISION OF 15 , 3 = " ;
		lambdaExpressionsExample=new LambdaExpressionsExample();
		System.out.println(lambdaExpressionsExample.printOperation(15,3,division,messageService));
	}

	/**
	 * Print Result For Varios Operation
	 * @param a
	 * @param b
	 * @param mathOperation
	 * @return
	 */
	private int printOperation(int a, int b, MathOperation mathOperation,MessageService messageService)
	{
		System.out.print(messageService.sayMessage(messageService.toString()));
		return mathOperation.operation(a, b);
	}
}
