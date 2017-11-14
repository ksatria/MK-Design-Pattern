/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jualpermenkaret;

/**
 *
 * @author User
 */
public class StateTidakAdaKoin implements State{
    private MesinPermenKaret mesin;
    
    public StateTidakAdaKoin(MesinPermenKaret mesin){
        this.mesin = mesin;
    }
    
    @Override
    public void koinMasuk(){
        System.out.println("Koin dimasukkan");
        mesin.setState(mesin.getAdaKoinState());
    }
    
    @Override
    public void koinKeluar(){
        System.out.println("Tidak ada koin yang bisa dikeluarkan");
    }
    
    @Override
    public void putarTuas(){
        System.out.println("Masukkan koin terlebih dahulu");
    }
    
    @Override
    public void keluarkanPermen(){
        System.out.println("Permen tidak dapat dikeluarkan");
    }
    
    @Override
    public void isiUlang(int jumlahPermen){
        System.out.println("Permen karet belum habis");
    }
}
