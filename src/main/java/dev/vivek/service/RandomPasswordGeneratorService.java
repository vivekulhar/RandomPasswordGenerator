package dev.vivek.service;

import dev.vivek.enums.Alphabets;
import dev.vivek.models.CharacterChoice;
import dev.vivek.models.Password;

public class RandomPasswordGeneratorService {
    Password password;
    Alphabets alphabets;
    MenuPrinterService menuPrinterService = new MenuPrinterService();
    CharacterChoice characterChoice = new CharacterChoice();
    public void generateRandom() {
        characterChoice = menuPrinterService.requestInfo();
        alphabets = new Alphabets(characterChoice);
        password = generateNewPassword();
        System.out.println("Your generated password is: "+password.toString());
    }

    private Password generateNewPassword() {
        StringBuilder pass = new StringBuilder("");
        int maxLength = alphabets.getAlphabet().length();
        int min = 0;
        int range = maxLength-min+1;

        for(int i=0; i<=characterChoice.getLength(); i++){
            int index = (int) (Math.random()*(double)range)+min;
            pass.append(alphabets.getAlphabet().charAt(index));
        }
        return new Password(pass.toString(),characterChoice.getLength());
    }


}
