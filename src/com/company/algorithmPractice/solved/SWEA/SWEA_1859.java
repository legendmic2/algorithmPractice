package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 1859. 백만 장자 프로젝트
public class SWEA_1859 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        int[] arr = new int[1000001];

        List<Long> resList = new ArrayList<>();

        StringTokenizer str;


        for (int i = 0; i < t; ++i) {
            int n = Integer.parseInt(br.readLine().trim()); // input의 개수
            long profit = 0; // 이익

            str = new StringTokenizer(br.readLine().trim());

            for (int j = 0; j < n; ++j) {
                arr[j] = Integer.parseInt(str.nextToken());
            }

            int maxValue = arr[n-1]; // 맨 뒤를 최대값으로 우선 설정

            for(int j=n-1; j>=0; --j) {
                if(maxValue > arr[j]) {
                    profit += maxValue - arr[j];
                } else if(maxValue < arr[j]) {
                    maxValue = arr[j]; // 최대값 갱신
                } // else continue;
            }

            resList.add(profit);
        }

        for (int i = 0; i < t; ++i) {
            System.out.println("#" + (i + 1) + " " + resList.get(i));
        }

    }
}
