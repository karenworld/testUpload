package CodingBat.Array2;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	//Given a string str, if the string starts with "f" return "Fizz". 
	//If the string ends with "b" return "Buzz". 
	//If both the "f" and "b" conditions are true, return "FizzBuzz". 
	//In all other cases, return the string unchanged. (See also: FizzBuzz Code)

			//fizzString("fig") → "Fizz"
			//fizzString("dib") → "Buzz"
			//fizzString("fib") → "FizzBuzz"

	public String fizzString(String str) {
		if(str.startsWith("f") && str.endsWith("b")) // important to put this in the first line then the last one which will not come out the result;
			  return "FizzBuzz";	
		  if(str.startsWith("f")) 
			  return "Fizz";			  
		  if(str.endsWith("b")) 
			  return "Buzz";	   	  
		  
		  return str;
		  }		
		  
		  public static void main(String[]args) {
			  FizzBuzz t = new FizzBuzz();
			  t.fizzString("fig");
			  t.fizzString("dib");
			  t.fizzString("fib");
			System.out.println(t.fizzString("fig"));
			System.out.println(t.fizzString("dib"));
			System.out.println(t.fizzString("fib"));
			}
			
		}

