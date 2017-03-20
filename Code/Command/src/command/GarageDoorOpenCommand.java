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
public class GarageDoorOpenCommand implements Command {
    GarageDoor door;
    
    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }
    
    public void execute(){
        door.up();
    }
}
