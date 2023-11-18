package dev.vivek.enums;

import dev.vivek.models.CharacterChoice;

public class Alphabets {
    private static final String UPPERCASE_LETTERS =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "1234567890";
    private static final String SYMBOLS = "!@#$%^&*()-_=+\\/~?";

    public StringBuilder alphabetPool = new StringBuilder();

    public Alphabets(CharacterChoice characterChoice){
        if (characterChoice.isIncludeLower()) {
            this.alphabetPool.append(LOWERCASE_LETTERS);
        }

        if (characterChoice.isIncludeUpper()) {
            this.alphabetPool.append(UPPERCASE_LETTERS);
        }

        if (characterChoice.isIncludeNum()) {
            this.alphabetPool.append(NUMBERS);
        }

        if (characterChoice.isIncludeSym()) {
            this.alphabetPool.append(SYMBOLS);
        }
    }


    public String getAlphabet() {
        return this.alphabetPool.toString();
    }
}
