import java.util.Scanner;
class product
{
public static void main(String ang[]){
Scanner data= new Scanner(System.in);
int num1, num2, prod;
System.out.println("Enter 1st number");
num1=data.nextInt();
System.out.println("Enter 2nd number");
num2=data.nextInt();
prod=num1*num2;
System.out.println("Product:"+prod);
}
}
