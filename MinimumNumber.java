import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 
public class Minimum
{
 public static void main(String[] args)
    {
        System.out.println("Enter 0 To 10 Numbers");
        Scanner sc=new Scanner(System.in);
        Integer[] numbers =new Integer[10];
        for (int i=0;i<numbers.length;i++)
        {
            System.out.print("enter numbers["+i+"]:");
            numbers[i]=sc.nextInt();
        }
         int min = (int) Collections.min(Arrays.asList(numbers));
        System.out.println("Min number: " + min);
       
    }
}
