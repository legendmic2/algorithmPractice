package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1933. 간단한 N 의 약수
public class SWEA_1933 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        StringBuilder str = new StringBuilder();

        for(int i=1; i<=num; ++i){
            if(num % i == 0) {
                str.append(i);
                str.append(' ');
            }
        }

        System.out.println(str.toString().trim());

    }
}
