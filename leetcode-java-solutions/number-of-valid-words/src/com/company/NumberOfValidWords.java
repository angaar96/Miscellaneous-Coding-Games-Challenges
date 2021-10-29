package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfValidWords {
    public NumberOfValidWords() {
    }
    public int countValidWords(String sentence) {
        String cleanedString = sentence.trim();
        List <String> splitStringArr = Arrays.asList(cleanedString.split(" "));
        System.out.println(splitStringArr);
        ArrayList<String> validWordsArr = new ArrayList<>();
        List<Boolean> requirements = new ArrayList<Boolean>(Arrays.asList(true, true, true, true));
        String example = "example";
        ArrayList<String> invalidCharacterMatches = new ArrayList<>();
        ArrayList<String> punctuationCharMatches = new ArrayList<>();
        ArrayList<String> hyphenCharMatches = new ArrayList<>();
        ArrayList<String> commaCharMatches = new ArrayList<>();
        ArrayList<String> dotCharMatches = new ArrayList<>();
        ArrayList<String> hyphenPositionCharMatches = new ArrayList<>();
        ArrayList<String> exclamationPositionCharMatches = new ArrayList<>();
        ArrayList<String> commaPositionCharMatches = new ArrayList<>();
        ArrayList<String> dotPositionCharMatches = new ArrayList<>();
        ArrayList<String> exclamationCharMatches = new ArrayList<>();


        for (String word: splitStringArr) {
            exclamationCharMatches.clear();
            exclamationPositionCharMatches.clear();
            commaPositionCharMatches.clear();
            dotPositionCharMatches.clear();
            invalidCharacterMatches.clear();
            commaCharMatches.clear();
            dotCharMatches.clear();
            punctuationCharMatches.clear();
            hyphenPositionCharMatches.clear();
            hyphenCharMatches.clear();
            for (int i=0; i<requirements.size(); i++) {
                requirements.set(i, true);
            }
            // invalid characters setup
            Matcher m = Pattern.compile("[^a-z\\-!., ]").matcher(word);
            while (m.find()) {
                invalidCharacterMatches.add(m.group());
            }
            // punctuation characters setup
            m = Pattern.compile("[!\\-,.]").matcher(word);
            while (m.find()) {
                punctuationCharMatches.add(m.group());
            }
            // hyphen match
            m = Pattern.compile("[-]").matcher(word);
            while (m.find()) {
                hyphenCharMatches.add(m.group());
            }
            // comma match
            m = Pattern.compile("[,]").matcher(word);
            while (m.find()) {
                commaCharMatches.add(m.group());
            }
            // dot match
            m = Pattern.compile("[.]").matcher(word);
            while (m.find()) {
                dotCharMatches.add(m.group());
            }
            // exclamation mark match
            m = Pattern.compile("[!]").matcher(word);
            while (m.find()) {
                exclamationCharMatches.add(m.group());
            }
            // hyphen in between a-z match
            m = Pattern.compile("[a-z]\\-[a-z]").matcher(word);
            while (m.find()) {
                hyphenPositionCharMatches.add(m.group());
            }
            // exclamation mark position match
            m = Pattern.compile("[a-z]!{1}$").matcher(word);
            while (m.find()) {
                exclamationPositionCharMatches.add(m.group());
            }
            // dot position match
            m = Pattern.compile("[a-z]\\.{1}$").matcher(word);
            while (m.find()) {
                dotPositionCharMatches.add(m.group());
            }
            // comma position match
            m = Pattern.compile("[a-z],{1}$").matcher(word);
            while (m.find()) {
                commaPositionCharMatches.add(m.group());
            }
            if (!invalidCharacterMatches.isEmpty() || word.equals("")) {
                System.out.println("not a valid word");
            } else if (word == "-"){
                System.out.println("not a valid word");
            } else if (word.equals("!") || word.equals(",") || word.equals(".")) {
                validWordsArr.add(word);
            } else if (!punctuationCharMatches.isEmpty()) {
                if (!hyphenCharMatches.isEmpty()) {
                    if (!hyphenPositionCharMatches.isEmpty() && hyphenCharMatches.size() == 1) {
                        requirements.set(0, true);
                    } else {
                        requirements.set(0, false);
                    }
                }
                if (!exclamationCharMatches.isEmpty()) {
                    if (!exclamationPositionCharMatches.isEmpty() && exclamationCharMatches.size() == 1) {
                        requirements.set(1, true);
                    } else {
                        requirements.set(1, false);
                    }
                }
                if (!dotCharMatches.isEmpty()) {
                    if (!dotPositionCharMatches.isEmpty() && dotCharMatches.size() == 1) {
                        requirements.set(2, true);
                    } else {
                        requirements.set(2, false);
                    }
                }
                if (!commaCharMatches.isEmpty()) {
                    if (!commaPositionCharMatches.isEmpty() && commaCharMatches.size() == 1) {
                        requirements.set(3, true);
                    } else {
                        requirements.set(3, false);
                    }
                }
                if (!requirements.contains(false)) {
                    validWordsArr.add(word);
                }
            } else {
                validWordsArr.add(word);
            }

        }
        System.out.println(validWordsArr.size());
        System.out.println(validWordsArr);
        return validWordsArr.size();
    }
    }
