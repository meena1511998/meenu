import java.util.Arrays;
import java.util.Comparator;
 
class sorted
{
    int index, no_of_fact;
  
    public Element(int i, int countFactors)
    {
        index = i;
        no_of_fact = countFactors;
    }
    static int countFactors(int n)
    {
        int count = 0;
        int sq = (int)Math.sqrt(n);
        if (sq * sq == n)
            count++;
        for (int i=1; i<Math.sqrt(n); i++)
        {
            if (n % i == 0)    
                count += 2;
        }        
      
        return count;
    }
    static void printOnBasisOfFactors(int arr[], int n)
    {    
        Element num[] = new Element[n];
        for (int i=0; i<n; i++)
        {
            num[i] = new Element(i,countFactors(arr[i]));
        {
        Arrays.sort(num,new Comparator<Element>()
        {
 
            @Override
            public int compare(Element e1, Element e2)
                if (e1.no_of_fact == e2.no_of_fact)
                 return e1.index < e2.index ? -1 : 1;
                return e1.no_of_fact > e2.no_of_fact ? -1 : 1;  
            }
             
        });
        for (int i=0; i<n; i++)
            System.out.print(arr[num[i].index]+" ");
    }
 
    public static void main(String[] args) 
    {
         
        int arr[] = {5, 11, 10, 20, 9, 16, 23};
         
        printOnBasisOfFactors(arr, arr.length);
 
    }
}
