package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 1545. 거꾸로 출력해 보아요
public class SWEA_1545 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        StringBuilder str = new StringBuilder();

        for(int i = num; i >= 0; --i){
            str.append(i + " ");
        }

        System.out.println(str);

    }
}
