package com.company.algorithmPractice.solved.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1929 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] numArr = new int[N + 1]; // 소수라면 idx와 동일한 값이 들어가있고, 아니라면 0이 들어가있음

        // 1은 소수가 아니므로 제외한다
        for (int i = 2; i <= N; ++i) {
            numArr[i] = i;
        }

        int upperBound = (int) Math.ceil(Math.sqrt(N)); // 상한선이므로 올림처리

        for (int i = 2; i <= upperBound; ++i) {
            if (numArr[i] != 0) {
                // 그 숫자의 배수를 모두 0으로 만듬
                for (int j = i + i; j <= N; j += i) {
                    numArr[j] = 0;
                }
            }
        }

        for (int i = M; i <= N; ++i) {
            if (numArr[i] != 0) System.out.println(i);
        }
    }

}
