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
public class Donut extends TimsProduct implements Consumable {

    /**
     * create the variable of the description and calorie
     */
    private String description;
    private int calorieCount;

    /**
     * all variable set in the donut class
     *
     * @param name
     * @param Description
     * @param cost
     * @param price
     * @param calories constructor of donut
     */
    public Donut(String name, String Description, double cost, double price, int calories) {

        super(name, cost, price);
        this.description = description;
        calorieCount = calories;

    }
//Create method start from here

    public static Donut create() {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter type of Donut (1=Vanilla, 2=Old Fashion, 3=Chocolate): ");
            int item = in.nextInt();
            switch (item) {
                case 1:
                    return new Donut("Donut -> Vanilla", "Yeast Donut with vanilla ice-Cream  ", 0.25, 1.00, 280);
                case 2:
                    return new Donut("Donut -> Old Fashion", "Very Old fashion donut ", 0.25, 1.00, 300);
                case 3:
                    return new Donut("Donut -> Chocolate", "Noithing better than Chocolate ", 0.25, 1.00, 320);
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
    @Override
    public int getCaloriesCount() {

        return calorieCount;

    }

    /**
     *
     * @return Eat
     */
    @Override
    public String getConsumptionMethod() {

        return "Eat";
    }

    /**
     *
     * @return string
     */
    @Override
    public String toString() {
        return super.toString() + " \tCalorie= " + calorieCount + " ]" + "\n";

    }
}
