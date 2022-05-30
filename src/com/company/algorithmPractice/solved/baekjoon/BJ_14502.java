package com.company.algorithmPractice.solved.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_14502 {
    static int N, M;
    static int maxCnt;
    static int[][] lab;
    static int[][] lab_clone;
    static List<Node> virusList;

    static int[][] mov = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}}; // 상 하 좌 우

    public static class Node {
        private int x;
        private int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        lab = new int[N][M];
        lab_clone = new int[N][M];
        virusList = new LinkedList<>();
        maxCnt = 0; // 초기값은 최소값으로

        int temp;

        for (int i = 0; i < N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; ++j) {
                temp = Integer.parseInt(st.nextToken());
                if (temp == 2) {
                    virusList.add(new Node(i, j));
                }
                lab[i][j] = temp;
            }
        }

        dfs(0);

        System.out.println(maxCnt);
    }

    // https://yongku.tistory.com/entry/%EB%B0%B1%EC%A4%80-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%B0%B1%EC%A4%80-14502%EB%B2%88-%EC%97%B0%EA%B5%AC%EC%86%8C-%EC%9E%90%EB%B0%94Java
    public static void dfs(int depth) {
        // 벽 3개 만들었다면 바이러스 전파 (bfs)
        if (depth == 3) {
            bfs();
            return;
        }

        // 벽 3개 아직이면 다시 세우자
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                if (lab[i][j] == 0) {
                    lab[i][j] = 1;
                    dfs(depth + 1);
                    lab[i][j] = 0;
                }
            }
        }
    }

    public static void bfs() {
        Queue<Node> curQueue = new LinkedList<>();
        curQueue.addAll(virusList);

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                lab_clone[i][j] = lab[i][j];
            }
        }

        while (!curQueue.isEmpty()) {
            int qSize = curQueue.size();
            for (int i = 0; i < qSize; ++i) {
                Node curNode = curQueue.poll();
                for (int j = 0; j < 4; ++j) {
                    int nextX = curNode.x + mov[j][0];
                    int nextY = curNode.y + mov[j][1];
                    if (isValidPos(nextX, nextY) && lab_clone[nextX][nextY] == 0) {
                        lab_clone[nextX][nextY] = 2; // 바이러스 감염
                        curQueue.add(new Node(nextX, nextY));
                    }
                }
            }
        }

        safeCntFunc(lab_clone);

    }

    public static void safeCntFunc(int[][] virus_map) {
        int count = 0;
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < M; ++j) {
                if (virus_map[i][j] == 0) count++;
            }
        }

        maxCnt = Math.max(count, maxCnt);
    }

    public static boolean isValidPos(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }

}
