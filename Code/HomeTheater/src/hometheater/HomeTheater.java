/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometheater;

/**
 *
 * @author User
 */
public class HomeTheater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pilih film
        String film = "Habibie & Ainun";
        
        // Instalasi perlengkapan
        Sound sound             = new Sound();
        Amplifier amplifier     = new Amplifier();
        DVDPlayer dvd           = new DVDPlayer(film);
        Proyektor proyektor     = new Proyektor(dvd);
        LampuRuangan lampu      = new LampuRuangan();
        Layar layar             = new Layar();
        PopcornPopper popcorn   = new PopcornPopper();
        
        // Mulai menonton film
       RemoteControl remote = new RemoteControl(sound,amplifier,dvd,proyektor,popcorn,layar,lampu);
       remote.watchMovie();
       lampu.redup(30);
       remote.endMovie();
    }
    
}
