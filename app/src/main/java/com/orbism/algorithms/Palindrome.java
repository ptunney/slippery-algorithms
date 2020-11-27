package com.orbism.algorithms;

public class Palindrome {
 
    public boolean isPalindrome(String example) {
        int halfWaythere = example.length() /2;
        boolean result = true;
        int z = example.length()-1;
        int i = 0;
        
        while (i<halfWaythere && result==true) {
            if (example.charAt(i) != example.charAt(z)) {
                result = false;
            }
            z--;
            i++;
        }

        return result;
    }

    public static void main(String args[]) {
        Palindrome p = new Palindrome();
        p.isPalindrome("cabbage");
    }
}