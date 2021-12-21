package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1938. 아주 간단한 계산기
public class SWEA_1938 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(str.nextToken());
        int b = Integer.parseInt(str.nextToken());

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

    }
}
