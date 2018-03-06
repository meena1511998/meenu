import java.util.Scanner;
 
public class PositiveOrNegativeUsingClass
{
	private static Scanner sc;
	
	public static void main(String[] args)
  {
		int Number;
		sc = new Scanner(System.in);		
		System.out.println("\n Please Enter the First integer Value: ");
		Number = sc.nextInt();
		
		PositiveOrNegative pn = new PositiveOrNegative();
		pn.x = Number;
		
		pn.positiveOrNegative();
		pn.positiveOrNegativeAgain(Number);
	}
}
