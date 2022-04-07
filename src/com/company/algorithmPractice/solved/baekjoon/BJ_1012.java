package com.company.algorithmPractice.solved.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BJ_1012 {

    static int T, M, N, K;

    static boolean[][] isCab = new boolean[50][50]; // 배추의 위치

    static boolean[][] visited = new boolean[50][50]; // 방문기록

    static int[][] mov = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}}; // 상 하 좌 우

    static int x, y; // 배추흰지렁이 위치

    static int cnt = 0; // 배추흰지렁이 마리 수

    static List<Integer> resList = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        T = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < T; ++i) {
            cnt = 0;

            for (int j = 0; j < 50; ++j) {
                Arrays.fill(isCab[j], false);
                Arrays.fill(visited[j], false);
            }

            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine().trim());
            M = Integer.parseInt(stringTokenizer.nextToken());
            N = Integer.parseInt(stringTokenizer.nextToken());
            K = Integer.parseInt(stringTokenizer.nextToken());

            for (int cab = 0; cab < K; ++cab) {
                stringTokenizer = new StringTokenizer(br.readLine().trim());
                x = Integer.parseInt(stringTokenizer.nextToken());
                y = Integer.parseInt(stringTokenizer.nextToken());
                isCab[x][y] = true;
            }
            // isCab 기록 완료

            for (int col = 0; col < M; ++col) {
                for (int row = 0; row < N; ++row) {
                    if (isCab[col][row] && !visited[col][row]) {
                        visited[col][row] = true;
                        cnt++;
                        DFS(col, row);
                    }

                }
            }

            resList.add(cnt);

        }

        for (int res : resList) {
            System.out.println(res);
        }


    }

    public static void DFS(int x, int y) {
        int nextX, nextY;
        for (int i = 0; i < 4; ++i) {
            nextX = x + mov[i][0];
            nextY = y + mov[i][1];
            if (!isValid(nextX, nextY)) continue;
            if (isCab[nextX][nextY] && !visited[nextX][nextY]) {
                visited[nextX][nextY] = true;
                DFS(nextX, nextY);
            }
        }
    }

    public static boolean isValid(int x, int y) {
        return x >= 0 && x < M && y >= 0 && y < N;
    }

}
