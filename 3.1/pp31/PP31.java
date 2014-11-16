package pp31;
import java.util.Scanner;
import java.util.Random;
public class PP31 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Random letter = new Random();
		
		System.out.println("What is your first name?");
		String first = scan.nextLine();
		
		System.out.println("What is your last name?");
		String last = scan.nextLine();
		
		System.out.println(first);
		System.out.println(last);
	}

}
