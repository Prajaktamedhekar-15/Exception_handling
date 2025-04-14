/*
Q1. WAP to handle the exception by using throws clause?
*/


import java.util.*;

public class Exception_throws
{
	public static void div(int x,int y)  throws Exception
	{
		System.out.println("division is:"+(x/y));
		
	}
	public static void add(int x,int y)
	{
		System.out.println("addition  is:"+(x+y));
	}
	
	
  public static void main(String x[])
  {
     Scanner m=new Scanner(System.in);
	  
	  System.out.println("Enter two no:");
	  int a=m.nextInt();
	  int b=m.nextInt();
	  try
	   { 
	     div(a,b);
	   }
	   catch(Exception e)
	   {
		  System.out.println(e);
	   }
	   
	  System.out.println("Second function");
	  add(a,b);
	  
	  
	  
  }
}