package com.company.algorithmPractice.solved.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BJ_1931 {

    public static class Node {
        public int stt;
        public int end;

        public Node(int stt, int end) {
            this.stt = stt;
            this.end = end;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        List<Node> nodeList = new ArrayList<>();

        int N = Integer.parseInt(st.nextToken());
        int stt, end;

        for (int i = 0; i < N; ++i) {
            st = new StringTokenizer(br.readLine().trim());
            stt = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());

            nodeList.add(new Node(stt, end));
        }

        nodeList.sort((o1, o2) -> {
            if (o1.end == o2.end) return o1.stt - o2.stt;
            else return o1.end - o2.end;
        });

        int prevEndTime = 0;
        int cnt = 0;

        for (int i = 0; i < N; ++i) {
            // 직전 종료시간이 다음 시작시간보다 작거나 같다면 갱신
            if (nodeList.get(i).stt >= prevEndTime) {
                prevEndTime = nodeList.get(i).end;
                cnt++;
            }
        }

        System.out.println(cnt);

        // https://st-lab.tistory.com/145
    }

}
