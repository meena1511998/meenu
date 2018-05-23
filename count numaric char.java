import java.util.*;
public class numaric
{

public static void main (String[] args) throws Ecveption{

java.io.File file = new java.io.File file("io.txt");
Scanner input = new Scanner(file);
String s = null;

while(input.has Next()){
String text = input.next();

System.out.println(countsChar(s));
}
}

public static int[] counts char(String s){
int [] counts = new int [255];
char [] diit = s.toCharArray();
for(int i = 0; i < s.length(); i++){
counts[(int)digit[i]]++;
}
return counts'
}
