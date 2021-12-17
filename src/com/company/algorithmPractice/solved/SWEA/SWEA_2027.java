package com.company.algorithmPractice.solved.SWEA;

// 2027. 대각선 출력하기
public class SWEA_2027 {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("++++");
        int strSize = str.length();

        for(int i=0; i<=strSize; ++i){
            str.insert(i, '#');
            System.out.println(str);
            str.deleteCharAt(i);
        }

    }
}
