package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void CorrectlyNestedString_ShouldReturnTrue() {
        // 1. Arrange (your dependencies)
        Solution solution = new Solution();
        // 2. Act (call the methods)
        boolean answer = solution.checkIfNested("{()[]}");
        // 3. Assert (Check the results are what you expect).
        assertEquals(true,answer);
    }

    @Test
    public void Palindrome_ShouldReturnTrue() {
        // 1. Arrange (your dependencies)
        Solution solution = new Solution();
        // 2. Act (call the methods)
        boolean answer = solution.checkIfNested("{[()]}");
        // 3. Assert (Check the results are what you expect).
        assertEquals(true,answer);
    }

    @Test
    public void IncorrectNesting_ShouldReturnFalse() {
        // 1. Arrange (your dependencies)
        Solution solution = new Solution();
        // 2. Act (call the methods)
        boolean answer = solution.checkIfNested("{([)]}");
        // 3. Assert (Check the results are what you expect).
        assertEquals(false,answer);
    }

    @Test
    public void StringWithUnclosedBracket_ShouldReturnFalse() {
        // 1. Arrange (your dependencies)
        Solution solution = new Solution();
        // 2. Act (call the methods)
        boolean answer = solution.checkIfNested("{([]}");
        // 3. Assert (Check the results are what you expect).
        assertEquals(false,answer);
    }
    @Test
    public void StringWithUnopenedBracket_ShouldReturnFalse() {
        // 1. Arrange (your dependencies)
        Solution solution = new Solution();
        // 2. Act (call the methods)
        boolean answer = solution.checkIfNested("{[])}");
        // 3. Assert (Check the results are what you expect).
        assertEquals(false,answer);
    }

    @Test
    public void CorrectlyNestedString_WithCharactersThatArentBrackets_ShouldReturnTrue() {
        // 1. Arrange (your dependencies)
        Solution solution = new Solution();
        // 2. Act (call the methods)
        boolean answer = solution.checkIfNested("{(example)[55]example}");
        // 3. Assert (Check the results are what you expect).
        assertEquals(true,answer);
    }

    @Test
    public void DifferentCorrectlyNestedString_ShouldReturnTrue() {
        // 1. Arrange (your dependencies)
        Solution solution = new Solution();
        // 2. Act (call the methods)
        boolean answer = solution.checkIfNested("{[]()[](){}{[]}([{}]){[]}}");
        // 3. Assert (Check the results are what you expect).
        assertEquals(true,answer);
    }






}
