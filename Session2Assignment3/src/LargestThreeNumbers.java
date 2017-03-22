import java.util.*;
public class LargestThreeNumbers { 
	public static void main(String args[])
	{
		int a,b,c,lar=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number 1 -->");
		a= input.nextInt();
		System.out.println("Enter number 2 -->");
		b= input.nextInt();
		System.out.println("Enter number 3 -->");
		c= input.nextInt();
		
		if(a>b&&a>c)
			lar=a;
		else if(b>c&&b>a)
			lar=b;
		else
			lar=c;
		
		System.out.println(" number 1 -->"+a);
		System.out.println(" number 2 -->"+b);
		System.out.println(" number 3 -->"+c);
		System.out.println(" Largest  of "+a+" & "+b+" & "+c+" is---> "+lar);
		
	}

}
