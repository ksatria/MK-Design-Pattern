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
public class StateTerjualDenganBonus implements State{
    private MesinPermenKaret mesin;
    
    public StateTerjualDenganBonus(MesinPermenKaret mesin){
        this.mesin = mesin;
    }
    
    @Override
    public void koinMasuk(){
    }
    
    @Override
    public void koinKeluar(){
    }
    
    @Override
    public void putarTuas(){
    }
    
    @Override
    public void keluarkanPermen(){
    }
    
    @Override
    public void isiUlang(int jumlahPermen){
    }
}
