/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniducksimulator;

/**
 *
 * @author Khoirul Umam
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }
    
    public void display() {
        System.out.println("I'm a model duck");
    }
}
