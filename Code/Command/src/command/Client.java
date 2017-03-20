/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author Khoirul Umam
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /** INVOKER **/
        SimpleRemoteControl remote  = new SimpleRemoteControl();
        
        /** RECEIVER **/
        Light light             = new Light();
        GarageDoor garageDoor   = new GarageDoor();
        Television tv           = new Television();
        
        /** COMMAND **/
        LightOnCommand lightOn          = new LightOnCommand(light);
        GarageDoorOpenCommand doorOpen  = new GarageDoorOpenCommand(garageDoor);
        TelevisionPlayCommand tvPlay    = new TelevisionPlayCommand(tv);
        
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(doorOpen);
        remote.buttonWasPressed();
        remote.setCommand(tvPlay);
        remote.buttonWasPressed();
    }
    
}
