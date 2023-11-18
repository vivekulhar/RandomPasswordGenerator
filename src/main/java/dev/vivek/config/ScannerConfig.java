package dev.vivek.config;

import java.util.Scanner;

//@Configuration
public class ScannerConfig {
    /*@Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Scanner scanner() {
        return new Scanner(System.in);
    }*/

    private static final Scanner sc = new Scanner(System.in);

    private ScannerConfig(){
    }

    public static Scanner getSingletonScanner(){
        return sc;
    }


}
