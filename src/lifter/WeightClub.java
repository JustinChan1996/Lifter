/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lifter;

/**
 *
 * @author Justin
 */
public class WeightClub {
    /* This club serves as a container of Lifter objects. This
    class has the following attributes:
    - An array of Lifter objects – lifter
    - An integer counter – count
    -An integer constant with value 20.
    */
    private int counter;
    private final int MaxCounter = 20;
    private Lifter[] lifter;
   
    /* Constructor that will take set the size of the array. If the value is non-positive, the size is set to 20 */
    public void WeightClub(int size)
    {
        if (size <= 0)
        {
            lifter = new Lifter[MaxCounter];
        }
        else{
            lifter = new Lifter[size];
        }
    }
    
    /* AddLifter method that will add a lifter object to the array */
    public boolean Addlifter(Lifter lifterObject)
    {
        /* Check if counter is the same as the array size */
        /* If it is not, add the object to the array and increment the counter, otherwise, return false */
        if (counter <= lifter.length)
        {
            lifter[counter] = lifterObject;
            counter = counter + 1;
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    public double strongest()
    {
        /* Return the lifter object with the highest weight */
        double weightCount = 0;
        for (int i = 0; i < lifter.length; i = i + 1)
        {
            if (lifter[i].getWeight() > weightCount)
            {
                weightCount = lifter[i].getWeight();
            }
        }
        return weightCount;
    }
        
    
    
}
