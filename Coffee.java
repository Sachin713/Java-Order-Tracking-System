/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Scanner;

/**
 *
 * @author SACHIN PATEL (000771663)
 */
public class Coffee extends TimsProduct implements Consumable {

    /**
     *
     * create variable for description and calorie
     */
    private String description;
    private int calorieCount;

    /**
     * all are set in coffee variables
     *
     * @param name
     * @param Description
     * @param cost
     * @param price
     * @param calories
     */
    public Coffee(String name, String Description, double cost, double price, int calories) {

        super(name, cost, price);
        this.description = description;
        calorieCount = calories;

    }
//create method for the coffee

    public static Coffee create() {
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter type of Coffee (1=Origional, 2=Dark , 3=Decafe): ");

            int item = sc.nextInt();
            switch (item) {
                case 1:
                    return new Coffee("Coffee->Origional \t", "coffee  with origional coffee ", 0.25, 1.20, 280);
                case 2:
                    return new Coffee("Coffee->Dark \t", "Very sugrary  ", 0.25, 2.50, 300);
                case 3:
                    return new Coffee("Coffee->Decafe\t", "Very  light coffe  ", 0.25, 2.00, 340);
                default:
                    System.out.println("Invalid Products");
                    break;
            }
        } while (true);
    }

    /**
     *
     * @return description
     */
    public String getDescription() {

        return description;

    }

    /**
     *
     * @return calorieCount
     */
    public int getCaloriesCount() {

        return calorieCount;

    }

    /**
     *
     * @return string
     */
    public String getConsumptionMethod() {

        return "Drink";
    }

    /**
     *
     * @return the string
     */
    @Override
    public String toString() {
        return super.toString() + " Calorie =" + calorieCount + "]" + "\n";

    }

}
