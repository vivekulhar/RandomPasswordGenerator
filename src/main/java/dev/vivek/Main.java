package dev.vivek;

import dev.vivek.controller.PasswordGenerator;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PasswordGenerator pswdGenerator = new PasswordGenerator();
        pswdGenerator.readyPasswordGenerator();
    }
}