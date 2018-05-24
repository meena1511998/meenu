import java.util.Scanner;
class AreaOfdigit
{
	static Scanner in = new Scanner(System.in);
	public static void main(String args[])
  {
		System.out.print("Enter the length: ");
		int length = in.nextInt();
		int area=length*length;
		System.out.println( "The area of the square is:"+area) ;
	}
}
