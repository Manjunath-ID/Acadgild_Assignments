package assignment3;

import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumber {
	public static void main(String[] args) {
	int input, res,input1;
	do{
	System.out.println("Please enter a number");
	Scanner in = new Scanner(System.in);
	input = in.nextInt();
	RandomNumber rnd1 = new RandomNumber();
	res = rnd1.generateRandomNumber(input);
	System.out.println("Generated Random Number from 0 to "+input+" is: "+res);
	System.out.println("Enter 0 to Exit OR 1 to continue...");
	Scanner in1 = new Scanner(System.in);
	input1 = in1.nextInt();
	}while(input1==1);
	System.out.println("You are out of the application now");
	}
}

class RandomNumber{
	public int generateRandomNumber(int num)
	{
		int rndNum=0;
		Random rnd = new Random();
		rndNum = rnd.nextInt(num);
		return rndNum;
	}
}
