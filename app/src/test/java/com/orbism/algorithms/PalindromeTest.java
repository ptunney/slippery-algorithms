package com.orbism.algorithms;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class PalindromeTest {

    private Palindrome p;

    @Before
    public void setup() {
        p = new Palindrome();
    }

    @Test
    public void racecarIsAPalindrome() {        
        assertTrue("We know racEcar is a palindrome", p.isPalindrome("racecar"));
    }

    @Test
    public void evenLenghtPalindromeIsAPalindrome() {
        assertTrue("We know noon is a palindrome", p.isPalindrome("noon"));        
    }

    @Test
    public void cabbageIsNotAPalindrome() {
        assertFalse("We know cabbage is NOT a palindrome", p.isPalindrome("cabbage"));                
    }

    @Test
    public void cabbagIsNotAPalindrome() {
        assertFalse("We know cabbag is NOT a palindrome", p.isPalindrome("cabbag"));                
    }
}