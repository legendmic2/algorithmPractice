package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2029. 몫과 나머지 출력하기
public class SWEA_2029 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;

        int t = Integer.parseInt(br.readLine().trim());

        int a;
        int b;

        for(int i=0; i<t; ++i) {
            str = new StringTokenizer(br.readLine().trim());

            a = Integer.parseInt(str.nextToken());
            b = Integer.parseInt(str.nextToken());

            System.out.println("#" + (i+1) + " " + a/b + " " + a%b);
        }

    }
}
