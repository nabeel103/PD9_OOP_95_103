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


public class Task3 {
    
    static String ridMultipleBlank(String s){
        
        String noSpace = "";
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == ' ' && s.charAt(i+1) == ' ')) {
                noSpace += s.charAt(i);
            }
            
        }
        
        return noSpace;
    }
    
    static String removeInteger(String s)
    {
        String noInt = "";
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i)>=48 && s.charAt(i)<=57)) {
                noInt = noInt + s.charAt(i);
            }
        }
        return noInt;
    }
    
    static String stringEncryption(String s)
    {
        String encryptedWord = "";
        int key = 3;
        for (int i = 0; i < s.length(); i++) {
            if ( s.charAt(i) >= 35 && s.charAt(i) <= 126) {
                encryptedWord = encryptedWord + Character.toString((char) (s.charAt(i)-key));
            }
            if(s.charAt(i)<35)
            {
                encryptedWord = encryptedWord + "@" + (35 - s.charAt(i));
            }
        }
        return encryptedWord;
    }
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        String str ;
        System.out.println("Input String (Extra Spaces) : ");
        str = cin.nextLine();
        System.out.println("\nExtra spaces has been removed : ");
        System.out.println(ridMultipleBlank(str));
        
        System.out.println("Input String (Remove Integer) : ");
        str = cin.nextLine();
        System.out.println("\nIntegers have been removed");
        System.out.println(removeInteger(str));
        
        System.out.println("Input String (For Encryption) : ");
        str = cin.nextLine();
        System.out.println("Encrypted String is : ");
        System.out.println(stringEncryption(str));
        
        cin.close();
        
    }
    
}
