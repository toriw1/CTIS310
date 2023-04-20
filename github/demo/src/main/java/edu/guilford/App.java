package edu.guilford;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    

    //instantiate three Dice objects
    Dice d1 = new Dice();
    Dice d2 = new Dice(20);
    Dice d3 = new Dice(100);

    //roll the dice
    d1.roll();
    d2.roll();
    d3.roll();

    //print the values of the dice
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);

    }

}
