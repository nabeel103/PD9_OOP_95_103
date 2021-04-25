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
public class Task4 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        MyString ms = new MyString();
        String s = new String();
        
        System.out.println("Enter s String :");
        s = cin.nextLine();
        System.out.println("String has veen displayed 5 times : " + ms.multipleTimes(s, 5));
        System.out.println("String has veen displayed 5 times with a character @ : " + ms.multipleTimes(s, 5,'@'));
        System.out.println("Character 's' has been removed from String : "+ ms.removeASpecific(s, 's'));
        System.out.println("Your Sentence has been reversed : "+ ms.reverseWords(s));
        System.out.println("Your character 's' has been replaced with 'a' : " + ms.replaceCharacters(s, 's','a'));
        if (ms.isPalindrome(s)) {
            System.out.println("Your String is palindrome");
        }
        else{
            System.out.println("Your String is not palindrome");
        }
        
    }
    
}
