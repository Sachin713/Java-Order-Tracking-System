/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 *@author SACHIN PATEL (000771663)
 */
// this is assignment of the timorder which has some consumabale product and some is non consumable product
public class Assignment7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TimOrder tmo = TimOrder.create(); // create the timOrder class
        System.out.println(tmo);
        System.out.printf("Total Price: $%.2f \n \t", tmo.getAmountDue()); // total price of the all product

    }

}
