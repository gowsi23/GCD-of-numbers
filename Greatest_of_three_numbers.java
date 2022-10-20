import java.util.Scanner;
public class Greatest_of_three_numbers
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int a,b,c;
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b && a>c)
		{
			System.out.println( a+" is the greatest number among "+a+" "+b+" "+c);
		}
		else if(b>c)
		{
			System.out.println( b+" is the greatest number among "+a+" "+b+" "+c);
		}
		else
		{
			System.out.println( c+" is the greatest number among "+a+" "+b+" "+c);
		}
	}
}