import java.util.*;

class composite 
{

static void check(int a)
{
int n=0;

for(int i=1;i<=a;i++)
{
if(a%i==0)
n++;}
if(n>2)
System.out.println(a+” is a composite number”);
else
System.out.println(a+” is a prime number”);
}
}
