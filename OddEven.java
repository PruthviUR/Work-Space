package day1;

import java.util.Scanner;

public class OddEven 
{

	public static void main(String[] args)
	{

		
				int sum=0;
		     Scanner sc= new Scanner(System.in);
		    int n = sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				if(i%2==0) 
				{
					sum = sum +i;
				System.out.println("Sum of all Even no.="+sum);
				
				}else if(i%2!=0)
				{
					sum = sum + i;
					System.out.println("Sum of all Odd no."+sum);
				}
			}
	 }

		


	}