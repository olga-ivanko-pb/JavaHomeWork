package com.pb.ivanko.hm2;

import java.util.Scanner;

public class Interval2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int x;
        String symbol;
        x = scan.nextInt();

        if (x >= 1 && x < 27) {
            System.out.println("Вы попали в промежуток [0-14]");
        } else {
            if (x >= 15 && x < 35) {
                System.out.println("Вы попали в промежуток [15-35]");
            } else {
                if (x >= 36 && x < 50) {
                    System.out.println("Вы попали в промежуток [36-50]");
                } else {
                    if (x >= 51 && x < 100) {
                        System.out.println("Вы попали в промежуток [51-100]");
                    } else {
                        System.out.println("не попадает в один из имеющихся промежутков");

                    }
                }
            }
        }
    }

}
