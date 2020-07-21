/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project00;

/**
 *
 * @author AshleyRoselius
 */
public class AppendToString implements stringEditing {
    private manipulateString stringManipulate;
    
    public AppendToString(manipulateString stringManipulate) {
        this.stringManipulate = stringManipulate;
    }
    
    public void execute() {
        stringManipulate.appendToString();
    }
    
    public void undo() {
        stringManipulate.undoEdit();
    }
}
