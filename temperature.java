import java.io.*;
 
class temperature 
{
    
    static float Celsius_to_Kelvin(float C)
    {
        return (float)(C + 273.15);
    }
     
    public static void main (String[] args) 
    {

        float C = 100;
     
        System .out.println ( "Temperature in Kelvin ( K ) = "
                             + Celsius_to_Kelvin(C));
             
    }
}
