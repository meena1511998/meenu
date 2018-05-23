import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        long num = -23;
        int digits = 0;
        if (num < 0) 
            num *= (-1);
        if (num < 10 && num >= 0)
            digits = 1;
        else {
            while(num > 0) 
            {
                num /= 10;
                digits++;
            }
        }
        System.out.println("Digits: " +digits);
    }
}
