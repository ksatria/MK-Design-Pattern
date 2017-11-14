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
public interface State {
    void koinMasuk();
    void koinKeluar();
    void putarTuas();
    void keluarkanPermen();
    void isiUlang(int jumlahPermen);
}
