import java.util.*;
 
class nearestnum
{
    static int round(int n)
    {
        int a = (n / 10) * 10;
        int b = a + 10;
        return (n - a > b - n)? b : a;
    }
    public static void main(String[] args) 
    {
         int n = 38;
         System.out.println(round(n));
    }
}
