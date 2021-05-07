package com.company;

import java.util.Locale;
import java.util.Scanner;

public class toLowerCasetoUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.next();

        System.out.println(sc.toLowerCase());//全部变成小写
        System.out.println(sc.toUpperCase());//全部变成大写
    }
}
