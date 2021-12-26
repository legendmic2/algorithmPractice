package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1936. 1대1 가위바위보
public class SWEA_1936 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer str = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(str.nextToken());
        int b = Integer.parseInt(str.nextToken());

        // 1 2 or 2 3 or 3 1
        char c = b - a == 1 || b - a == -2 ? 'B' : 'A';

        System.out.println(c);
    }
}
