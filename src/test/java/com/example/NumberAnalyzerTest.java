package com.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class NumberAnalyzerTest {

    @Test
    public void testCalculateSum() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertEquals(10, NumberAnalyzer.calculateSum(nums));
    }

    @Test
    public void testCalculateAverage() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 6));
        assertEquals(4.0, NumberAnalyzer.calculateAverage(nums));
    }

    @Test
    public void testFindMin() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5, 3, 9, 1));
        assertEquals(1, NumberAnalyzer.findMin(nums));
    }

    @Test
    public void testFindMax() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5, 3, 9, 1));
        assertEquals(9, NumberAnalyzer.findMax(nums));
    }
}
