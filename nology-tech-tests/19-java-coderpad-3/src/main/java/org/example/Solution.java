package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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

        HashMap <String,String> bracketsHashMapReversed = new HashMap<>();
        bracketsHashMapReversed.put("}","{");
        bracketsHashMapReversed.put("]","[");
        bracketsHashMapReversed.put(")", "(");

        ArrayList<String> closingBracketsArr = onlyBracketsArr.stream().filter(letter -> bracketsHashMap.values().contains(letter)).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<String> openingBracketsArr = onlyBracketsArr.stream().filter(letter -> bracketsHashMap.keySet().contains(letter)).collect(Collectors.toCollection(ArrayList::new));
        // If the number of opening brackets does not match the number of closing ones, then the nesting is incorrect as there is an unclosed or unopened bracket somewhere.
        if (closingBracketsArr.size() != openingBracketsArr.size()) {
            return false;
        }
        for (int i=0; i<onlyBracketsArr.size(); i++) {
            // We need to check if an opening bracket element is followed by a closing bracket that is of a different type, i.e. if "(" is followed by "]", then the nesting is incorrect.
            if (bracketsHashMap.containsKey(onlyBracketsArr.get(i)) && bracketsHashMap.containsValue(onlyBracketsArr.get(i+1))) {
                if (!onlyBracketsArr.get(i).equals(bracketsHashMapReversed.get(onlyBracketsArr.get(i+1)))) {
                    return false;
                }
            }
        }
        return true;
    }
}
