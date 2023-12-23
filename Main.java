
/**
 * A class to initalise the times array and then pass to the method in support 
 * and then calling the Equations function in support to get the results
 * @author Adam Buchan
 * @version 14th of march 2022
 */
public class Main
{
    //a function to intailse the array and pass the array the call a function
    //to get the output
    public static void main(String[] args)
    {
        //iniatlising the array
        double[] times = {21.23,23.45,23.98,22.22,24.12,21.23,21.23,21.45};
        
        //passing the array to the method in support
        Support passing = new Support(times);
        
        //calling function to get the ouput
        passing.Equation();
    }   
}
