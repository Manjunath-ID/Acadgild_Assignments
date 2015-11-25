package assignment3;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
	System.out.print("Enter First Number: ");
	Scanner in1 = new Scanner(System.in);
	double num1 = in1.nextDouble();
	System.out.print("Enter Second Number: ");
	Scanner in2 = new Scanner(System.in);
	double num2 = in2.nextDouble();
	
	calciMethods calc = new calciMethods();
	double addRes = calc.Add(num1, num2);
	double subRes = calc.Subtract(num1, num2);
	double mulRes = calc.Multiply(num1, num2);
	double divRes = calc.Divide(num1, num2);
	
	System.out.println("ADDITION Result = "+addRes);
	System.out.println("SUBTRACTION Result = "+subRes);
	System.out.println("MULTIPLICATION Result = "+mulRes);
	System.out.println("DIVISION Result = "+divRes);
	
	}
}

class calciMethods{
	public double Add(double a1, double a2)
	{
		return a1+a2;
	}

	public double Subtract(double s1, double s2)
	{
		return s1-s2;
	}

	public double Multiply(double m1, double m2)
	{
		return m1*m2;
	}

	public double Divide(double d1, double d2)
	{
		return d1/d2;
	}

}
