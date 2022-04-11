package com.company.algorithmPractice.solved.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_11720 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim()); // N은 사용하지 않는다

        char[] charArr = br.readLine().toCharArray();

        int sum = 0;
        for(char c: charArr) {
            sum += (c - '0');
        }

        System.out.println(sum);
    }

}
