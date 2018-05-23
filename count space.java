import java.util.scanner;
public class CountSpace
{

    public static void main(String[] args) 
    {

        String word = "wel come";
        String data[];int k=0;
        data=word.split("");
        for(int i=0;i<data.length;i++){
            if(data[i].equals(" ")){
                k++;
            }

        }
        System.out.println(k);

    }
}
