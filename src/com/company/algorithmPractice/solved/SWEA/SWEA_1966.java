package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

// 1966. 숫자를 정렬하자
public class SWEA_1966 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        List<List<Integer>> resList = new ArrayList<>();

        StringTokenizer str;

        for (int i = 0; i < t; ++i) {
            int n = Integer.parseInt(br.readLine().trim());

            str = new StringTokenizer(br.readLine().trim());

            List<Integer> list = new ArrayList<>();

            while(str.hasMoreTokens()) {
                list.add(Integer.parseInt(str.nextToken()));
            }

            list.sort(Comparator.naturalOrder());

            resList.add(list);
        }

        for (int i = 0; i < t; ++i) {
            System.out.println("#" + (i + 1) + " " + intListToString(resList.get(i)));
        }
    }

    public static String intListToString(List<Integer> list) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int num : list){
            stringBuilder.append(num);
            stringBuilder.append(' ');
        }

        return stringBuilder.toString().trim();
    }
}
