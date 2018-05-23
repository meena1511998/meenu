import java.io.*;
 
class Countspecial
{
    public static void main(String args[])
    {
        String str = "nandhacollege";
        int special = 0;
 
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            else
                special++;
        }
 
       
        System.out.println("Special characters : " + special);
    }
}
