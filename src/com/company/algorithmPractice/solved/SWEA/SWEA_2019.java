package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 2019. 더블더블
public class SWEA_2019 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        StringBuilder str = new StringBuilder();

        for(int cnt=0, idx = 1; cnt <= num; ++cnt){
            str.append(idx + " ");
            idx *= 2;
        }

        System.out.println(str);

    }
}
