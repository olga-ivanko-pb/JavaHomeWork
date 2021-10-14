package com.pb.ivanko.hm2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       double result=0;
        Scanner in = new Scanner(System.in);


        System.out.println("Введите число 1");
        double leftoperand1 =in.nextInt();

        System.out.println("Введите число 2");
        double rightoperand2 =in.nextInt();

        System.out.println("Операция");
        String symbol=in.next();

        switch (symbol) {
            case "+":
                result = leftoperand1 + rightoperand2;
                break;
            case "-":
                result = leftoperand1 - rightoperand2;
                break;
            case "*":
                result = leftoperand1 * rightoperand2;
                break;
            case "/":
                if (rightoperand2 == 0) {
                    System.out.println("Ошибка");
                } else
                    result = leftoperand1 / rightoperand2;

        }
        System.out.println("Результат операции: " +result);
    }

}
