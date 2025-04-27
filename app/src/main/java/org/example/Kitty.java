package org.example;

public class Kitty implements Cutie {
    @Override
    public String description() {
        return "A playful kitty that purrs non-stop";
    }

    @Override
    public Integer cutenessRating() {
        return 10;
    }
}
