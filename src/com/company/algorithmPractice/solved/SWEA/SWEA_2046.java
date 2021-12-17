package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 2046. 스탬프 찍기
public class SWEA_2046 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        // System.out.println("#".repeat(Math.max(0, num)));
        // String.repeat은 java11에 새로 생긴 문법

        // java8 기준
        for(int i=0; i<num; ++i){
            System.out.print("#");
        }

    }
}
