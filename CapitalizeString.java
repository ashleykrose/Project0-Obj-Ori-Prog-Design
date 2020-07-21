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
public class CapitalizeString implements stringEditing {
    private manipulateString stringManipulate;
    
    public CapitalizeString(manipulateString stringManipulate) {
        this.stringManipulate = stringManipulate;
    }
    
    public void execute() {
        stringManipulate.capitalizeString();
    }
    
    public void undo() {
        stringManipulate.undoEdit();
    }
}
