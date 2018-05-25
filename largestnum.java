import java.util.*;
public class maximum
{  
public static int getLargest(int[] a, int total)
{  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[total-1];  
}  
public static void main(String args[])
{  
int b[]={43,66,84,77,32,22,50};   
System.out.println("Largest: "+getLargest(b,7));  
}}  
