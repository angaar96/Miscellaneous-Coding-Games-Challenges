package com.company;

import java.util.List;

public class isValidSubsequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arr_index = 0;
        int seq_index = 0;
        while (arr_index < array.size() && seq_index < sequence.size()) {
            if (array.get(arr_index) == sequence.get(seq_index)) {
                seq_index += 1;
            }
            arr_index+=1;
        }
        return seq_index == sequence.size();
    }
}
