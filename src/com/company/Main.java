//ПКС-419 Кисляков Павел Вариант 7

package com.company;

import java.util.Scanner;

public class Main {
    private static String input;

    public static void main(String[] args) {
        //Задание 1
        System.out.println("Введите три слова");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();

        String[] wordsArray = input.split(" ");
        for (String str: wordsArray){
            if (str.length() == 5){
                System.out.println(str);
            }
        }

        //Задание 2
        double[] numbersArray = {1, 2, 3, 4, 5, 6};
        double sum = 0.0;

        for (int i = 0; i<6; i++){
            sum += numbersArray[i] * numbersArray[i];
        }
        for (int i = 0; i<6; i++){
            double sqrt = Math.sqrt(Math.abs(numbersArray[i]));
            System.out.println(sqrt/sum);
        }
    }
}
