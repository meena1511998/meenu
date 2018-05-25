importjava.util.*;
public class Power
{

    public static void main(String[] args) 
    {

        int N = 3, K = 4;

        long result = 1;

        while (exponent != 0)
        {
            result *= N;
            --K;
        }

        System.out.println("Answer = " + result);
    }
}
