package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		for(int input = 5; input<10; input++)
		{
		int fact =1;
		for(int i= 1; i<=input; i++)
		{fact=fact*i;}
		System.out.println("Factorial of "+input+" is: "+fact);
		}
		
	}

}
