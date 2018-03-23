import java.util.*;
class string
static boolean equals(String word1, String word2, int mistakesAllowed)
{
    if(word1.equals(word2))
        return true;

    if(word1.length() == word2.length())
    {
        for(int i = 0; i < word1.length(); i++)
        { 
            if(word1.charAt(i) != word2.charAt(i)) 
            {
                mistakesAllowed--; 
                if(mistakesAllowed < 0) 
                { 
                    return false; 
                }
            }
        }
    }

    return true;
}
