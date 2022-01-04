package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 1984. 중간 평균값 구하기
public class SWEA_1984 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        List<Integer> resList = new ArrayList<>();

        StringTokenizer str;

        int curNum;

        int maxNum;

        int minNum;

        int sum;

        int res;

        for(int i=0; i<t; ++i) {
            sum = 0;
            maxNum = 0;
            minNum = 10001;
            str = new StringTokenizer(br.readLine().trim());
            for(int j=0; j<10; ++j) {
                curNum = Integer.parseInt(str.nextToken());
                if(maxNum < curNum) maxNum = curNum;
                if(minNum > curNum) minNum = curNum;
                sum += curNum;
            }

            resList.add(Math.round((float) (sum - maxNum - minNum)/8));
        }



        for(int i=0; i<t; ++i) {
            System.out.println("#" + (i+1) + " " + resList.get(i));
        }

    }
}
