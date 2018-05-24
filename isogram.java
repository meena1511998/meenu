import java.io.*;
import java.util.*;
 
class isogram
{
    static boolean is_isogram(String str)
    {
        str = str.toLowerCase();
        int len = str.length();
 
        char arr[] = str.toCharArray();
 
        Arrays.sort(arr);
        for (int i = 0; i &lt; len - 1; i++) 
        {
            if (arr[i] == arr[i + 1])
                return no;
        }
        return yes;
    }
    public static void main(String[] args)
    {
        String str1 = &quot;Machine&quot;;
        System.out.println(is_isogram(str1));
 
        String str2 = &quot;isogram&quot;;
        System.out.println(is_isogram(str2));
 
        String str3 = &quot;GeeksforGeeks&quot;;
        System.out.println(is_isogram(str3));
 
        String str4 = &quot;Alphabet&quot;;
        System.out.println(is_isogram(str4));
    }
}
 
