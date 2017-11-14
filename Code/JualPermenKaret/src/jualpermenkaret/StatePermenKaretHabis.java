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
public class StatePermenKaretHabis implements State{
    private MesinPermenKaret mesin;
    
    public StatePermenKaretHabis(MesinPermenKaret mesin){
        this.mesin = mesin;
    }
    
    @Override
    public void koinMasuk(){
        System.out.println("Mohon maaf, stok permen sedang habis");
    }
    
    @Override
    public void koinKeluar(){
        System.out.println("Tidak ada koin");
    }
    
    @Override
    public void putarTuas(){
        System.out.println("Mohon maaf, tidak ada sisa permen di dalam mesin");
    }
    
    @Override
    public void keluarkanPermen(){
        System.out.println("Mohon maaf, tidak ada sisa permen yang dapat dikeluarkan");
    }
    
    @Override
    public void isiUlang(int jumlahPermen){
        mesin.setSisaPermen(jumlahPermen);
        System.out.println(jumlahPermen + " biji permen ditambahkan ke dalam mesin");
        mesin.setState(mesin.getTidakAdaKoinState());
    }
}
