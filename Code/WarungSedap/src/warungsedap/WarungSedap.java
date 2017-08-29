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
public class WarungSedap {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Makanan makanan = new Bakso();
        System.out.println(makanan.getDeskripsi() + " Rp." + makanan.harga());
        
        Makanan makanan2 = new Bakso();
        makanan2 = new Lontong(makanan2);
        System.out.println(makanan2.getDeskripsi() + " Rp." + makanan2.harga());
        
        Makanan makanan3 = new Bakso();
        makanan3 = new CekerAyam(makanan3);
        System.out.println(makanan3.getDeskripsi() + " Rp." + makanan3.harga());
        
        Makanan makanan4 = new Bakso();
        makanan4 = new CekerAyam(makanan4);
        makanan4 = new Lontong(makanan4);
        makanan4 = new Lontong(makanan4);
        System.out.println(makanan4.getDeskripsi() + " Rp." + makanan4.harga());
        
        Makanan pecel = new Pecel();
        System.out.println(pecel.getDeskripsi() + " Rp." + pecel.harga());
        
        pecel = new CekerAyam(pecel);
        System.out.println(pecel.getDeskripsi() + " Rp." + pecel.harga());
        
        pecel = new CekerAyam(pecel);
        System.out.println(pecel.getDeskripsi() + " Rp." + pecel.harga());
    }
    
}
