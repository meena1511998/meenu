import java.util.*;
public class GCD
{

    public static void main(String[] args)
    {

        int n1 =71, n2 = 143;

        while(n1 != n2)
        {
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }

        System.out.println("G.C.D = " + n1);
    }
}
