package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		for(int testnum = 1; testnum<100; testnum++) { 
			boolean flag = false;

			for (int i=2; i<=testnum/2; i++)
			{
				if(testnum%i==0)
				{flag = true;
				break;
				}	

			}

			if(flag==true)
			{System.out.println(testnum+ " is not a prime number");}
			else
			{System.out.println(testnum+ " is a prime number");}

		}

	}

}
