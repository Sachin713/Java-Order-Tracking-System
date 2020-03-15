/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author SACHIN PATEL (000771663)
 */
public class TimOrder {

    /**
     * create the all variable size and name.
     */
    private int size;
    private String name;

    private static TimOrder tm; // create object of the TImOrder
    public static TimsProduct[] timsProducts; //  create the array for the TImsProduct 
//this is the constructor of this class

    private TimOrder(String name, int size) {

        this.name = name;
        this.size = size;

    }
//create method TimOrder of the TimOrder 

    public static TimOrder create() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String customerName = sc.nextLine();

        System.out.println("Please enter number of order  :  ");
        int customerOrder = 0;

        try {

            customerOrder = sc.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("This is invalid Input.");

        }
        tm = new TimOrder(customerName, customerOrder);
        timsProducts = new TimsProduct[customerOrder];

        for (int i = 0; i < timsProducts.length; i++) {

            System.out.println("Enter type of products (1=Coffee, 2=Donut, 3=Mug, 4=Refill Bottle): ");
            int order = sc.nextInt();
            switch (order) {
                case 1:
                    timsProducts[i] = Coffee.create(); // call the create method for the coffee 
                    break;
                case 2:
                    timsProducts[i] = Donut.create();// call the create method for the Donut 
                    break;
                case 3:
                    timsProducts[i] = Mug.create();// call the create method for the Mug 
                    break;
                case 4:
                    timsProducts[i] = RefillBottle.create();// call the create method for the RefillBottle 
                    break;
                default:
                    System.out.println("Invalid Products");
                    break;

            }

        }
        return tm;
    }
// calculate the all amount of the all product 

    public double getAmountDue() {
        double amount = 0.0;
        for (int i = 0; i < timsProducts.length; i++) {
            amount = amount + timsProducts[i].getRetailPrice();
        }
        return amount;// return the sum of all amount 

    }
// this is the override method for the toString

    @Override
    public String toString() {

        String eachProducts = "";
        for (int i = 0; i < timsProducts.length; i++) {
            eachProducts += timsProducts[i].toString();
        }
        return String.format("Name of Customer :  \t " + tm.name + "\n"+ eachProducts);

    }
}
