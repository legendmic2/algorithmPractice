package com.company.algorithmPractice.solved.SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SWEA_2056 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String date, year, month, day;

        int[] dayLimit = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        List<String> resList = new ArrayList<>();

        for (int i = 0; i < N; ++i) {
            date = br.readLine();

            year = date.substring(0, 4);
            month = date.substring(4, 6);
            day = date.substring(6, 8);
            int monthInt = Integer.parseInt(month);
            int dayInt = Integer.parseInt(day);

            if (monthInt >= 1 && monthInt <= 12 && dayInt >= 1 && dayInt <= dayLimit[monthInt]) {
                resList.add(year + "/" + month + "/" + day);
            } else {
                resList.add("-1");
            }
        }

        for(int i=0; i<N; ++i){
            System.out.println("#" + (i+1) + " " + resList.get(i));
        }


    }
}
