importjava.util.*;
public class WordToNumber
{

static String string;
static String st1[] = {"zero", "one", "two", "three"};
static int st2[] = {0, 1, 2, 3};

public static int mac(String n)
{
    int digit = 0;
    try {
        if(Arrays.asList(st1).contains(n.toLowerCase()))
        {
            int a = Arrays.asList(st1).indexOf(n.toLowerCase());
            digit = st2[a];
        }
        else{
            return -1;
        }
    } catch (Exception e) {
        e.printStackTrace();
        return -1;
    }
    return digit;
}
