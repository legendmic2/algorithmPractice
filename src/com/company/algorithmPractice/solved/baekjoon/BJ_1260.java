package com.company.algorithmPractice.solved.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_1260 {
    static boolean[][] adj;
    static boolean[] visited;
    static int n;
    static int m;
    static int v;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine().trim());

        n = Integer.parseInt(stringTokenizer.nextToken()); // 정점의 개수
        m = Integer.parseInt(stringTokenizer.nextToken()); // 간선의 개수
        v = Integer.parseInt(stringTokenizer.nextToken()); // 탐색을 시작할 정점의 번호

        int x;
        int y;

        adj = new boolean[n + 1][n + 1];
        visited = new boolean[n + 1];
        for (boolean[] row : adj) {
            Arrays.fill(row, false);
        }
        Arrays.fill(visited, false);

        // 간선 정보 입력
        for (int i = 0; i < m; ++i) {
            stringTokenizer = new StringTokenizer(br.readLine().trim());
            x = Integer.parseInt(stringTokenizer.nextToken());
            y = Integer.parseInt(stringTokenizer.nextToken()); // 1-based => 0-based
            adj[x][y] = true;
            adj[y][x] = true; // 양방향
        }

        // 1. dfs
        dfs(v);
        System.out.println();

        // 2. bfs
        Arrays.fill(visited, false);
        bfs(v);

    }

    public static void dfs(int num) {
        System.out.print(num + " ");
        visited[num] = true;
        for (int i = 1; i <= n; ++i) {
            if (!visited[i] && adj[num][i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int num) {
        Queue<Integer> q = new LinkedList<>();
        q.add(num);
        visited[num] = true;
        System.out.print(num + " ");
        int qSize; // 초기값
        int curNum;

        while (!q.isEmpty()) {
            qSize = q.size();
            for (int i = 0; i < qSize; ++i) {
                curNum = q.poll();
                for (int j = 1; j <= n; ++j) {
                    if (!visited[j] && adj[curNum][j]) {
                        visited[j] = true;
                        q.add(j);
                        System.out.print(j + " ");
                    }
                }
            }
        }

    }
}
