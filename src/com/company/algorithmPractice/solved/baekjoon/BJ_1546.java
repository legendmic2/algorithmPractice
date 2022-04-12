package com.company.algorithmPractice.solved.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1546 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int temp;
        double max = 0;
        double[] numArr = new double[N];
        double sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        for(int i=0; i<N; ++i) {
            temp = Integer.parseInt(st.nextToken());
            if(max < temp) {
                max = temp;
            }
            numArr[i] = temp;
        }

        for(int i=0; i<N; ++i) {
            if(max != 0) sum += numArr[i]/(max/100);
        }

        System.out.println(sum/N);
    }

}
