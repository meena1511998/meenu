import java.util.scanner;
public int computeSumofSquares (int n1, int n2) 
{
    int sum=0;
    if(n2>n1)
    {
        for(int i=n1;i<=n2;i++)
        {
            sum=((sum)+(n1*n1));
        }
    }
    return sum;

}
