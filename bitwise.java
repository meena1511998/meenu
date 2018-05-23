import java.util.*;
public class Swap
{
 public static void main(String args[])
{
int a = 78, b = 45;
System.out.println("Before swapping:");
 
System.out.println("A=" + a);
System.out.println("B=" + b);
 
a = a ^ b; 
b = a ^ b;
a = a ^ b; 
 
System.out.println("After swapping:");
System.out.println("A=" + a);
System.out.println("B=" + b);
}
}
