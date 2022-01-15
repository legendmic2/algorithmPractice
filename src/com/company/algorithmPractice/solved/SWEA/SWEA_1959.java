package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1959. 두 개의 숫자열
public class SWEA_1959 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine().trim());

        StringTokenizer str;

        int a, b;

        int[] arrA, arrB;

        for (int i = 0; i < T; ++i) {
            str = new StringTokenizer(br.readLine().trim());

            a = Integer.parseInt(str.nextToken());
            b = Integer.parseInt(str.nextToken());

            // a < b인 상태
            arrA = new int[a];
            arrB = new int[b];

            str = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < a; ++j) {
                arrA[j] = Integer.parseInt(str.nextToken());
            }

            str = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < b; ++j) {
                arrB[j] = Integer.parseInt(str.nextToken());
            }
            // arrA, arrB 입력 완료


            int maxMul = a < b ? solution(arrA, arrB, a, b) : solution(arrB, arrA, b, a);


            System.out.println("#" + (i + 1) + " " + maxMul);
        }


    }

    public static int solution(int[] arrA, int[] arrB, int a, int b) {
        int maxMul = 0; // 마주보게 곱한 합 중 최대

        int curMul; // 현재 gap에서의 곱한 합

        for (int gap = 0; gap <= b - a; ++gap) {
            curMul = 0;
            for (int base = 0; base < a; ++base) {
                curMul += arrA[base] * arrB[base + gap];
            }

            if (maxMul < curMul) maxMul = curMul; // 최대값 지정
        }

        return maxMul;
    }
}
