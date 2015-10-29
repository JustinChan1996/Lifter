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
import java.util.Scanner;
public class WWL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Driver class for the lifter class */
        /* Ask for the number of competitors */
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the number of competitors: ");
        int number = input.nextInt();
        /* Set array size for the WeightClub object */
        WeightClub WWL = new WeightClub();
        WWL.WeightClub(number);
        /* Display message if input variable is less or equal to 0 */
        if (number <= 0)
        {
            System.out.println("The maximum number of competitors is set to 20");
        }
        else
        {
            System.out.println("The maximum number of competitors is successfully set to " + number);
        }
        /* Declare and initialize option variable for menu */
        int option = 0;
        do
        {
            /* Display menu prompt */
            System.out.println("World Weight Lifting Championship");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1. Add a lifter");
            System.out.println("2. Show the winner");
            System.out.println("3. Quit");
            /* Do the appropriate action absed on the option selected */
            if (option == 1)
            {
                
            }
            else if (option == 2)
            {
                
            }
        
        }
        while(option != 3);
        
    }
}
