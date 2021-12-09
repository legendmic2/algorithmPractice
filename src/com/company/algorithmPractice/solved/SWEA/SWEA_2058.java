package com.company.algorithmPractice.solved.SWEA;

import java.util.Scanner;

class SWEA_2058
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int N;
        N=sc.nextInt();

        int sum = 0;

        while(N >= 10){
            sum += N % 10;
            N /= 10;
        }

        sum += N;

        System.out.println(sum);
    }
}