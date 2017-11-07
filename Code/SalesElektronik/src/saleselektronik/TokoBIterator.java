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
public class TokoBIterator implements Iterator{
    Barang[] barang;
    int posisi = 0;
    
    public TokoBIterator(Barang[] barang){
        this.barang = barang;
    }
    
    @Override
    public boolean hasNext(){
        return !(posisi >= barang.length || barang[posisi] == null);
    }
    
    @Override
    public Object next(){
        Barang b = barang[posisi];
        posisi += 1;
        
        return b;
    }
    
    @Override
    public Object prev(){
        return null;
    }
}
