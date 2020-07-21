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
public class DecapitalizeString implements stringEditing {
    private manipulateString stringManipulate;
    
    public DecapitalizeString(manipulateString stringManipulate) {
        this.stringManipulate = stringManipulate;
    }
    
    public void execute() {
        stringManipulate.decapitalizeString();
    }
    
    public void undo() {
        stringManipulate.undoEdit();
    }
}
