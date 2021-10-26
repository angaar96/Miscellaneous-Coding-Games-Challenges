package com.company;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Question2Tests {

    @Test
    public void Question2_GivenAHashMap_ReturnsCorrectScores() {
        // 1. Arrange (your dependencies)
        Question2 Q2 = new Question2();
        // 2. Act (call the methods)
        HashMap<String, Integer> studentScoreData = new HashMap<>();
        studentScoreData.put("John", 32);
        studentScoreData.put("Amy", 50);
        studentScoreData.put("Kirsten", 81);
        studentScoreData.put("Madeleine", 30);
        studentScoreData.put("David", 20);
        ArrayList<Integer> scoresArr = Q2.findScoreData((studentScoreData));
        int lowestScore = scoresArr.get(0);
        int highestScore = scoresArr.get(1);
        int averageScore = scoresArr.get(2);
        // 3. Assert (Check the results are what you expect).
        assertEquals(81, highestScore);
        assertEquals(20, lowestScore);
        assertEquals(42, averageScore);
    }

    @Test
    public void Question2_GivenAHashMapWithMoreScores_ReturnsCorrectScores() {
        // 1. Arrange (your dependencies)
        Question2 Q2 = new Question2();
        // 2. Act (call the methods)
        HashMap<String, Integer> studentScoreData = new HashMap<>();
        studentScoreData.put("John", 32);
        studentScoreData.put("Amy", 50);
        studentScoreData.put("Kirsten", 81);
        studentScoreData.put("Madeleine", 30);
        studentScoreData.put("Lucille", 58);
        studentScoreData.put("Negan", 64);
        studentScoreData.put("Carl", 100);
        studentScoreData.put("Rick", 10);
        studentScoreData.put("Michonne", 95);
        ArrayList<Integer> scoresArr = Q2.findScoreData((studentScoreData));
        int lowestScore = scoresArr.get(0);
        int highestScore = scoresArr.get(1);
        int averageScore = scoresArr.get(2);
        // 3. Assert (Check the results are what you expect).
        assertEquals(100, highestScore);
        assertEquals(10, lowestScore);
        assertEquals(57, averageScore);
    }


}