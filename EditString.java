/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project00;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AshleyRoselius
 */
public class EditString {
    private List<stringEditing> editing = new ArrayList<stringEditing>();
    Stack<stringEditing> undoStack = new Stack<stringEditing>();
    Stack<stringEditing> redoStack = new Stack<stringEditing>();
    
    public void getEdit(stringEditing edit) {
        editing.add(edit);
        undoStack.push(edit);
    }
    
    public void makeEdit() {
        for(stringEditing edit: editing){
            edit.execute();
        }
        editing.clear();
    }
    
    public void undoEdit() {
        stringEditing edit = undoStack.pop();
        redoStack.push(edit);
        edit.undo();
    }
    
    public void redoEdit() {
        stringEditing edit = redoStack.pop();
        undoStack.push(edit);
        edit.execute();
    }
}
