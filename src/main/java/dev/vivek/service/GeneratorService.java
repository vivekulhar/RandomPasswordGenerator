package dev.vivek.service;

import dev.vivek.config.ScannerConfig;
import dev.vivek.controller.PasswordGenerator;

import java.util.Scanner;

public class GeneratorService {

    UserInputHandlerService userInputHandlerService = new UserInputHandlerService();

    public void printMenu() {
        userInputHandlerService.getPasswordInputs();
    }


}
