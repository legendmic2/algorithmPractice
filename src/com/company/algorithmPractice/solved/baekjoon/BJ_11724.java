package com.company.algorithmPractice.solved.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_11724 {
    static ArrayList<Integer>[] adj;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        adj = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        Arrays.fill(visited, false);

        for (int i = 1; i <= N; ++i) {
            adj[i] = new ArrayList<>();
        }


        for (int i = 0; i < M; ++i) {
            st = new StringTokenizer(br.readLine().trim());
            int stt = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            adj[stt].add(end);
            adj[end].add(stt);
        }

        int cnt = 0;
        for (int i = 1; i <= N; ++i) {
            if (!visited[i]) {
                cnt++;
                dfs(i);
            }
        }

        System.out.println(cnt);


    }

    static void dfs(int v) {
        if (visited[v]) return;

        visited[v] = true;
        for (int idx : adj[v]) {
            if (!visited[idx]) {
                dfs(idx);
            }
        }
    }

}
