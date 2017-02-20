/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzafactory;

/**
 *
 * @author Khoirul Umam
 */
public class PizzaFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
	PizzaStore chicagoStore = new ChicagoPizzaStore();
 
	Pizza pizza = nyStore.orderPizza("cheese");
	System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
	pizza = chicagoStore.orderPizza("cheese");
	System.out.println("Joel ordered a " + pizza.getName() + "\n");

	pizza = nyStore.orderPizza("clam");
	System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
	pizza = chicagoStore.orderPizza("clam");
	System.out.println("Joel ordered a " + pizza.getName() + "\n");

	pizza = nyStore.orderPizza("pepperoni");
	System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
	pizza = chicagoStore.orderPizza("pepperoni");
	System.out.println("Joel ordered a " + pizza.getName() + "\n");

	pizza = nyStore.orderPizza("veggie");
	System.out.println("Ethan ordered a " + pizza.getName() + "\n");
 
	pizza = chicagoStore.orderPizza("veggie");
	System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}