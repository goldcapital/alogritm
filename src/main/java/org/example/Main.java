package org.example;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskSolver.getProblemStatement();
        getSelectedTask(scanner);


    }

    public static void getSelectedTask(Scanner scanner) {
        boolean selected = true;
        while (selected) {
            System.out.println("Qaysi misolga javobni ko'rishni xohlaysiz? numberni yuboring \n Tugatish uchun 0 bosing : ");
            switch (scanner.nextInt()) {
                case 1:
                    printTensAndOnes(scanner);
                    break;
                case 2:
                    sumOfDigits(scanner);
                    break;
                case 3:
                    printHundredsTensOnes(scanner);
                    break;
                case 4:
                    reverseDigits(scanner);
                    break;
                case 5:

                    isPalindrome(scanner);
                    break;
                case 0:
                    selected = false;
                    break;
            }
        }
    }

    private static void isPalindrome(Scanner scanner) {
        int number = getUserInput(scanner);
        if (checkDigit(number)) {
            int hundreds = number / 100;
            int tens = (number % 100) / 10;
            int ones = number % 10;
            int onesTensHundreds = (ones * 100) + (tens * 10) + hundreds;

            if (number == onesTensHundreds) {
                System.out.println("Palindrome number." +
                        "\n Original nuber :" + number +
                        "\n Reversed nuber :" + onesTensHundreds);
            } else {
                System.out.println("The number is not a palindrome." +
                        "\n Original nuber :" + number +
                        "\n Reversed nuber :" + onesTensHundreds);

            }
        }
    }

    private static void reverseDigits(Scanner scanner) {
        int number = getUserInput(scanner);
        if (checkDigit(number)) {
            int hundreds = number / 100;
            int tens = (number % 100) / 10;
            int ones = number % 10;
            System.out.println((ones * 100) + (tens * 10) + hundreds);
        }
    }

    private static void printHundredsTensOnes(Scanner scanner) {
        int number = getUserInput(scanner);

        if (checkDigit(number)) {

            int hundreds = number / 100;
            int tens = (number % 100) / 10;
            int ones = number % 10;
            System.out.println("hundreds : " + hundreds + "\n tens :" + tens + "\n ones: " + ones);
        }
    }

    public static void printTensAndOnes(Scanner scanner) {
        int number = getUserInput(scanner);

        if (number < 10) {
            System.out.println("Tens = 0");
            System.out.println("Ones = " + number);
        } else {
            int tens = number / 10;          /// 47 / 10 = 4
            int ones = number % 10;         /// 47 % 10 = 7

            System.out.println("Tens =" + tens + "\n" + "Ones =" + ones);

        }
    }

    public static void sumOfDigits(Scanner scanner) {
        int number = getUserInput(scanner);
        int tens = number / 10;
        int ones = number % 10;

        System.out.println(sum(tens, ones));// int sum = tens + ones; -> sum

    }

    public static int getUserInput(Scanner scanner) {
        System.out.println("Enter number : ");

        return scanner.nextInt();
    }

    private static boolean checkDigit(int number) {
        if (number < 100) {
            System.out.println("EN : not three-room " + number + " \n Uzbek : uch xonali emas " + number);
            return false;
        }
        return true;
    }
}