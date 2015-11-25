import java.util.Scanner;


public class Pattern1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Pattern1\n");
		System.out.println("Please Enter the pattern length:\t");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i,j;
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println("\n");
		}
		
		for(i=n-1;i>=1;i--){  
			for(j=1;j<=i;j++){   
				System.out.print(j);
			}
			System.out.println("\n");
		}
	}

}
