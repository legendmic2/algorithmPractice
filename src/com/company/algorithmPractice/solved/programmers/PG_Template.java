package com.company.algorithmPractice.solved.programmers;

public class PG_Template {
    public static void main(String[] args) throws Exception {
        int[] numbers = {1,2,3,4,5};
        int target = 3;

        int result = solution(numbers,target);

        System.out.println("result: " + result);
    }

    public static int solution(int[] numbers, int target) {
        return numbers[target];
    }
}
