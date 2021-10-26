package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Question2 {

    public ArrayList<Integer> findScoreData(HashMap<String, Integer> studentScoresData) {
        int highestScore = 0;
        int totalScore = 0;
        int lowestScore = (Integer) studentScoresData.values().toArray()[0];
        for (int score : studentScoresData.values()) {
            if (score > highestScore) {
                highestScore = score;
            }
            if (score < lowestScore) {
                lowestScore = score;
            }
            totalScore += score;
        }
        int totalNumberOfStudents = studentScoresData.size();
        int averageScore = totalScore/totalNumberOfStudents;
        ArrayList<Integer> scoresArr = new ArrayList(Arrays.asList(lowestScore, highestScore, averageScore));
        return scoresArr;
    }


}
