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

public class Asian extends Human implements Skill {
    public void looks(){
        System.out.println("I look like a Korean actor");
    }
    
    public void dance(String name){
        System.out.println("I can perform the " + name + " dance");
    }
    
    public void sing(){
        System.out.println("I sing nicely");
    }
}
