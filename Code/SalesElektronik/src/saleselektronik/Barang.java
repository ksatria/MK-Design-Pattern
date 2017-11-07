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
public class Barang {
    public String nama;
    public String deskripsi;
    public int harga;
    
    public Barang(String nama, String deskripsi, int harga){
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
    }
    
    public String detailBarang(){
        return (nama + " - " + deskripsi + " | Harga: Rp" + harga);
    }
}
