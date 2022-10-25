import java.util.Scanner;
class swapnumbers
{
	public static void main(String args[])
	{
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the the values : ");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("The value of a is "+a+" and b is "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping : ");
      	System.out.println("The value of a is "+a+" and b is "+b);
	}	
}	