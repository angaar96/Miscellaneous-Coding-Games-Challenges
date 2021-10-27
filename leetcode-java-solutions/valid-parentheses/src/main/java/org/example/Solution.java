package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public Solution() {
    }

    public boolean checkIfNested (String inputString) {
        // Split the input string into an array.
        List<String> splitStringArr = Arrays.asList(inputString.split(""));
        // Use a regex search pattern to filter out all elements of the array that are not brackets.
        ArrayList<String> onlyBracketsArr = splitStringArr.stream().filter(character -> character.matches("[()\\[\\]{}]")).collect(Collectors.toCollection(ArrayList::new));
        // Initialise lookup tables for the brackets.
        HashMap <String,String> bracketsHashMap = new HashMap<>();
        bracketsHashMap.put("{", "}");
        bracketsHashMap.put("[", "]");
        bracketsHashMap.put("(", ")");

        // Needed as there is no easy way to grab a key from a value.

        HashMap <String,String> bracketsHashMapReversed = new HashMap<>();
        bracketsHashMapReversed.put("}","{");
        bracketsHashMapReversed.put("]","[");
        bracketsHashMapReversed.put(")", "(");

//        If the number of opening brackets does not match the number of closing ones, then the nesting is incorrect as there is an unclosed or unopened bracket somewhere.

//        ArrayList<String> closingBracketsArr = onlyBracketsArr.stream().filter(letter -> bracketsHashMap.values().contains(letter)).collect(Collectors.toCollection(ArrayList::new));
//        ArrayList<String> openingBracketsArr = onlyBracketsArr.stream().filter(letter -> bracketsHashMap.keySet().contains(letter)).collect(Collectors.toCollection(ArrayList::new));
//        if (closingBracketsArr.size() != openingBracketsArr.size()) {
//            System.out.println("false");
//            return false;
//        }

        // Easier way to check if number of opening brackets matches number of closing brackets - they will come as pairs if correct, therefore the total number of brackets must always be even.
        if (onlyBracketsArr.size() % 2 != 0) {
            return false;
        }

        // A stack is the best data structure for this problem. A stack is a linear data structure which performs operations in a LIFO (Last in , first out) order and holds a list of elements.
        // This means that the most recently added element is the first element to be removed. A stack has two main operations that occur only at the TOP of the stack - push and pop.
        Stack<String> closingBracketsStack = new Stack<>();
        for (String bracket: onlyBracketsArr) {
            if (bracketsHashMap.containsKey(bracket)) {
                closingBracketsStack.push(bracket);
            } else if (closingBracketsStack.size() > 0 && closingBracketsStack.peek().equals(bracketsHashMapReversed.get(bracket))) {
                closingBracketsStack.pop();
            } else {
                System.out.println(false);
                return false;
            }
        }
        // If there is nothing left in the stack, then all the opening brackets were matched with a corresponding closing bracket and the expression is properly nested.
        return closingBracketsStack.size() == 0;

        }
    }


