import java.util.*;
class EqualsStrings paragraph
{ 
    public static void main(String s[])
    {
        String inputString = "Virat Kohli";
        String[] strings = {"Sachin Tendulkar", "Dhoni", "Sehwag", "Yuvraj Singh", "Virat Kohli", "Gautam Gambhir", "Suresh Raina", "Rohit Sharma"};
        boolean result = equalsAny(inputString, strings);
        System.out.println("The input string \"Virat Kohli\" is equals any one of strings {Sachin Tendulkar, Dhoni, Sehwag, Yuvraj Singh, Virat Kohli, Gautam Gambhir, Suresh Raina, Rohit Sharma} : " +result);

    }


        public static boolean equalsAny(String inputString, String[] strings) 
        { 
            boolean result = false; 
 
Write a code here the given value is equals to any of the list of values and assign to result.
            return result; 
    } 

} 
