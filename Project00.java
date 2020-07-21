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
public class Project00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        manipulateString string = new manipulateString();
        
        AppendToString appString = new AppendToString(string);
        DeleteBeginingString delBegString = new DeleteBeginingString(string);
        DeleteEndString delEndString = new DeleteEndString(string);
        CapitalizeString capString = new CapitalizeString(string);
        DecapitalizeString decapString = new DecapitalizeString(string);
        TitleCaseString titleCaseString = new TitleCaseString(string);
        
        EditString edit = new EditString();
        edit.getEdit(appString);
        edit.getEdit(appString);
        edit.getEdit(delBegString);
        edit.getEdit(delBegString);
        edit.getEdit(delEndString);
        edit.getEdit(delEndString);
        edit.getEdit(capString);
        edit.getEdit(decapString);
        edit.getEdit(titleCaseString);
        
        edit.makeEdit();
        edit.undoEdit();
        edit.undoEdit();
        edit.undoEdit();
        edit.undoEdit();
        edit.undoEdit();
        edit.redoEdit();
        edit.redoEdit();
        edit.redoEdit();
        edit.redoEdit();
        edit.undoEdit();
        edit.redoEdit();
        edit.undoEdit();
        edit.undoEdit();
        edit.redoEdit();
        edit.redoEdit();
    }
}