/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Task2 {
    
    
    static String displayVertical(String s){
        
        String string = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=' ') {                  // spaces cannot be displayed vertically
                string = string + s.charAt(i) + "\n";
            }
        }
        
        return string;
    }
    
    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
    
        System.out.println("Please enter a sentence: ");
        String s = cin.nextLine();
        
        s = displayVertical(s);
        System.out.println("Your sentence printed vertically is: \n"+s);
        
        cin.close();
        
    }
}
