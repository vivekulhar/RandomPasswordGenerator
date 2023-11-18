package dev.vivek.models;

public class CharacterChoice {
    private boolean includeUpper;
    private boolean includeLower;
    private boolean includeNum;
    private boolean includeSym;
    private int length;

    public CharacterChoice(boolean includeUpper, boolean includeLower, boolean includeNum, boolean includeSym, int length) {
        this.includeUpper = includeUpper;
        this.includeLower = includeLower;
        this.includeNum = includeNum;
        this.includeSym = includeSym;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public CharacterChoice() {
    }

    public boolean isIncludeUpper() {
        return includeUpper;
    }

    public void setIncludeUpper(boolean includeUpper) {
        this.includeUpper = includeUpper;
    }

    public boolean isIncludeLower() {
        return includeLower;
    }

    public void setIncludeLower(boolean includeLower) {
        this.includeLower = includeLower;
    }

    public boolean isIncludeNum() {
        return includeNum;
    }

    public void setIncludeNum(boolean includeNum) {
        this.includeNum = includeNum;
    }

    public boolean isIncludeSym() {
        return includeSym;
    }

    public void setIncludeSym(boolean includeSym) {
        this.includeSym = includeSym;
    }
}
