package com.company.algorithmPractice.solved.programmers;

import java.util.ArrayList;
import java.util.List;

public class PG_42746 {
    public static void main(String[] args) throws Exception {
        int[] numbers = {3, 30, 34, 5, 9};

        String result = solution(numbers);

        System.out.println("result: " + result);
    }

    public static String solution(int[] numbers) {
        // 1. numbers를 모두 String으로 변경
        List<String> numStrList = new ArrayList<>();
        for (int num : numbers) {
            numStrList.add(String.valueOf(num));
        }

        numStrList.sort((o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if(numStrList.get(0).equals("0")) return "0"; // 0 0 0 처럼 0이 중복인 경우의 exception

        StringBuilder stringBuilder = new StringBuilder();
        for(String str: numStrList) {
            stringBuilder.append(str);
        }

        return stringBuilder.toString();
    }
}
