/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saleselektronik;

/**
 *
 * @author User
 */
import java.util.ArrayList;

public class TokoA {
    ArrayList barang;
    
    public TokoA(){
        barang = new ArrayList();
        
        tambahBarang("iPhone 7","Smartphone incaran masa kini",10000000);
        tambahBarang("ASUS ROG","Laptop para gamer",14000000);
        tambahBarang("Nokia","The legend reborn",3200000);
    }
    
    public void tambahBarang(String nama, String deskripsi, int harga){
        Barang b = new Barang(nama,deskripsi,harga);
        barang.add(b);
    }
    
    public Iterator createIterator(){
        return new TokoAIterator(barang);
    }
}
