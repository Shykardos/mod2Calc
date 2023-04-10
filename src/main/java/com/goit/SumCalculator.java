package com.goit;

public class SumCalculator {

    public int sum(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be bigger than 1");
        }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
    }
}

