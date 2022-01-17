package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 1979. 어디에 단어가 들어갈 수 있을까
public class SWEA_1979 {

    static int[][] puzzle = new int[15][15];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine().trim());

        StringTokenizer str;
        StringBuilder stringBuilder;

        int N;

        int K;

        for (int i = 0; i < T; ++i) {
            // 초기화
            for (int[] row : puzzle) {
                Arrays.fill(row, 0);
            }

            // 1. input => puzzle 초기화
            str = new StringTokenizer(br.readLine().trim());
            N = Integer.parseInt(str.nextToken());
            K = Integer.parseInt(str.nextToken());

            stringBuilder = new StringBuilder();

            for (int j = 0; j < K; ++j) {
                stringBuilder.append(1);
            }

            String word = stringBuilder.toString(); // word : K개의 1이 합쳐진 String (111 , 1111, ...)

            for (int row = 0; row < N; ++row) {
                str = new StringTokenizer(br.readLine().trim());
                for (int col = 0; col < N; ++col) {
                    puzzle[row][col] = Integer.parseInt(str.nextToken());
                }
            }

            // 2. 확인
            int cnt = puzzleCount(N, word, true) + puzzleCount(N, word, false);

            // 3. 출력
            System.out.println("#" + (i + 1) + " " + cnt);
        }
    }

    public static int puzzleCount(int N, String word, boolean isHorizontal) {
        StringTokenizer str;
        StringBuilder stringBuilder;

        int cnt = 0;

        for (int row = 0; row < N; ++row) {
            stringBuilder = new StringBuilder();
            for (int col = 0; col < N; ++col) {
                if(isHorizontal) {
                    stringBuilder.append(puzzle[row][col]);
                } else {
                    stringBuilder.append(puzzle[col][row]);
                }
            }
            str = new StringTokenizer(stringBuilder.toString(), "0");
            while (str.hasMoreTokens()) {
                if (str.nextToken().equals(word)) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

}
