package com.company.algorithmPractice.solved.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_11659 {

    public static void main(String[] args) throws Exception {
        int N; // 수의 개수
        int M; // 합을 구해야 하는 횟수
        int i; // 합을 구해야 하는 구간의 시작점 (1-based-indexing)
        int j; // 합을 구해야 하는 구간의 끝점 (1-based-indexing)
        int curNum = 0; // idx번째 수

        int[] sumList = new int[100001]; // sumList[i] : num[1] ~ num[i] 까지의 수의 합


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine().trim());

        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(br.readLine().trim());

        sumList[0] = 0; // sumList[0] = 0

        for (int idx = 1; idx <= N; ++idx) {
            curNum += Integer.parseInt(stringTokenizer.nextToken());

            sumList[idx] = curNum;
        }
        // N, M, 숫자들 입력 완료

        // i, j 입력 시작
        for (int cnt = 0; cnt < M; ++cnt) {
            stringTokenizer = new StringTokenizer(br.readLine().trim());

            i = Integer.parseInt(stringTokenizer.nextToken());
            j = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(sumList[j] - sumList[i - 1]);
        }

    }

}
