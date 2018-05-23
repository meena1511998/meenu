import java.util.*;
public class PrintWithoutSemiColon 
{

    public static void main(String[] args) 
    {
        if (System.out.printf("Hello World!\n") == null) 
        {}

        if (System.out.append("Hello World!\n").equals(null))
        {}
    }
}
