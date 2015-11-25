package assignment3;

import java.util.Scanner;

public class FindSquareRootAndCubeRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number");
		Scanner in = new Scanner(System.in);
		double num = in.nextDouble();
		double sqrtRes, cbrtRes;
		SquareRoot sqrt = new SquareRoot();
		sqrtRes = sqrt.findSquareRoot(num);
		CubeRoot cbrt = new CubeRoot();
		cbrtRes = cbrt.findCubeRoot(num);
		
		System.out.println("Square Root is = "+sqrtRes);
		System.out.println("Cube Root is = "+cbrtRes);
	}
}


class SquareRoot{
	double number1, result1;
	public double findSquareRoot(double num1)
	{
		this.number1 = num1;
		result1 = Math.sqrt(number1);
		return result1;
	}
}

class CubeRoot{
	double number2, result2;
	public double findCubeRoot(double num2)
	{
		this.number2 = num2;
		result2 = Math.cbrt(number2);
		return result2;
	}
}
