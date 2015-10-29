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
public class Lifter {
    /* The Lifter class will be used to represent weight lifter in a competition. Each
    weight lifter should have a name (a string) as well as the weight (in kg, a ‘double’) that is
    lifted by the lifter in a competition. */
    // Declare attributes
    private String name;
    private double weight;
    
    // Constructor with no arguments
    public void Lifter(){
        name = "";
        weight = 0.0;
    }
    
    // Constructor with arguments 
    public void Lifter(String lifterName, double lifterWeight)
    {
        name = lifterName;
        weight = lifterWeight;
    }
    
    // getter methods
    public String getName()
    {
        return name;
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    // setter methods
    public void setName(String lifterName)
    {
       name = lifterName;
    }
    
    public void setWeight(double lifterWeight)
    {
        weight = lifterWeight;
    }
    
    // toString method
    @Override public String toString(){
        return (name + " lifted " + weight + " kg ");
    }
}
