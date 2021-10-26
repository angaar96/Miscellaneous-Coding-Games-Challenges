package com.company;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Question1Tests {

    @Test
    public void Question1_GivenAList_ReturnsCorrectTwoNumbers() {
        // 1. Arrange (your dependencies)
        Question1 Q1 = new Question1();
        // 2. Act (call the methods)
        List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> result = Q1.findTwoLargestNumbers(listOfNumbers);
        int firstLargest = result.get(0);
        int secondLargest = result.get(1);
        // 3. Assert (Check the results are what you expect).
        assertEquals(6, firstLargest);
        assertEquals(5, secondLargest);
    }

    @Test
    public void Question1_GivenALargerList_ReturnsCorrectTwoNumbers() {
        // 1. Arrange (your dependencies)
        Question1 Q1 = new Question1();
        // 2. Act (call the methods)
        List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> result = Q1.findTwoLargestNumbers(listOfNumbers);
        int firstLargest = result.get(0);
        int secondLargest = result.get(1);
        // 3. Assert (Check the results are what you expect).
        assertEquals(10, firstLargest);
        assertEquals(9, secondLargest);
    }

    @Test
    public void Question1_GivenARandomlyOrderedList_ReturnsCorrectTwoNumbers() {
        // 1. Arrange (your dependencies)
        Question1 Q1 = new Question1();
        // 2. Act (call the methods)
        List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(10,5,7,2,8,7,21));
        List<Integer> result = Q1.findTwoLargestNumbers(listOfNumbers);
        int firstLargest = result.get(0);
        int secondLargest = result.get(1);
        // 3. Assert (Check the results are what you expect).
        assertEquals(21, firstLargest);
        assertEquals(10, secondLargest);
    }
    @Test
    public void Question1_GivenARandomlyOrderedListWithNegativeNumbers_ReturnsCorrectTwoNumbers() {
        // 1. Arrange (your dependencies)
        Question1 Q1 = new Question1();
        // 2. Act (call the methods)
        List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(-10,5,7,-2,8,42,-21));
        List<Integer> result = Q1.findTwoLargestNumbers(listOfNumbers);
        int firstLargest = result.get(0);
        int secondLargest = result.get(1);
        // 3. Assert (Check the results are what you expect).
        assertEquals(42, firstLargest);
        assertEquals(8, secondLargest);
    }

    @Test
    public void Question1_GivenARandomlyOrderedListWithNegativeNumbersAndLargerNumbers_ReturnsCorrectTwoNumbers() {
        // 1. Arrange (your dependencies)
        Question1 Q1 = new Question1();
        // 2. Act (call the methods)
        List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(-1000,800,2100,3800,9000,42,-21));
        List<Integer> result = Q1.findTwoLargestNumbers(listOfNumbers);
        int firstLargest = result.get(0);
        int secondLargest = result.get(1);
        // 3. Assert (Check the results are what you expect).
        assertEquals(9000, firstLargest);
        assertEquals(3800, secondLargest);
    }
}