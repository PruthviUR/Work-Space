package day1;  
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num");
		int num = sc.nextInt();
		
			int i=0,flag=0,j=0;
		for(i=2;i<=num;i++)
		{  
			int iCount=0;
		
		  for(j=1;j<=i;j++)
		  {
			if((i%j)==0)
			{
			  iCount++;  
			}

		  }
		   if(iCount==2)
		
		   System.out.println(i);
		}
	}
	}
