/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
/**
 *
 * @author administrator
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String inpString;
        try ( Scanner strMe = new Scanner(System.in)) {
            System.out.println("String to flip:");
            inpString = strMe.next();
            }
        
        String myString;
        myString = inpString;
       
        System.out.println(myString);
        
     StringBuilder strBuffer = new StringBuilder(myString.length());
     
     for(int i = myString.length() - 1; i >= 0; i--){
            strBuffer.append(myString.charAt(i));
    }
     String revString = strBuffer.toString();
     System.out.println(revString);
    }
}