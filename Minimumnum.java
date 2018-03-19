public class SmallestInArray
{  
public static int getSmallest(int[] a, int total)
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
       return a[0];  
}  
public static void main(String args[]){  
int a[]={1,2,5,8,6,2};  
int b[]={55,77,33,22,55};  
System.out.println("Smallest: "+getSmallest(a,6));  
System.out.println("Smallest: "+getSmallest(b,7));  
}}  
