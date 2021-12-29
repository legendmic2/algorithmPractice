package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 2001. 파리 퇴치
public class SWEA_2001 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        List<Integer> resList = new ArrayList<>();

        int[][] arr = new int[15][15];

        StringTokenizer str;

        for (int i = 0; i < T; ++i) {
            str = new StringTokenizer(br.readLine().trim());
            int N = Integer.parseInt(str.nextToken());
            int M = Integer.parseInt(str.nextToken());
            int curCnt = 0; // 현재 경우의 파리 개수
            int maxCnt = 0; // 최대 파리 개수

            // 1. Input을 arr[][]에 저장
            for (int j = 0; j < N; ++j) {
                str = new StringTokenizer(br.readLine().trim());
                for (int k = 0; k < N; ++k) {
                        arr[j][k] = Integer.parseInt(str.nextToken());
                }
            }

            // 2. M x M size 합 중 가장 큰 값 구하기
            for (int row = 0; row <= N - M; ++row) {
                for (int col = 0; col <= N - M; ++col) {
                    curCnt = 0; // 현재 파리 초기화
                    for (int rowGap = 0; rowGap < M; ++rowGap) {
                        for (int colGap = 0; colGap < M; ++colGap) {
                            curCnt += arr[row + rowGap][col + colGap];
                        }
                    }

                    if(maxCnt < curCnt) maxCnt = curCnt;
                }
            }

            resList.add(maxCnt);
        }

        for (int i = 0; i < T; ++i) {
            System.out.println("#" + (i + 1) + " " + resList.get(i));
        }

    }
}
