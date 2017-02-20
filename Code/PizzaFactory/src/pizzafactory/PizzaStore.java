package pizzafactory;

public abstract class PizzaStore {
    
    abstract Pizza createPizza(String item);
    
    public Pizza orderPizza(String type) {
        
        // Membuat pizza berdasarkan pesanan
        // tanpa perlu tahu di toko mana
	Pizza pizza = createPizza(type);
        
	System.out.println("--- Making a " + pizza.getName() + " ---");
	pizza.prepare();
	pizza.bake();
	pizza.cut();
	pizza.box();
        
	return pizza;
    }
}
