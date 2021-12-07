package com.company.algorithmPractice.solved.SWEA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SWEA_2071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum;
        List<Long> averageList = new ArrayList<>();

        int T = sc.nextInt();

        for(int i=0; i<T; ++i){
            sum = 0;
            for(int j=0; j<10; ++j){
                sum += sc.nextInt();
            }
            averageList.add(Math.round(sum/10));
        }

        for(int i=0; i<T; ++i){
            System.out.println("#" + (i+1) + " " + averageList.get(i));
        }

    }
}
