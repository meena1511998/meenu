import java.util.*;
public class recurcive
{

    private static int calculateGcd(int x,int y)
    {
        System.out.println(x+" "+y);
        if (y==0)
            return x;
        return (calculateGcd(y,x%y);
        }
    public static int gcd(int x, int y)
    {
        if (x<y){
            return calculateGcd(y,x);
        }
        return calculateGcd(x,y);
    }
 
 
    public static void main(String[] args){
        int gcd = gcd(252,105);
        System.out.println("gcd is: "+gcd);
    }
