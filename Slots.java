//game logic 

import java.util.Random;


public class Slots{
    private int playerBalance;

public Slots(int initialBalance) {
    this.playerBalance = initialBalance;
}
public void spinReels() {
    // Logic to simulate spinning the reels
    int numberOfReels = 5;
    int numberOfPositions = 3;
    Random random = new Random();

    for (int reel = 0; reel < numberOfReels; reel++){
        for (int position = 0; position < numberOfPositions; position++) {
            Symbol randomSymbol = getRandomSymbol();
            System.out.println(randomSymbol.getName() + " ");
            System.out.println();
        }
    }}

    private Symbol getRandomSymbol() {
        Symbol[] symbols = {new Diamond(), new Cherry(), new Lucky7(), new Gold_Coin(), new Star()} 
        int randomIndex = new Random().nextInt(symbols.length);
        return symbols[randomIndex];
    }
    // Determine the symbols displayed on each reel
}
}