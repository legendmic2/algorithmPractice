package com.company.algorithmPractice.solved.programmers;

import java.util.Arrays;

public class PG_43162 {
    public static void main(String[] args) throws Exception {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};

        int result = solution(n, computers);

        System.out.println("result: " + result);
    }

    public static int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];

        int res = 0;

        Arrays.fill(visited, false);


        for (int i = 0; i < n; ++i) {
            if (!visited[i]) {
                dfs(n, i, computers, visited);
                ++res;
            }
        }

        return res;
    }

    public static void dfs(int n, int curNum, int[][] computers, boolean[] visited) {
        for(int i=0; i<n; ++i){
            // 미방문지점 i && curNum - i 연결됨
            if(!visited[i] && computers[curNum][i] == 1) {
                visited[i] = true;
                dfs(n, i, computers, visited);
            }
        }
    }
}
