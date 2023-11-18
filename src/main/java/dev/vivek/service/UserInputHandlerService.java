package dev.vivek.service;

import dev.vivek.config.ScannerConfig;
import dev.vivek.models.CharacterChoice;
import dev.vivek.models.Password;

import java.util.Scanner;

public class UserInputHandlerService {
    Scanner scanner = ScannerConfig.getSingletonScanner();
    RandomPasswordGeneratorService randomPasswordGeneratorService = new RandomPasswordGeneratorService();
    PasswordStrengthCheckerService passwordStrengthCheckerService = new PasswordStrengthCheckerService();
    MenuPrinterService menuPrinterService = new MenuPrinterService();
    CharacterChoice characterChoice = new CharacterChoice();
    public void getPasswordInputs() {
        int choice = -1;
        while(choice!=4){
            System.out.println("Enter your choice");
            menuPrinterService.printMenu();
            choice = scanner.nextInt();
            checkChoice(choice);
        }
    }

    private void checkChoice(int choice) {
        switch(choice){
            case 1:
                randomPasswordGeneratorService.generateRandom();
                break;
            case 2:
                Password userPassword = getUserPassword();
                passwordStrengthCheckerService.checkStrength(userPassword);
                break;
            case 3:
                menuPrinterService.printUsefulInfo();
                break;
            case 4:
                printQuitMessage();
                break;
            default:
                System.out.println();
                System.out.println("Kindly select one of the available commands");
        }
    }


    private Password getUserPassword() {
        System.out.print("\n Enter your password");
        String input = scanner.next();

        return new Password(input, input.length());
    }

    private void printQuitMessage() {
        System.out.println("Closing the program bye bye!");
    }
}
