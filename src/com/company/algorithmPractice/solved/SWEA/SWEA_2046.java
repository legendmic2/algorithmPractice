package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 2046. 스탬프 찍기
public class SWEA_2046 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        System.out.println("#".repeat(Math.max(0, num)));

    }
}
