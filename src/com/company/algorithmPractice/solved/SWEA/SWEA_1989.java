package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 1989. 초심자의 회문 검사
public class SWEA_1989 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        StringBuilder str;

        for (int i = 0; i < t; ++i) {
            str = new StringBuilder(br.readLine().trim());

            if(str.toString().equals(str.reverse().toString())) {
                list.add(1);
            } else {
                list.add(0);
            }
        }

        for (int i = 0; i < t; ++i) {
            System.out.println("#" + (i + 1) + " " + list.get(i));
        }

    }
}
