/* Suppose consider we are working on Payroll Management software and we want to add Employee in database but
 if employee age is greater than 16 then we can add in database table and if employee age is less than 16 
 
 then system should generate the run time exception so you have to create user defined exception for handle 
 above scenario?
*/
import java.util.*;

class AgeNotMatchException extends RuntimeException
{
	public String getAgeNotMatchException()
	{
		return "Age not match given criteria";
		
	}
}
class VerifyAge
{
	VerifyAge(int age)
	{
		if(age<16)
		{
			throw new AgeNotMatchException();
		}
		else
		{
			System.out.println("added successfully");
			System.out.println("added successfully");
		}
	}
	
	
}
public class Exception_PayrollManagement
{
  public static void main(String x[])
  {
	  Scanner m=new Scanner(System.in);
	  System.out.println("Enter age");
	  int age=m.nextInt();
	  
	  try
	  { 
	    VerifyAge v=new VerifyAge(age);
	
		  
	  }
	  catch(AgeNotMatchException ex)
	  {
		  System.out.println(ex.getAgeNotMatchException());
		  
	  }
  }
}

