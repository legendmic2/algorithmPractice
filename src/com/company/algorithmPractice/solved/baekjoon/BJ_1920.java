package com.company.algorithmPractice.solved.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_1920 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < N; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        st = new StringTokenizer(br.readLine().trim());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine().trim());

        for (int i = 0; i < M; ++i) {
            boolean find = false;
            int num = Integer.parseInt(st.nextToken()); // 찾을 숫자
            // 이진 탐색 시작
            int stt = 0;
            int end = N - 1;
            while (stt <= end) {
                int midIdx = (stt + end) / 2;
                int midVal = arr[midIdx];

                if (midVal == num) {
                    find = true;
                    break;
                } else if (midVal > num) { // 중앙값이 찾으려는 숫자보다 크므로, 시작점을 중앙
                    end = midIdx - 1;
                } else {
                    stt= midIdx + 1;
                }
            }

            if (find) System.out.println(1);
            else System.out.println(0);


        }
    }

}
