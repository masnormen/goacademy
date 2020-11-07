package com.goacademy;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float buffer = 0;
        boolean exit = false;

        while (!exit) {
            String input = scanner.nextLine();
            String inputArray[] = input.split(" ");
            String ops = inputArray[0];
            int number = 0;

            if (inputArray.length > 1) {
                try {
                    number = Integer.parseInt(inputArray[1]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            switch (ops) {
                case "exit": exit = true; break;
                case "cancel":
                    buffer = 0;
                    break;
                case "add": buffer += number; break;
                case "subtract": buffer -= number; break;
                case "multiply": buffer *= number; break;
                case "divide": buffer = (number == 0 ? 0 : buffer/number); break;
            }

            if (!exit) {
                System.out.printf("%.1f\n", buffer);
            }
        }
    }
}
