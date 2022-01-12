package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1961. 숫자 배열 회전
public class SWEA_1961 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        int[][] arr;

        StringTokenizer str;

        for (int i = 0; i < t; ++i) {
            int n = Integer.parseInt(br.readLine().trim());

            arr = new int[n][n];

            for (int j = 0; j < n; ++j) {
                str = new StringTokenizer(br.readLine().trim());
                for (int k = 0; k < n; ++k) {
                    arr[j][k] = Integer.parseInt(str.nextToken());
                }
            }
            // arr 저장 완료

            int[][] rotated90 = Rotate(n, arr);
            int[][] rotated180 = Rotate(n, rotated90);
            int[][] rotated270 = Rotate(n, rotated180);

            StringBuilder resStr;

            System.out.println("#" + (i + 1));
            for (int row = 0; row < n; ++row) {
                resStr = new StringBuilder();

                // 90도
                for (int col = 0; col < n; ++col) {
                    resStr.append(rotated90[row][col]);
                }
                resStr.append(' ');

                // 180도
                for (int col = 0; col < n; ++col) {
                    resStr.append(rotated180[row][col]);
                }
                resStr.append(' ');

                // 270
                for (int col = 0; col < n; ++col) {
                    resStr.append(rotated270[row][col]);
                }

                System.out.println(resStr);
            }

        }
    }

    public static int[][] Rotate(int n, int[][] arr) {
        int[][] rotatedArray = new int[n][n];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                rotatedArray[j][n - i - 1] = arr[i][j];
            }
        }

        return rotatedArray;
    }
}
