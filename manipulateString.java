/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project00;

import java.util.*;
/**
 *
 * @author AshleyRoselius
 */
public class manipulateString {
    private String string = "aahello world";
    Stack<String> previousString = new Stack<String>();
    Stack<String> previousPrint = new Stack<String>();
//    private String lastString = "aahello world";
    private char character = 'a';
    int index = 1;
    
    public void appendToString() {
        String newString;
        newString = string + character;
        System.out.println(newString + ": " + character + " is appended to " + string);
        previousString.push(string);
        previousPrint.push(newString + ": " + character + " is appended to " + string);
        string = newString;
    }
    
    public void deleteBeginingString() {
        String newString;
        newString = string.substring(1);
        System.out.println(newString + ": one letter is removed from begining of " + string);
        previousString.push(string);
        previousPrint.push(newString + ": one letter is removed from begining of " + string);
        string = newString;
    }
    
    public void deleteEndString() {
        String newString;
        newString = string.substring(0,string.length()-1);
        System.out.println(newString + ": one letter is removed from end of " + string);
        previousString.push(string);
        previousPrint.push(newString + ": one letter is removed from end of " + string);
        string = newString;
    }
    
    public void capitalizeString() {
        String newString;
        if (index > 0){
            if (index < string.length()){
                newString = string.substring(0,index) + string.substring(index,index+1).toUpperCase() + string.substring(index+1);
            } else if(index >= string.length()) {
                System.out.println("index " + index + " is out of bound");
                return;
            } else {
                newString = string.substring(0,index) + string.substring(index,index+1).toUpperCase();
            }
        } else {
            newString = string.substring(index,index+1).toUpperCase() + string.substring(index+1);
        }
        System.out.println(newString + ": letter at index " + index + " is capitalized in " + string);
        previousString.push(string);
        previousPrint.push(newString + ": letter at index " + index + " is capitalized in " + string);
        string = newString;
    }
    
    public void decapitalizeString() {
        String newString;
        if (index > 0){
            if (index < string.length()){
                newString = string.substring(0,index) + string.substring(index,index+1).toLowerCase() + string.substring(index+1);
            } else if(index >= string.length()) {
                System.out.println("index " + index + " is out of bound");
                return;
            } else {
                newString = string.substring(0,index) + string.substring(index,index+1).toLowerCase();
            }
        } else {
            newString = string.substring(index,index+1).toLowerCase() + string.substring(index+1);
        }
        System.out.println(newString + ": letter at index " + index + " is uncapitalized in " + string);
        previousString.push(string);
        previousPrint.push(newString + ": letter at index " + index + " is uncapitalized in " + string);
        string = newString;
    }
    
    public void titleCaseString() {
        String newString;
        StringBuilder titleCase = new StringBuilder(string.length());
        boolean nextTitleCase = true;
        for (char c : string.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }
            titleCase.append(c);
        }
        newString = titleCase.toString();
        System.out.println(newString + ": title case for " + string);
        previousString.push(string);
        previousPrint.push(newString + ": title case for " + string);
        string = newString;
    }
    
    public void undoEdit() {
        String lastString = previousString.pop();
        String lastMessage = previousPrint.pop();
        System.out.println(lastString + ": undo of (" + lastMessage + ")");
        string = lastString;
    }
}
