
/**
 * A class to get a array from the main class then making it a global variable the use the equation
 * function to output the values in order of slowest to fastest and output the three slowest
 * @author Adam Buchan
 * @version 15th of march 2022
 */
public class Support
{
    //setting the array as a global variable
    double[] time;
    
    //a method to get the array then make it the global varaible
    public Support(double[] place_Holder)
    {
        //making the global varaible the array
        time= place_Holder;
    }    

    //a function to output the  values in order of slowest to fastest and output the three slowest
    public void Equation()
    {       
       //initalising a varible as the lenght of the array
       int length = time.length;
       //initalising a place holder
       double holder =0;
       
       //a loop for the lenght of the array
       for(int index=0;index<length;index++)
       {
           //a loop for the lenght -1 of the array
           for(int value=1;value<(length-index);value++)
           {
               //a if statement saying if the value of the array before is lower then 
               //the value of the array after then go along
               if(time[value-1]<time[value])
               {
                   //make place holder equal value before in the array
                   holder=time[value-1];
                   //swapping the value before to the value after in the array
                   time[value-1]=time[value];
                   //making the value in the array after equal the place holder
                   time[value]=holder;
               }     
           }   
       }   
       
       //a loop to output the values of the array 
       for(double temp:time)
       {
           //print out array
           System.out.print(temp + " ");
       }    
       
       //new line
       System.out.println("");
       
       //prints out the three slowest times
       System.out.println("The slowest time is " + time[0]+ " \nthe second slowest is " 
           +time[1] +" and the third slowest was " + time[2]);
    }   
}
