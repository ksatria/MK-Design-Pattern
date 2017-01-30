/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

/**
 *
 * @author Khoirul Umam
 */

public abstract class Human {
    public String name;
    public char gender;
    
    public abstract void looks();
    
    public void move(String direction){
        System.out.println("I move to " + direction);
    }
}
