import java.util.*;
public class FindLargestSmallestNumber
{
 
	public static void main(String[] args)
  {
		int numbers[] = new int[]{56,75,33,42,12,98,45,4,65};
		int smallest = numbers[0];
		int largetst = numbers[0];
		
		for(int i=1; i< numbers.length; i++)
		{
			if(numbers[i] > largetst)
				largetst = numbers[i];
			else if (numbers[i] < smallest)
				smallest = numbers[i];
			
		}
		
		System.out.println("Largest Number is : " + largetst);
		System.out.println("Smallest Number is : " + smallest);
	}
}
