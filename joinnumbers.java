import java.util.Scanner;
public class joinnum
{
    public static void main(String[] args)
    {
    Scanner reader = new Scanner(System.in);
  System.out.println("Enter the first number");
  int min=reader.nextInt();
        System.out.println("Enter a second number");
        int max=reader.nextInt();
        for (int i=min; i < max + 1; i++)
        {
            System.out.println(i);
        }

   }
