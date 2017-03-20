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
public class TelevisionPlayCommand implements Command {
    Television tv;
    
    public TelevisionPlayCommand(Television tv) {
        this.tv = tv;
    }
    
    public void execute() {
        tv.play();
    }
}
