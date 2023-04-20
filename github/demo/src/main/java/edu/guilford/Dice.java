package edu.guilford;

public class Dice {
    
// attributes
    private int sides;
    private int value;

// constructors
    public Dice() {
        sides = 6;
        value = 1;
    }

    public Dice(int sides) {
        this.sides = sides;
        value = 1;
    }

// methods
    public int roll() {
        value = (int)(Math.random() * sides) + 1;
        return value;
    }

    public int getValue() {
        return value;
    }

    public int getSides() {
        return sides;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public String toString() {
        return "Dice [sides=" + sides + ", value=" + value + "]";
    }

}
