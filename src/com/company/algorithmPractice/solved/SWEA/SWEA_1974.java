package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

// 1974. 스도쿠 검증
public class SWEA_1974 {

    static int[][] puzzle = new int[10][10];

    static boolean[] visited = new boolean[10];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        List<Integer> resList = new ArrayList<>();

        StringTokenizer str;

        boolean isFailed;


        for (int i = 0; i < t; ++i) {
            for (int j = 1; j < 10; ++j) {
                str = new StringTokenizer(br.readLine().trim());
                for (int k = 1; k < 10; ++k) {
                    puzzle[j][k] = Integer.parseInt(str.nextToken());
                }
            }
            // 퍼즐 입력 완료

            // 가로 세로 확인
            isFailed = false; // 초기화
            for (int j = 1; j < 10; ++j) {
                // 가로
                Arrays.fill(visited, false);
                for (int k = 1; k < 10; ++k) {
                    if (visited[puzzle[j][k]]) {
                        isFailed = true;
                        break;
                    } else {
                        visited[puzzle[j][k]] = true;
                    }
                }

                // 세로
                Arrays.fill(visited, false);
                for (int k = 1; k < 10; ++k) {
                    if (visited[puzzle[k][j]]) {
                        isFailed = true;
                        break;
                    } else {
                        visited[puzzle[k][j]] = true;
                    }
                }
                if (isFailed) break;
            }

            if(isFailed) {
                resList.add(0);
                continue;
            }

            // 3x3
            // 3x3의 가운데점인 경우
            for (int j = 2; j < 10; j += 3) {
                for (int k = 2; k < 10; k += 3) {
                    Arrays.fill(visited, false);
                    isFailed = is3x3Wrong(j, k);

                    if (isFailed) break;
                }
                if (isFailed) break;
            }

            resList.add(isFailed ? 0 : 1);
        }

        for (int i = 0; i < t; ++i) {
            System.out.println("#" + (i + 1) + " " + resList.get(i));
        }
    }

    public static boolean is3x3Wrong(int x, int y) {
        for (int i = x - 1; i <= x + 1; ++i) {
            for (int j = y - 1; j <= y + 1; ++j) {
                if (visited[puzzle[i][j]]) {
                    return true;
                } else {
                    visited[puzzle[i][j]] = true;
                }
            }
        }

        return false;
    }
}
