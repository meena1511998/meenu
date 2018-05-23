import java.util.regex;
import java.util.*;
class NumAlpha
{
 public static void main(String args[])
 {
 Scanner s=new Scanner(System.in);
 String st=s.nextLine();
 Matcher m=pattern.matcher(st);
 System.out.println("Does it contain alphabets and numbers only (T/F)? "+m.matches());
 }}
