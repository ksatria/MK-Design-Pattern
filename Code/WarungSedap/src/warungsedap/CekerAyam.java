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
public class CekerAyam extends RempahRempah{
    public CekerAyam(Makanan makanan) {
        this.makanan = makanan;
    }
    
    public String getDeskripsi() {
        return makanan.getDeskripsi() + ", Ceker Ayam";
    }
    
    public int harga() {
        return makanan.harga() + 1500;
    }
}
