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
public class MesinPermenKaret {
    private State adaKoin;
    private State tidakAdaKoin;
    private State permenKaretTerjual;
    private State permenKaretHabis;
    private State terjualDenganBonus;
    
    private State state;
    private int sisaPermen = 0;
    
    public MesinPermenKaret(int jumlahPermen){
        adaKoin = new StateAdaKoin(this);
        tidakAdaKoin = new StateTidakAdaKoin(this);
        permenKaretTerjual = new StatePermenKaretTerjual(this);
        permenKaretHabis = new StatePermenKaretHabis(this);
        terjualDenganBonus = new StateTerjualDenganBonus(this);
        
        sisaPermen += jumlahPermen;
        
        if(sisaPermen > 0)
            state = tidakAdaKoin;
        else
            state = permenKaretHabis;
    }
    
    public void koinMasuk(){
        state.koinMasuk();
    }
    
    public void koinKeluar(){
        state.koinKeluar();
    }
    
    public void putarTuas(){
        state.putarTuas();
        state.keluarkanPermen();
    }
    
    public void keluarkanPermen(int jumlah){
        if(sisaPermen != 0) sisaPermen -= jumlah;
        
        System.out.println("Permen karet dikeluarkan: " + jumlah + " biji (Sisa: "+ sisaPermen +")");
    }
    
    public void isiUlang(int jumlah){
        state.isiUlang(jumlah);
    }
    
    public void setState(State state){
        this.state = state;
    }
    
    public void setSisaPermen(int tambahan){
        sisaPermen += tambahan;
    }
    
    public int getSisaPermen(){
        return sisaPermen;
    }
    
    public State getAdaKoinState(){
        return adaKoin;
    }
    
    public State getTidakAdaKoinState(){
        return tidakAdaKoin;
    }
    
    public State getPermenKaretTerjualState(){
        return permenKaretTerjual;
    }
    
    public State getPermenKaretHabisState(){
        return permenKaretHabis;
    }
    
    public State getTerjualDenganBonusState(){
        return terjualDenganBonus;
    }
}
