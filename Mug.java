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
public class Mug extends TimsProduct {
//create the color variable

    private Color color;

    /**
     *
     * @param name of the Mug
     * @param cost of the Mug
     * @param price of the Mug
     * @param color of the Mug this is constructor of the Mug
     */
    private Mug(String name, Double cost, Double price, Color color) {
        super(name, cost, price);// set the super class method
        this.color = color;
    }
public static int b =0;
    //method of the Mug create
    public static Mug create() {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter type of Mug (1=YELLOW, 2=Black): ");
            int item = in.nextInt();
            switch (item) {
                case 1:
                    b = 1;
                    return new Mug("Mug -> YELLOW\t", 0.25, 1.50, Color.YELLOW);

                case 2:
                    b= 2;
                    return new Mug("Mug -> Black\t", 0.25, 1.20, Color.BLACK);
                default:
                    System.out.println("Invalid Products");
                    break;
            }
        } while (true);
    }
//get the color varible 

    public Color getColor() {
        return color;

    }
//Override the toString method

    @Override
    public String toString() {
        if (b==1 )
        {
            return super.toString() + "color :  YELLOW] \n";
        }
        else
        {
         return super.toString() + "color :  BLACK] \n";
        }

    }
}
