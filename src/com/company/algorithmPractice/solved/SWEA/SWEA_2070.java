package com.company.algorithmPractice.solved.SWEA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SWEA_2070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A;
        int B;

        List<Character> budungho = new ArrayList<>();

        int T = sc.nextInt();
        char c;

        for (int i = 0; i < T; ++i) {
            A = sc.nextInt();
            B = sc.nextInt();

            if (A > B) c = '>';
            else if (A < B) c = '<';
            else c = '=';

            budungho.add(c);
        }

        for (int i = 0; i < T; ++i) {
            System.out.println("#" + (i + 1) + " " + budungho.get(i));
        }
    }
}
