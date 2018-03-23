import java.io.*;
 
class repeating
{
     
static void printTwoElements(int arr[], int size)
{
    int i;
    System.out.print("The repeating element is ");
 
    for(i = 0; i < size; i++)
    {
        if(arr[Math.abs(arr[i])-1] > 0)
            arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
        else
            System.out.println(Math.abs(arr[i]));
    }
 
    System.out.print("And the missing element is ");
    for(i = 0; i < size; i++)
    {
        if(arr[i] > 0)
            System.out.println(i + 1);
    }
}
 
/* Driver program to test above function */
public static void main(String[] args)
{
    int arr[] = {7, 6, 4, 3, 2, 8, 4};
    int n = arr.length;
    printTwoElements(arr, n);
}
}
 
