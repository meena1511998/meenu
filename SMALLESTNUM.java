import java.util.*;  
public class Smallestnum
{  
public static int getSmallest(int[] a, int total)
{  
Arrays.sort(a);  
return a[0];  
}  
public static void main(String args[])
{  
int a[]={3,4,2,8,5,1};  
System.out.println("Smallest: "+getSmallest(a,6));  
 }  
 }
