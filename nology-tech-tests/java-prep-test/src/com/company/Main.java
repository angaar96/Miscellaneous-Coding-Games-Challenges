package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Question1 Q1 = new Question1();
    List <Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

    System.out.println(Q1.findTwoLargestNumbers(listOfNumbers));
    Question2 Q2 = new Question2();
        HashMap<String, Integer> studentScoreData = new HashMap<>();
        studentScoreData.put("John", 32);
        studentScoreData.put("Amy", 50);
        studentScoreData.put("Kirsten", 81);
        studentScoreData.put("Madeleine", 30);
        studentScoreData.put("David", 20);
        System.out.println(Q2.findScoreData((studentScoreData)));
    }
}
