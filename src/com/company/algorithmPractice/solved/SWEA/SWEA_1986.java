package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 1986. 지그재그 숫자
public class SWEA_1986 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        int n;

        int sum;

        for(int i=0; i<t; ++i) {
            sum = 0;
            n = Integer.parseInt(br.readLine().trim());

            for(int j=1; j<=n; ++j) {
                if(j % 2 == 1) {
                    sum += j;
                } else {
                    sum -= j;
                }

            }

            list.add(sum);
        }

        for(int i=0; i<t; ++i) {
            System.out.println("#" + (i+1) + " " + list.get(i));
        }

    }
}
