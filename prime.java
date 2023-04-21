import java.util.Scanner;
public class prime{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number");
int a = sc.nextInt();
int tally;
int flag=0;
if(a==0||a==1)
{
System.out.println("it is not prime");
}


for(tally=2;tally<a;tally++)
{
if(a%tally==0)
{
 flag=1;
}
}
if(flag==1)
{
System.out.println("it is not prime");
}
else
{
System.out.println("it is  prime");
}
}
}

