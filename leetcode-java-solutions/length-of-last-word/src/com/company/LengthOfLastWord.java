package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LengthOfLastWord {
    public LengthOfLastWord() {}

    public int findLengthOfLastWord(String s) {
        List<String> splitString = Arrays.asList(s.split(" "));
        String lastWord = splitString.get(splitString.size() -1);
        return lastWord.length();
    }

}
