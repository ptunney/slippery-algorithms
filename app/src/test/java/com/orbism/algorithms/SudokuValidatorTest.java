package com.orbism.algorithms;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * Sudoku Validator
Requirements:
each row contains digits 1 to 9, each digit occurs only once
each col contains digits 1 to 9, each digit occurs only once
each sub-grid (3x3) contains digits 1 to 9, each digit occurs only once
For example, here is a valid grid which should return true:
int sudokuGrid = {
 {5,3,4,6,7,8,9,1,2},
 {6,7,2,1,9,5,3,4,8},
 {1,9,8,3,4,2,5,6,7},
 {8,5,9,7,6,1,4,2,3},
 {4,2,6,8,5,3,7,9,1},
 {7,1,3,9,2,4,8,5,6},
 {9,6,1,5,3,7,2,8,4},{2,8,7,4,1,9,6,3,5},
 {3,4,5,2,8,6,1,7,9}}; (edited) 
 * 
 */
public class SudokuValidatorTest {

    private SudokuValidator sv;

    private int[][] validGrid = new int[][] {
                                    {5,3,4,6,7,8,9,1,2},
                                    {6,7,2,1,9,5,3,4,8},
                                    {1,9,8,3,4,2,5,6,7},
                                    {8,5,9,7,6,1,4,2,3},
                                    {4,2,6,8,5,3,7,9,1},
                                    {7,1,3,9,2,4,8,5,6},
                                    {9,6,1,5,3,7,2,8,4},
                                    {2,8,7,4,1,9,6,3,5},
                                     {3,4,5,2,8,6,1,7,9}}; 
    
    private int[][] invalidGrid = new int[][] {
                                    {5,5,5,6,7,8,9,1,2},
                                    {5,5,5,1,9,5,3,4,8},
                                    {1,9,8,3,4,2,5,6,7},
                                    {8,5,9,7,6,1,4,2,3},
                                    {4,2,6,8,5,3,7,9,1},
                                    {7,1,3,9,2,4,8,5,6},
                                    {9,6,1,5,3,7,2,8,4},
                                    {2,8,7,4,1,9,6,3,5},
                                     {3,4,5,2,8,6,1,7,9}}; 
    @Before
    public void setup() {
        sv = new SudokuValidator();
    }

    @Test
    public void validSudukoIsValid() {
        assertTrue("Valid grid validates as true", sv.isValid(validGrid));
    }

    @Test
    public void invalidSudukoReturnsFalse() {
        assertFalse("Invalid grid validates as false", sv.isValid(invalidGrid));
    }

}