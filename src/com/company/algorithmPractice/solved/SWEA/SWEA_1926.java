package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 1926. 간단한 369게임
public class SWEA_1926 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        StringBuilder str = new StringBuilder();

        for(int i=1; i<=num; ++i){

            str.append(validate(i));
        }

        System.out.println(str.toString().trim());

    }

    public static StringBuilder validate(int i) {
        StringBuilder resStr;
        resStr = new StringBuilder();

        int temp = i;
        while(temp != 0) {
            if(temp%10 != 0 && (temp%10)%3 == 0) {
                resStr.append('-');
            }
            temp /= 10;
        }

        // 369에 해당하지 않는 i인 경우
        if(resStr.length() == 0) {
            resStr.append(i);
        }

        resStr.append(' ');

        return resStr;
    }

}
