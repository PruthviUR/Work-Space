package day1;

import java.util.Scanner;

public class OddEven 
{

	public static void main(String[] args)
	{

		// TODO Auto-generated method stub
				int sum=0;
		     Scanner sc= new Scanner(System.in);
		    int n = sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				if(i%2==0) 
				{
					sum = sum +i;
				
				
				}else if(i%2!=0)
				{
					sum = sum + i;
					//System.out.println("Sum of all Odd no."+sum);
				}
				System.out.println("Sum of all Odd no."+sum);
				System.out.println("Sum of all Even no.="+sum);
			
			}
	 }

		


	}
