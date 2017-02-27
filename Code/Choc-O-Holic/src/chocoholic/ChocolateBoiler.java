/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chocoholic;

/**
 *
 * @author Khoirul Umam
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;
    
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    
    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new ChocolateBoiler();
        
        return uniqueInstance;
    }
    
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }
    
    public void drain() {
        if (!isEmpty() && isBoiled()) {
        // drain the boiled milk and chocolate
        empty = true;
        }
    }
    
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
        // bring the contents to a boil
        boiled = true;
        }
    }
    
    public boolean isEmpty() {
        return empty;
    }
    
    public boolean isBoiled() {
        return boiled;
    }
}