/*
Q2. WAP to handle the exception by using a throw clause?
*/
import java.util.*;


class Voting extends ArithmeticException
{ 
    public String getVoterException()
	{
	    return "you are not eligible for voting";
    }
		
}
class VotingMachine
{
	void verifyAge(int age)
	{
		if(age<18)
		{
			Voting v=new Voting();
			throw v;
		}
		else
		{
			System.out.println("you can vote");
		}
	}
}


public class Exception_throw
{
  public static void main(String x[])
  {
    Scanner m=new Scanner(System.in);
	System.out.println("Enter age");
	int age=m.nextInt();
	try
	{
		
	VotingMachine vm=new VotingMachine();
	vm.verifyAge(age);
	}
	catch(Voting e)
	{
		System.out.println(e.getVoterException());
	}
  }
}
	