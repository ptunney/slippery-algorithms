package com.orbism.algorithms;

import java.util.Stack;
import java.util.Arrays;

public class Calculator {

    private static char[] MATH_SYMBOLS = new char[] {'*','/','-','+'};

    public int calculate(String input) {
        Arrays.sort(MATH_SYMBOLS);
        char[] chars = input.toCharArray();
        char sign = ' ';
        Stack<Integer> values = new Stack<Integer>();
        if (chars.length == 0) {
            return 0;
        }
    
        int num = Character.getNumericValue(chars[0]);  ;
        values.push(num);
        for (int i=1; i<chars.length; i++) {
            char ch = chars[i];
            
            if ( Character.isDigit(ch) ) {
                num = Character.getNumericValue(ch);  
                
                if (sign == '+') values.push(num);
                if (sign == '-') values.push(-num);
                if (sign == '*') values.push(values.pop() * num);
                if (sign == '/') values.push(values.pop() / num);                                     
            } else if (Arrays.binarySearch(MATH_SYMBOLS, ch)> -1) {                
                sign = ch;
                //reset 
                num = 0;
            }
        }

        return sumStack(values);
    }

    private int sumStack(Stack<Integer> stack) {
        int ans = 0;
        for (Integer item: stack) {
            ans += item;
        }
        return ans;
    }

    public static void main(String args[]) {
        Calculator c = new Calculator();
        c.calculate("2*4");
    }
}