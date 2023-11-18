package dev.vivek.service;

import dev.vivek.config.ScannerConfig;
import dev.vivek.models.CharacterChoice;
import dev.vivek.models.Password;

import java.util.Scanner;
// This will print menus and other messages
public class MenuPrinterService {
    CharacterChoice characterChoice = new CharacterChoice();
    Scanner scanner = ScannerConfig.getSingletonScanner();
    public void printMenu() {
        System.out.println("Welcome to Ransom Password Printer Wizard");
        System.out.println("Press 1 to generate password");
        System.out.println("Press 2 to check password strength");
        System.out.println("Press 3 for User Information");
        System.out.println("Press 4 to Quit");
        System.out.print("Choice = ");

    }

    public void printUsefulInfo() {
        System.out.println();
        System.out.println("Use a minimum password length of 8 or more characters if permitted");
        System.out.println("Include lowercase and uppercase alphabetic characters, numbers and symbols if permitted");
        System.out.println("Generate passwords randomly where feasible");
        System.out.println("Avoid using the same password twice (e.g., across multiple user accounts and/or software systems)");
        System.out.println("Avoid character repetition, keyboard patterns, dictionary words, letter or number sequences," +
                "\nusernames, relative or pet names, romantic links (current or past) " +
                "and biographical information (e.g., ID numbers, ancestors' names or dates).");
        System.out.println("Avoid using information that the user's colleagues and/or " +
                "acquaintances might know to be associated with the user");
        System.out.println("Do not use passwords which consist wholly of any simple combination of the aforementioned weak components");
    }
    public CharacterChoice requestInfo() {
        System.out.println();
        System.out.println("Hello, Welcome to Password Generator");
        System.out.println("Enter true or false");
        boolean correctParams = true;
        do{
            correctParams = false;
            characterChoice.setIncludeLower(
                    askUserForInput(
                            "Do you want Lowercase letters \"abcd...\" to be used? "));
            characterChoice.setIncludeUpper(
                    askUserForInput(
                            "Do you want Uppercase letters \"ABCD...\" to be used? "));
            characterChoice.setIncludeNum(
                    askUserForInput(
                            "Do you want Numbers \"1234...\" to be used? "));
            characterChoice.setIncludeSym(
                    askUserForInput(
                            "Do you want Symbols \"!@#$...\" to be used? "));

            if(!characterChoice.isIncludeLower() &&
                    !characterChoice.isIncludeLower() &&
                    !characterChoice.isIncludeNum() &&
                    !characterChoice.isIncludeSym()){
                correctParams = true;
                System.out.println("You have selected no choice, please select one");
            }
        }while(correctParams);
        System.out.println("Now enter the length of password");
        characterChoice.setLength(scanner.nextInt());
        return characterChoice;
    }

    private boolean askUserForInput(String message) {
        String input;
        do{
            System.out.println(message);
            input = scanner.next();
        }while(!input.equalsIgnoreCase("true") && !input.equalsIgnoreCase("false"));
        return Boolean.parseBoolean(input);
    }

}
