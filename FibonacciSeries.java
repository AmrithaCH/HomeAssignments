package week1.day1;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class FibonacciSeries {

	public static void main(String[] args) {

		int firstnum = 0;
		int secnum = 1;
		System.out.println(firstnum);
		System.out.println(secnum);
		int sum;
		for (int i=1 ; i<10 ; i++)
		{
			sum=firstnum+secnum;
			System.out.println(sum);
			firstnum=secnum;
			secnum=sum;
		}


	}

}
