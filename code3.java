// This code helps find the gcd of two given numbers using euclidean algorithm


import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter no : ");
		int a=s.nextInt();
	    int b=s.nextInt();
	    
	   {
	    	while(b!=0)
	    	{
	    		int temp=b;
	    		b=a%b;
	    		a=temp;
	    	}
	    	System.out.println("GCD is "+a);
	    }
		
		

	}

}
