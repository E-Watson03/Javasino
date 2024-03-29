abstract class Symbol {
    private String name;

    public Symbol(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int calculatePayout(int count);

    // Method to trigger free spins, to be implemented by subclasses
    public abstract void triggerFreeSpins();
}

class Diamond extends Symbol {
    public Diamond() {
        super("Diamond");
    }

    @Override
    public int calculatePayout(int count) {
        if (count == 2) {
            return 5; // 5% return for 2 Diamonds
        } else if (count == 3) {
            return 15; // 15% return for 3 Diamonds
        } else if (count == 4) {
            return 30; // 30% return for 4 Diamonds
        } else if (count == 5) {
            return 100; // 100% return for 5 Diamonds (jackpot)
        } else {
            return 0; // No payout for other counts
        }
    }

    @Override
    public void triggerFreeSpins() {
        // Diamond doesn't trigger free spins
        // Method overridden to comply with the abstract class
    }
}

class Cherry extends Symbol {
    public Cherry() {
        super("Cherry");
    }

    @Override
    public int calculatePayout(int count) {
        if (count == 2) {
            return 3; // 5% return for 2 Cherries
        } else if (count == 3) {
            return 10; // 15% return for 3 Cherries
        } else if (count == 4) {
            return 20; // 30% return for 4 Cherries
        } else if (count == 5) {
            return 50; // 100% return for 5 Cherries (jackpot)
        } else {
            return 0; // No payout for other counts
        }
    }

    @Override
    public void triggerFreeSpins() {
        // Cherry doesn't trigger free spins
        // Method overridden to comply with the abstract class
    }
}

class Lucky7 extends Symbol {
    public Lucky7() {
        super("Lucky 7");
    }

    @Override
    public int calculatePayout(int count) {
        if (count == 2) {
            return 4; // 5% return for 2 Lucky 7s
        } else if (count == 3) {
            return 12; // 15% return for 3 Lucky 7s
        } else if (count == 4) {
            return 25; // 30% return for 4 Lucky 7s
        } else if (count == 5) {
            return 75; // 100% return for 5 Lucky 7s (jackpot)
        } else {
            return 0; // No payout for other counts
        }
    }

    @Override
    public void triggerFreeSpins() {
        // Lucky 7 doesn't trigger free spins
        // Method overridden to comply with the abstract class
    }
}

class GoldCoin extends Symbol {
    public GoldCoin() {
        super("Gold Coin");
    }

    @Override
    public int calculatePayout(int count) {
        if (count >= 3) {
            // Trigger bonus feature, e.g., free spins
            triggerFreeSpins(); // Example: Call a method to handle free spins
            
            // Return the percentage payout
            return 5; // 5% return for 3 or more Gold Coins (scatter)
        } else {
            return 0; // No payout for less than 3 Gold Coins
        }
    }

    @Override
    public void triggerFreeSpins() {
        // Implement logic to handle free spins
        System.out.println("Free spins triggered!");

        // Example: Simulate the process of conducting free spins
        int numberOfFreeSpins = 3; // You can customize the number of free spins
        //THIS WILL BE FLESHED OUT IN THE SLOTS BASE GAME LOGIC SO DISREGARD RIGHT NOW. 
    }
}

class Star extends Symbol {
    public Star() {
        super("Star");
    }

    @Override
    public int calculatePayout(int count) {
        if (count == 1) {
            // 1 Star (wild) in a winning combination: Doubles the win
            return 2;
        } else if (count == 2) {
            // 2 Stars (wilds) in a winning combination: Quadruples the win
            return 4;
        } else if (count >= 3) {
            // 3 or more Stars (wilds) in a winning combination: 10% return per additional wild
            return 10 * (count - 2);
        } else {
            return 0; // No payout for other counts
        }
    }

    @Override
    public void triggerFreeSpins() {
        // Star doesn't trigger free spins
        // Method overridden to comply with the abstract class
    }
}





