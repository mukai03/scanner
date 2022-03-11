package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свое имя:");
        String phrase1 = sc.nextLine();
        System.out.println("Здравствуйте" + " " + phrase1 + "!");

    }
}
