/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom;

/**
 *
 * @author Khoirul Umam
 */
public class KingdomSimulation {
    public static void main(String[] args) {
        King king = new King();
        System.out.println("Aku seorang raja");
        king.fight();
        king.defend();
    }
    
}
