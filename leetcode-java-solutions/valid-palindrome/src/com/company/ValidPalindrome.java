package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ValidPalindrome {
    public String s;
    public ValidPalindrome(String s) {
        this.s = s;
    }
    public boolean IsValidPalindrome(String s) {
        List <String> splitArr = Arrays.asList(s.split(""));
        List filtered = splitArr.stream().filter(character -> character.matches("[a-zA-Z0-9]")).collect(Collectors.toList());
        String joined = String.join("", filtered);
        System.out.println(joined);
        String reversedString = "";
        for (int i = filtered.size()-1; i>=0; i--) {
            reversedString += filtered.get(i);
        }
        System.out.println(reversedString);
        if (reversedString.toLowerCase().equals(joined.toLowerCase())) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }



    }




