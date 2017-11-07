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

public class TokoAIterator implements Iterator{
    ArrayList barang;
    int posisi = 0;
    
    public TokoAIterator(ArrayList barang){
        this.barang = barang;
    }
    
    @Override
    public boolean hasNext(){
        return !(posisi >= barang.size() || barang.get(posisi) == null);
    }
    
    @Override
    public Object next(){
        Barang b = (Barang)barang.get(posisi);
        posisi += 1;
        
        return b;
    }
    
    @Override
    public Object prev(){
        return null;
    }
}
