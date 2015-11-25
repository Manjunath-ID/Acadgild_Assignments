package assignment3;

import java.util.Scanner;

public class CheckPrimeNumber {
	public static void main(String[] args) {
	System.out.println("Please enter a number");
	Scanner in = new Scanner(System.in);
	int number = in.nextInt();
	checkPrimeorNot prime = new checkPrimeorNot();
	boolean flag = prime.isPrime(number);
	if(flag){
		System.out.println(number+"  is a prime number");
	}
	else{
		System.out.println(number+"  is not a prime number");
	}
}
}

class checkPrimeorNot
{
	public boolean isPrime(int num){
	for(int i=2;i<=num/2;i++){
		if(num%i==0){
			return false;
		}
	}
		return true;
	}
}
