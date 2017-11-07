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
public class TokoB {
    static final int MAX_BARANG = 10;
    int jumlahBarang = 0;
    Barang[] barang;
    
    public TokoB(){
        barang = new Barang[MAX_BARANG];
        
        tambahBarang("TV","LED 21 inchi",5400000);
        tambahBarang("Kulkas","Dua pintu",2500000);
        tambahBarang("Mesin cuci","Bukaan atas",2300000);
    }
    
    public void tambahBarang(String nama, String deskripsi, int harga){
        Barang b = new Barang(nama,deskripsi,harga);
        
        if(jumlahBarang >= MAX_BARANG){
            System.err.println("Daftar barang sudah maksimal");
        }
        else{
            barang[jumlahBarang] = b;
            jumlahBarang += 1;
        }
    }
    
    public Iterator createIterator(){
        return new TokoBIterator(barang);
    }
}
