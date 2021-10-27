package com.company;

public class PalindromeNumber {
    public PalindromeNumber() {}
    public boolean isPalindrome(int x) {
        if (x < 0) {
            System.out.println("false");
            return false;
        }
        String convertedInteger = String.valueOf(x);
        String [] convertedIntArr = convertedInteger.split("");
        System.out.println(convertedIntArr.toString());
        String reversedInteger = "";
        for (int i = convertedIntArr.length-1; i>=0; i--) {
            reversedInteger += convertedIntArr[i];
        }
        if (reversedInteger.equals(convertedInteger)) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}
