package com.company.algorithmPractice.solved.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BJ_11003 {

    static class Node {
        public int value;
        public int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        Deque<Node> mydeque = new LinkedList<>();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine().trim());

        for(int i=0; i<N; ++i) {
            int curNum = Integer.parseInt(st.nextToken());
            // 새로운 값이 들어올 때 마다 정렬 대신 현재 수보다 큰 값을 덱에서 제거해 시간 복잡도를 줄임
            while(!mydeque.isEmpty() && mydeque.getLast().value > curNum) {
                mydeque.removeLast();
            }
            mydeque.addLast(new Node(curNum, i));
            // 범위에서 벗어난 값은 덱에서 제거
            if(mydeque.getFirst().index <= i - L) {
                // i - 맨앞idx >= L
                // 현재 확인중인 숫자와 deque의 맨앞 숫자의 차가 L 이상 날 경우 => 유효하지 않은 범위
                mydeque.removeFirst();
            }

            bw.write(mydeque.getFirst().value + " ");
        }

        bw.flush();
        bw.close();

    }

}
