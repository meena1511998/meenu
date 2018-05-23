import java.lang.*;

public class binarynum
{

   public static void main(String[] args)
   {
      int i = 170;
      System.out.println("Number = " + i);
      System.out.println("Binary is " + Integer.toBinaryString(i));
      System.out.println("Number of one bits = " + Integer.bitCount(i)); 
   } 
} 
