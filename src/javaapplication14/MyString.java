/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author Windows 10
 */
public class MyString {
    /**
     * Example 1
     * This will return a string multiple times
     * @param s
     * @param i
     * @return string
     */
    String multipleTimes(String s,int i)
    {
        String string = "";
        for (int j = 1; j <= i; j++) {
            string  = string + s + " ";
        }
        return string;
    }
    /**
     * overloading
     * this will return a string multiple time and also add a specific character between them
     * @param s
     * @param i
     * @param c
     * @return string 
     */
    String multipleTimes(String s,int i,char c)
    {
        String string = "";
        for (int j = 1; j <= i; j++) {
            string  = string + s + Character.toString(c);
        }
        return string;
    }
    
    
    /**
     * Example 2
     * This will remove a specific character from String
     * @param s
     * @param c
     * @return string
     */
    String removeASpecific(String s, char c)
    {
        String string = "";
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == c)) {
                string = string  + s.charAt(i);
            }
        }
        return string;
    }
    
    
    /**
     * Example 3
     * Reverse Sentence
     * @param s
     * @return string
     */
    String reverseWords(String s)
    {
        String [] split = s.split(" ");
        
        String string = "";
        for (int i = split.length-1; i >=0; i--) {
            
            string  = string + " "+ split[i];
            
            
        }
        return string;
    }
    
    
    /**
     * Example 4
     * This will replace a specific character
     * @param s
     * @param c
     * @return string
     */
    String replaceCharacters(String s, char c1, char c2)
    {
        String string = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==c1)
            {
                string  = string + c2;
            }
            else{
                string  = string + s.charAt(i);
            }
        }
        return string;
    }
    
    
    /**
     * This will check, whether the string is palindrome or not
     * @param s
     * @return true/false
     */
    boolean isPalindrome(String s)
    {
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
    
    
}
