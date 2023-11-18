package dev.vivek.service;

import dev.vivek.models.Password;

public class PasswordStrengthCheckerService {
    MenuPrinterService menuPrinterService;
    public void checkStrength(Password userPassword) {
        int score = calculateStrength(userPassword);

        if (score == 6) {
            System.out.println("This is a very good password :D check the Useful Information section to make sure it satisfies the guidelines");
        } else if (score >= 4) {
            System.out.println("This is a good password :) but you can still do better");
        } else if (score >= 3) {
            System.out.println("This is a medium password :/ try making it better");
        } else {
            System.out.println("This is a weak password :( definitely find a new one");
        }
    }

    private int calculateStrength(Password userPassword) {
        String p = userPassword.getValue();

        boolean usedUpper = false;
        boolean usedLower = false;
        boolean usedNum = false;
        boolean usedSym = false;
        int score = 0;

        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            int type = charType(c);

            if (type == 1) usedUpper = true;
            else if (type == 2) usedLower = true;
            else if (type == 3) usedNum = true;
            else if (type == 4) usedSym = true;
        }

        score += (usedUpper ? 1 : 0) + (usedLower ? 1 : 0) + (usedNum ? 1 : 0) + (usedSym ? 1 : 0);
        score += (p.length() >= 8) ? 1 : 0;
        score += (p.length() >= 16) ? 1 : 0;

        return score;
    }

    private int charType(char c) {
        if (Character.isUpperCase(c)) {
            return 1; // Uppercase Letter
        } else if (Character.isLowerCase(c)) {
            return 2; // Lowercase Letter
        } else if (Character.isDigit(c)) {
            return 3; // Digit
        } else {
            return 4; // Symbol
        }
    }
}
