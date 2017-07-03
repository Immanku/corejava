package ExDemo;

import java.util.*;

public class Myclass {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		try{// catching the error and passing to catch
			//int data=50/0;
			int arrayLen=sc.nextInt();
			int x[]=new int[arrayLen];
			int m=sc.nextInt();
			x[5]=25/m;
			//System.out.println(data);
		}
		catch(ArithmeticException e)//indetify the errorr and handling it
		{
			System.out.println(e);
		
		}
		catch(ArrayIndexOutOfBoundsException d)
		{
			System.out.println(d);
		}
		finally//mark the end of try catch block
		
		{
			System.out.println("program is throwing exception");
			sc.close();
			
		}
		System.out.println("rest of code");
		int age=8;
		if(age<18)
		throw new ArithmeticException("Invalid age");
	}

}
