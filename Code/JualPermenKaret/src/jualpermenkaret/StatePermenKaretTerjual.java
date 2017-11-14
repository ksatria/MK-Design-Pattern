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
public class StatePermenKaretTerjual implements State{
    private MesinPermenKaret mesin;
    
    public StatePermenKaretTerjual(MesinPermenKaret mesin){
        this.mesin = mesin;
    }
    
    @Override
    public void koinMasuk(){
        System.out.println("Maaf, koin tidak dapat dimasukkan saat sedang ada penjualan");
    }
    
    @Override
    public void koinKeluar(){
        System.out.println("Maaf, koin tidak dapat diambil kembali");
    }
    
    @Override
    public void putarTuas(){
        System.out.println("Mohon menunggu, permen sedang dikeluarkan");
    }
    
    @Override
    public void keluarkanPermen(){
        mesin.keluarkanPermen(1);
        
        if(mesin.getSisaPermen() > 0)
            mesin.setState(mesin.getTidakAdaKoinState());
        else
            mesin.setState(mesin.getPermenKaretHabisState());
    }
    
    @Override
    public void isiUlang(int jumlahPermen){
        System.out.println("Penjualan permen sedang berlangsung, mohon menunggu");
    }
}
