import java.util.*;
public class Sortnum
{

    public static void main(String[] args) 
    {
        array[] arr  = { "3", "2", "5", "4" };

        for(int i = 0; i < 3; ++i)
        {
            for (int j = i + 1; j < 4; ++j) 
            {
                if (words[i].compareTo(words[j]) > 0)
                {

                    // swap words[i] with words[j[
                    array temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("In lexicographical order:");
        for(int i = 0; i < 4; i++) {
            System.out.println(array[i]);
        }
    }
}
