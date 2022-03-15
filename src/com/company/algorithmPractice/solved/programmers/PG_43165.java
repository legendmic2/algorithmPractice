package com.company.algorithmPractice.solved.programmers;

public class PG_43165 {
    public static void main(String[] args) throws Exception {
        int[] numbers = {4, 1, 2, 1};
        int target = 4;

        int result = solution(numbers, target);

        System.out.println("result: " + result);
    }

    public static int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);


    }

    static int dfs(int[] numbers, int target, int idx, int res) {
        // 최종 숫자까지 연산을 완료한 상황
        if (idx == numbers.length) {
            if (res == target) {
                return 1;
            } else {
                return 0;
            }
        }

        return dfs(numbers, target, idx + 1, res + numbers[idx])
                + dfs(numbers, target, idx + 1, res - numbers[idx]);
    }

}
