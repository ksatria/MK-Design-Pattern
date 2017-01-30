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
public class MiniDuckSimulator {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();
        
        Duck wooden = new WoodenDuck();
        wooden.display();
        wooden.performFly();
        wooden.setFlyBehaviour(new FlyRocketPowered());
        wooden.performFly();
    }
    
}
