package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// 1976. 시각 덧셈
public class SWEA_1976 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        List<String> resList = new ArrayList<>();

        StringTokenizer str;

        int[] hourMinArr = new int[6];

        for (int i = 0; i < t; ++i) {
            str = new StringTokenizer(br.readLine().trim());
            for(int j=0; j<4; ++j) {
                hourMinArr[j] = Integer.parseInt(str.nextToken());
            }

            hourMinArr[4] = hourMinArr[0] + hourMinArr[2];
            hourMinArr[5] = hourMinArr[1] + hourMinArr[3];

            if(hourMinArr[5] >= 60) {
                hourMinArr[5] -= 60;
                hourMinArr[4] += 1;
            }

            if(hourMinArr[4] > 12) {
                hourMinArr[4] -= 12;
            }

            resList.add(hourMinArr[4] + " " + hourMinArr[5]);

        }

        for (int i = 0; i < t; ++i) {
            System.out.println("#" + (i + 1) + " " + resList.get(i));
        }
    }
}
