/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warungsedap;

/**
 *
 * @author Khoirul Umam
 */
public abstract class Makanan {
    protected String deskripsi;
    
    public String getDeskripsi(){
        return deskripsi;
    }
    
    public abstract int harga();
}
