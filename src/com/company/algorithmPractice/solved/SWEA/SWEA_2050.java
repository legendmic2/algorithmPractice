package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_2050 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int len = input.length();

        int[] res = new int[len];

        for(int i=0; i<len; ++i) {
            res[i] = input.charAt(i) - 'A' + 1;
        }

        for(int num : res) {
            System.out.print(num + " ");
        }

    }
}
