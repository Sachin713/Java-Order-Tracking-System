/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.awt.Color;
import java.util.Scanner;

/**
 *
 * @author SACHIN PATEL (000771663)
 */
public class RefillBottle extends TimsProduct {

    /**
     * color for the RefillBottle
     */
    private Color color;

    /**
     *
     * @param name of the RefillBottle
     * @param cost of the RefillBottle
     * @param price of the RefillBottle
     * @param color of the RefillBottle
     */
    private RefillBottle(String name, Double cost, Double price, Color color) {
        super(name, cost, price);
        this.color = color;
    }
 public static int b =0;
    /**
     *
     * @return this is the method create for the RefillBottle
     *
     */
    public static RefillBottle create() {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter type of Mug (1=BLACK, 2=RED): ");
            int item = in.nextInt();
           
            switch (item) {
                case 1:
                       b = 1;
                    return new RefillBottle("RefillBottle -> BLACK", 1.5, 3.00, Color.BLACK);
                 
                case 2:
                      b = 2;
                    return new RefillBottle("RefillBottle -> RED", 1.5, 3.00, Color.RED);
                default:
                    System.out.println("Invalid Products");
                    break;
            }
        } while (true);
    }

    /**
     *
     * @return color
     */
    public Color getColor() {
        
        return color;

    }

    /**
     *
     * @return string of the color
     */
    @Override
    public String toString() {
        if (b==1 )
        {
            return super.toString() + "color :  BLACK ] \n";
        }
        else
        {
         return super.toString() + " color :  RED ] \n";
        }

    }
}
