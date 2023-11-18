package dev.vivek.controller;

import dev.vivek.config.ScannerConfig;
import dev.vivek.service.GeneratorService;

import java.util.Scanner;

public class PasswordGenerator {

    GeneratorService generatorService = new GeneratorService();
    public PasswordGenerator(){

    }
    public void readyPasswordGenerator() {
        generatorService.printMenu();
    }
}
