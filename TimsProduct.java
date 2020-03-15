/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

/**
 *
 * @author SACHIN PATEL (000771663)
 */
//this is abstract class with implemented from the commodity interface
public abstract class TimsProduct implements Commodity {

    //Name of the product 
    private String name;

    //cost of the product
    private  double cost;

    //price for the product 
    private double price;

    /**
     *
     * @param name
     * @param cost
     * @param price all parameter set in the constructor
     */
    public TimsProduct(String name, double cost, double price) {

        this.name = name;
        this.cost = cost;
        this.price = price;

    }

    /**
     *
     * @return name of the product
     */
    public String getName() {

        return name;
    }

    /**
     *
     * @return cost of the product this is override method
     */
    @Override
    public double getProductionCost() {

        return cost;
    }

    /**
     *
     * @return price of the product this is override method
     */
    @Override
    public double getRetailPrice() {

        return price;
    }

    /**
     * @return String for the product this is override method of toString
     */
    @Override
    public String toString() {
        return String.format("[ Name = %s,\tPrice = %.2f ,", name, price);
    }
}
