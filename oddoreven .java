import java.util.Scanner;
 
class oddoreven
{
   public static void main(String args[])
   {
      int n;
      System.out.println("Enter an integer to check if it is odd or even ");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
 
      if ( n % 2 == 0 )
         System.out.println("You entered an even number.");
      else
         System.out.println("You entered an odd number.");
   }
}
