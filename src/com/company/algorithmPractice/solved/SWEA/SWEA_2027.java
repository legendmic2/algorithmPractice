package com.company.algorithmPractice.solved.SWEA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SWEA_2027 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int sum;
        List<Integer> oddSumList = new ArrayList<>();

        int T = sc.nextInt();

        for(int i=0; i<T; ++i){
            sum = 0;
            for(int j=0; j<10; ++j){
                num = sc.nextInt();
                if(num % 2 == 1){
                    sum += num; // 홀수는 더한다
                }
            }
            oddSumList.add(sum);
        }

        for(int i=0; i<T; ++i){
            System.out.println("#" + (i+1) + " " + oddSumList.get(i));
        }

    }
}
