package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Голосувати: ");
        String a = scanner.nextLine();
        switch (a) {
                case "За":
                    System.out.println("Я погоджуюсь!");
                    break;
                case "за":
                    System.out.println("Я погоджуюсь!");
                    break;
                case "+":
                    System.out.println("Я погоджуюсь!");
                    break;
                case "голосую":
                    System.out.println("Я погоджуюсь!");
                    break;
                case "Проти":
                    System.out.println("Я погоджуюсь!");
                    break;
                case "проти":
                    System.out.println("Я погоджуюсь!");
                    break;
                case "-":
                    System.out.println("Я відмовляюcь!");
                    break;
                case "не голосую":
                    System.out.println("Я відмовляюcь!");
                    break;
                case "Утримуюсь":
                    System.out.println("Я відмовляюcь!");
                    break;
                case "утримуюсь":
                    System.out.println("Я відмовляюcь!");
                    break;
            }
        }
    }
}
