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
public class StateAdaKoin implements State{
    private MesinPermenKaret mesin;
    
    public StateAdaKoin(MesinPermenKaret mesin){
        this.mesin = mesin;
    }
    
    @Override
    public void koinMasuk(){
        System.out.println("Maaf, Anda sudah memasukkan koin");
    }
    
    @Override
    public void koinKeluar(){
        System.out.println("Koin diambil kembali, penjualan dibatalkan");
        mesin.setState(mesin.getTidakAdaKoinState());
    }
    
    @Override
    public void putarTuas(){
        System.out.println("Tuas diputar");
        mesin.setState(mesin.getPermenKaretTerjualState());
    }
    
    @Override
    public void keluarkanPermen(){
        System.out.println("Mohon putar tuas terlebih dahulu");
    }
    
    @Override
    public void isiUlang(int jumlahPermen){
        System.out.println("Isi ulang tidak bisa dilakukan saat ada penjualan");
    }
}
