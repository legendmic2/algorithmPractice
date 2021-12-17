package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2043. 서랍의 비밀번호
public class SWEA_2043 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine()); // default delimeter는 공백문자, 개행문자

        int P = Integer.parseInt(str.nextToken());
        int K = Integer.parseInt(str.nextToken());

        System.out.println(P-K+1);
    }
}
