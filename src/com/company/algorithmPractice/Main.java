package com.company.algorithmPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int curNum;
        int maxNum;

        List<Integer> maxNumList = new ArrayList<>();

        int T = sc.nextInt();

        for (int i = 0; i < T; ++i) {
            maxNum = 0;
            for(int j=0; j<10; ++j){
                curNum = sc.nextInt();
                maxNum = Math.max(maxNum, curNum);
            }
            maxNumList.add(maxNum);
        }

        for (int i = 0; i < T; ++i) {
            System.out.println("#" + (i + 1) + " " + maxNumList.get(i));
        }
    }
}
