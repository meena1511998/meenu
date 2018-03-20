import java.util.*;
 public class Minutes
{
  public static void main(String[] arg)
    Calendar now = Calendar.getInstance();
   
    System.out.println("Current time : " + now.get(Calendar.HOUR_OF_DAY)
                      + ":"
                      + now.get(Calendar.MINUTE)
                      + ":"
                      + now.get(Calendar.SECOND));
    now.add(Calendar.MINUTE,20);
 
    System.out.println("New time after adding 20 minutes : "
                      + now.get(Calendar.HOUR_OF_DAY)
                      + ":"
                      + now.get(Calendar.MINUTE)
                     + now.get(Calendar.SECOND));
    now = Calendar.getInstance();
    now.add(Calendar.MINUTE, -50);
 
    System.out.println("Time before 50 minutes : " + now.get(Calendar.HOUR_OF_DAY)
                      + ":"
                      + now.get(Calendar.MINUTE)
                      + ":"
                      + now.get(Calendar.SECOND));
   
  }
}
