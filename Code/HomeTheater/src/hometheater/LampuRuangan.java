/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometheater;

/**
 *
 * @author User
 */
public class LampuRuangan {
    public void hidup(){
        System.out.println("Lampu ruangan menyala terang");
    }
    
    public void padam(){
        System.out.println("Lampu ruangan dipadamkan");
    }
    
    public void redup(int level){
        System.out.println("Lampu ruangan menyala redup dengan intensitas " + level + "%");
    }
}
