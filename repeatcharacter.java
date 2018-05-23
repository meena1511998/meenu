import java.util.Arrays;

public class RepeatCharacter
{
    public static void main(String[] args)
    {
        char c = 'meenu';
        int length = 10;

       
        char[] chars = new char[length];

   
        Arrays.fill(chars, c);

   
        System.out.println(String.valueOf(chars));
    }
}
