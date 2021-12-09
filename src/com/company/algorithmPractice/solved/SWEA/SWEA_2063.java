package com.company.algorithmPractice.solved.SWEA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SWEA_2063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numList = new ArrayList<>();

        int N = sc.nextInt();

        for (int i = 0; i < N; ++i) {
            numList.add(sc.nextInt());
        }

        numList.sort(null); // 오름차순 정렬. list.sort(Comparator.naturalOrder()) 와 같다


        System.out.println(numList.get(N/2));

    }
}
