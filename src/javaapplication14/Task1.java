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
public class Task1 {
    static int wordCounter(String s)
    {
        int count = 0;  
        for (int i = 0; i < s.length()-1; i++){            // in length -1, -1 deals with space at end of the string
            if (s.charAt(i) == ' ' && s.charAt(i+1) != ' '){               // this condition also handle multiple spaces 
                count++;
            }
        }
        if (s.charAt(0) == ' '){             //this condition handles string, if 1st character of string is space
            return count;
        }
        return count+1;
        
    }
    
    static int vowelcounter(String s)
    {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {   
            switch (s.charAt(i)){   
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
            }
        }
        return count;
    }
    static int puncCount(String s)
    {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!( (s.charAt(i)>='a' && s.charAt(i)<'z') || (s.charAt(i)>='A' && s.charAt(i)<'Z') || (s.charAt(i)>='0' && s.charAt(i)<'9') || s.charAt(i)==' ')) {

                count++;
            }
        }
      return count;  
    }
    
    
    public static void main(String[] args) {
        System.out.println(wordCounter("        Nabeel i goo bo an kow eyeryt hing           "));
        System.out.println(vowelcounter("Maybe a story will cheer you up: Once upon a time, there was an ugly barnacle. It was so ugly,that everyone died. The end."));
        System.out.println(puncCount("Maybe a story will cheer you up: Once upon a time, there was an ugly barnacle. It was so ugly,that everyone died. The end."));
    }
}