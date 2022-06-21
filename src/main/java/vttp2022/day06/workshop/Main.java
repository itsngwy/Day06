package vttp2022.day06.workshop;

import java.util.List;

// Workshop
//  Main Deck Card

public class Main 
{
    public static void main( String[] args ) {
        Deck d = new Deck();
        System.out.println("-------- Before");
        System.out.println(d);
        d.shuffle();
        System.out.println("-------- After");
        System.out.println(d);

        List<Card> cards = d.take(5);
        System.out.println("-------- Take 5");
        System.out.println(cards);
    }
}
