package com.br.javawars.kyu_7;

public class PokerHand {

    public static boolean CheckIfFlush(String[] cards){
        String testCase = cards[0].substring(cards[0].length() -1);

        for(String card : cards) {
            if(!card.substring(card.length() - 1).equals(testCase))
                return false;
        }

        return true;
    }
}
