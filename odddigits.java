import java.util.*;
public class Odddigit
{
    public static void main(String[] args) 
    {
        int count = 0;
        int n;
        for (int i = 1; i <= 10; i++)
        
        {
            if (i % 2 != 0)
            {
                count = count + 1;
                System.out.println(i);
            }
        }
        System.out.println("count:" + count);
    }
}
