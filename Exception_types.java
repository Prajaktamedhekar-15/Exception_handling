/*
Q1. WAP to handle the ArithmeticException ?
Q2. WAP to handle the IOException ?
Q3. WAP to handle the InputMismatchException ?
Q4. WAP to handle the ClassNotFoundException ?
Q5. WAP to handle the NullPointerException?
Q6. WAP to handle the ArrayIndexOutOfBoundsException ?
Q7. WAP to handle the NumberFormatException?

*/
import java.util.*;
import java.io.*;


public class Exception_types
{
	static int a[];  // for null pointer exception
  public static void main(String x[])
  {
	  Scanner m=new Scanner(System.in);
	  
	System.out.println("case 1:ArithmeticException");  //a/b=12/0;
	
	System.out.println("case 2:IOException");     //file  
	System.out.println("case 3:InputMismatchException");  //int==>asd
	System.out.println("case 4:NoClassDefFoundError and ClassNotFoundException");
	System.out.println("case 5:NullPointerException");
	System.out.println("case 6:ArrayIndexOutOfBoundsException");
	System.out.println("case 7:NumberFormatException");
	System.out.println("case 8:ClassCastException");
	System.out.println("Case 9:FileNotFoundException");
	System.out.println("Case 10:IllegalArgumentException");
	System.out.println("Case 11:NoSuchElementException");
	System.out.println("Case 12:OutOfMemoryError");
	System.out.println("case 13:NegativeArraySizeException");
	System.out.println("case 14: StringIndexOutOfBoundsException");
	
	System.out.println("Enter 14 for exit:");
	
	

	
	  
	do
	{ 
	System.out.println("\nEnter choice:");
	   int ch=m.nextInt();
	
	
	    switch(ch)
	   {
		   case 1:
		   { 
	       System.out.println("Enter two no:");
				   int a=m.nextInt();
				   int b=m.nextInt();
			   try
			   {
				  int c=a/b;
				  System.out.println("division is:"+c);
				  
				   
			   }
			   catch(Exception e)
			   {
				   System.out.println(e.getMessage());
				   
			   }
			  
			  break;
			  
		   }
		   case 2:
		   {//IOException
			   
				   File f=new File("C:\\FilehandlingPrac","file2");
	 
	                if(f.exists())
	                {
		               System.out.println("Already created..");
	                }
	                else
	                {
		                try
						{
							
		                   boolean b= f.createNewFile();
		
		                    if(b)
		                    {
			                   System.out.println("Successfully created...");
		                    }
		                    else
	                     	{
			                  System.out.println("some problem occurs.");
		                    }
		                }
		                catch(Exception e)
		                {
			              System.out.println(e);
		                }
					}
	        
			   break;
			   
		   }
		   case 3:
	       {//InputMismatchException
			   
			   try
			   { 
				   System.out.println("Enter no:");
				   int num=m.nextInt();
				   System.out.printf("you entered:"+num);
				   
			   }
			   catch(Exception e)
			   {
				    System.out.println("InputMismatchException occurred: Please enter a valid integer.");
					m.next(); //clear wrong input.
			   }
			   
			   break;
		   }
	
	       case 4:
	       { //ClassNotFoundException
			   try
			   {
				   //System.out.println("class is:"+Class.forName("Exception_types"));
				   System.out.println("class is:"+Class.forName("unknown"));
			   
			   
			   }
			   catch(ClassNotFoundException ex)
		        {
					System.out.println("Error is "+ex);
				}
				catch(NoClassDefFoundError ex)
				{ 
				    System.out.println("Error is  "+ex);
				}

			   break;
			   
		   }
		   case 5:  //NullPointerExceptionointer 
		   {
			   /*try
			   {
				   String str=null;
				   System.out.println(str.length());
			   }
			*/
			
			   
			   try{
				   
				   a[0]=100;
				   System.out.println(a[0]);
			   }
			   
			   catch(Exception e)
			   {
				   System.out.println(e);
				   
			   }
			   break;
			   
		   }
		   case 6:
		   {  //arrayIndexOutOfBound
			   try
			   {
				   int[]a={1,2,3};
				   System.out.println(a[5]);
				   
			   }
			   
			   catch(Exception e)
			   {
				   System.out.println(e.getMessage());
				   
			   }
			   break;
		   }
		   case 7:
		   { //NumberFormatException
			   try
			   {
				   m.nextLine();
				   System.out.println("Enter number in String format:");
				   String str=m.nextLine();
				   
				   int no=Integer.parseInt(str);
				   System.out.println(no);
				   
				   System.out.println("Successfully convert");
			   }
			   catch(Exception e)
			   {
				   System.out.println(e);
				   System.out.println("problem in  converting ");
			   }
			   break;
		   }
		   case 8:
		   {
			   //classCastException
			   try{
				   
				   Object obj=new Integer(100);
				   Float s=(Float)obj;
				   
			   }
			   catch(Exception ex)
			   {
				   System.out.println(ex);
				   
			   }
			   break;
			   
		   }
		   // FileNotFoundException
		    case 9:
		    {
			   try
			   {
	               FileReader fr= new FileReader("unknown");
		           int data;
		           while((data=fr.read())!=-1)
		           {
		               char ch1=(char)data;
			            System.out.print(ch1);
		            }
	            }
	            catch(FileNotFoundException ex)
	            { 
				    System.out.println("Error is  ==>"+ex);
	            }
	            catch(IOException ex)
	           {
				   System.out.println("Error is  "+ex);
	            }

			   
			   break;
		   }
		    case 10:
		   { //IllegalArgumentException
			   try
			   {
				   
				   System.out.println("Enter size of array:");
				   int size=m.nextInt();
				   if(size<5)
				   {
					    //throw new IllegalArgumentException("Invalid argument pass");
						throw new IllegalArgumentException();
				   }
					 
					 int a[]=new int[size];
					System.out.println("Length of array is "+a.length);
	            }
	            catch(IllegalArgumentException ex)
	            {
					System.out.println("Error is  "+ex);
	            }
					
			   break;
		   }
		   case 11:
		   {//NoSuchElementException
			   try
			   {
				     List al = new ArrayList();
	                 Iterator i=al.iterator();
	                 System.out.println(i.next());

				   
			   }
			   catch(Exception ex)
			   {
				   System.out.println(ex);
				   
			   }
			   break;
		   }
		  // StackOverflowError
		  
		  //OutOfMemoryError
		  case 12:
		   {
			   try
			   {
				    
	             int a[]=new int[Integer.MAX_VALUE];

			   }
			   catch (Throwable ex)
			   {
					System.out.println("Caught: " + ex);
				}
			   break;
		   }
		   case 13://NegativeArraySizeException
		   {
			   try{
				   int a[]=new int[-5];
			   }
			   catch(Exception ex)
			   {
				   System.out.println(ex);
				   
			   }
			   
			   break;
			   
		   }
		   case 14:
		   {
			    try 
				{
				   String str="abcd";
				   System.out.println(str.charAt(4));
			   }
			   catch(Exception e)
			   {
				   System.out.println(e);
				   
			   }
			   break;
			   
		   }
		   case 15:
		   {
			   System.exit(0);
		   }
		   
		   default:
		   System.out.println("wrong choice");
	   }
	   
  }
  while(true);
		  
		  
  }
}