package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 2005. 파스칼의 삼각형
public class SWEA_2005 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> ansList = new ArrayList<>();

        int t = Integer.parseInt(br.readLine().trim());

        int[][] arr = new int[10][10];

        StringBuilder str;

        List<Integer> inputList = new ArrayList<>();

        List<String> resList = new ArrayList<>();

        for(int i=0; i<t; ++i) {
            inputList.add(Integer.parseInt(br.readLine().trim()));
        }

        // init
        for (int i = 0; i < 10; ++i) {
            arr[i][i] = 1;
            arr[i][0] = 1;
        }

        // 값 대입
        for (int i = 2; i < 10; ++i) {
            for (int j = 1; j < i; ++j) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }

        for(int i=0; i<10; ++i) {
            str = new StringBuilder();
            for(int j=0; j<=i; ++j) {
                str.append(arr[i][j]);
                if(j != i) str.append(' ');
            }
            resList.add(str.toString());
        }

        for (int i = 0; i < t; ++i) {
            System.out.println("#" + (i + 1));
            for(int j=0; j<inputList.get(i); ++j){
                System.out.println(resList.get(j));
            }
        }


    }
}
