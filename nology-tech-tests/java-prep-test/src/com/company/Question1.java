package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1 {
    public List <Integer> listOfNumbers;

    public ArrayList findTwoLargestNumbers(List<Integer> listOfNumbers) {
        // If I had more time, I would try and implement a sorting algorithm and then just grab the elements at the last index and last index -1.
        // Using two for loops does work, but it is perhaps not the most efficient solution.
        // If I had more time to improve my current method, I could pull the for loop into its own function which would take an argument of xlargestNumber, which would reduce lines of code.

        // Initialise
        int firstLargestNumber = 0;
        // Loop through and replace firstLargest if a number is bigger
        for (int number: listOfNumbers ) {
            if (number > firstLargestNumber) {
                firstLargestNumber = number;
            }
        }
        // remove first largest number from array
        int indexOfFirstLargestNumber = listOfNumbers.indexOf(firstLargestNumber);
        listOfNumbers.remove(indexOfFirstLargestNumber);
        // loop again and find the second-largest number
        int secondLargestNumber = 0;
        for (int number: listOfNumbers) {
            if (number > secondLargestNumber) {
                secondLargestNumber = number;
            }
        }
        ArrayList<Integer> twoLargestNumbers = new ArrayList<>(Arrays.asList(firstLargestNumber, secondLargestNumber));
        return twoLargestNumbers;
    }


}
