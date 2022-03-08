import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value: ");
		int a=sc.nextInt();
		
		System.out.println("Enter the b value: ");
		int b=sc.nextInt();
		
		int c=a+b;
		System.out.println("The sum of given two number is "+c);
		sc.close();
	}
}
