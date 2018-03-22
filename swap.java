import java.util.*;
int countDistinct(string input[], int n)
{
    int countDist = 0;  
    unordered_set<string> s;
    for (int i=0; i<n; i++)
    {
       if (s.find(encodeString(input[i])) == s.end())
       {
           s.insert(encodeString(input[i]));
           countDist++;
       }
    }
 
    return;
}
