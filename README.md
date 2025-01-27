# Javsino-Java-Personal-Project [In Progress]
A personal project, a text based casino simulation built in the Java language.


My notes and how I thought out the logic and steps it would take to build this program:

# Structure of Program

Opens on welcome text that introduces the name and aim of the game, the player is asked to input the max amount of money in their wallet that they will be betting with. They are then introduced to the 5 potential games and told to select one. After one is selected they are walked over to the table and a prompt appears asking them if they would like a tutorial of the game or want to freeplay. After the tutorial is complete they are asked to place their bet/pot which may differ depending on which game they have chosen to play. If they win over 0.25, 0.5, 0.75, 1.0 of their money an encouraging statement will accompany each percentage win. If they lose the same percentage of their original bets a warning statement will accompany each transaction. Once the round of the came is over a prompt will ask them if they would like to play another round/edit their bets or leave the game and cashout. Their new balance will be printed once they leave that game, they will then be given the option to leave the javasino or continue playing another game. If they bust out of money they will be removed from the javasino and the javasino experience will end. However if they win over 1000% of their money back they will also be comically removed from the javasino in a private helicopter to the Jotel suite that the javasino people have put on for them to enjoy (they’re just winning too much).

# Classes and methods needed

1. **Game Functionality Classes:**
    - Classes responsible for managing the game logic, actions, and state. These classes focus on the underlying mechanics of the game.
    
    ```python
    
    class Player:
        # Player-related functionality
    
    class Room:
        # Room-related functionality
    
    class Game:
        # Main game loop and logic
    
    ```
    

1. **User Interface (UI) Classes:**
    - Classes responsible for displaying information to the user and handling user input. This includes text prompts, messages, and menus.
    
    ```python
    
    class GameText:
        @staticmethod
        def display_intro():
            print("Welcome to the Adventure Game!")
    
        @staticmethod
        def display_room_description(room):
            print(f"You are in {room.name}. {room.description}")
    
        # More methods for displaying different types of text
    
    class UserInput:
        @staticmethod
        def get_choice(options):
            # Get and validate user input for choices
    
    ```
    
2. **Main Game Class:**
    - The main game class that orchestrates the interaction between the game functionality and user interface classes.
    
    ```python
    
    class AdventureGame:
        def __init__(self):
            self.game_text = GameText()
            self.user_input = UserInput()
            self.game = Game()
    
        def start_game(self):
            self.game_text.display_intro()
            # Continue with the game loop, room transitions, etc.
    
    if __name__ == "__main__":
        adventure_game = AdventureGame()
        adventure_game.start_game()
    
    ```
    

# Game functionality classes:

SLOTS

1. **Symbol Class:**
    - Represents an individual symbol on a slot machine reel.
2. **Reel Class:**
    - Represents a reel containing multiple symbols.
3. **SlotMachine Class:**
    - Represents the main slot machine logic, including managing reels, spinning, and determining wins.
4. **Player Class:**
    - Represents a player, including attributes like credits, bet amount, and winnings.
5. **Paytable Class:**
    - Represents the paytable that defines winning combinations and their associated payouts.
6. **GameResult Class:**
    - Represents the result of a slot machine spin, including the symbols displayed and the corresponding win.
    
    # Blackjack
    
    1. **Card Class:**
        - Represents an individual playing card with a suit and rank.
    2. **Deck Class:**
        - Represents a deck of cards and handles tasks such as shuffling and dealing cards.
    3. **Player Class:**
        - Represents a player, including their hand of cards, total points, and actions.
    4. **Dealer Class:**
        - Represents the dealer, a special type of player with specific rules for gameplay.
    5. **BlackjackGame Class:**
        - Represents the main game logic, including managing players, dealing cards, and determining winners.
    6. **Hand Class:**
        - Represents a hand of cards, including methods for calculating the total points and checking for Blackjack.
    7. **Bet Class:**
        - Represents the bet placed by a player.
        
        # Baccarat
        
        1. **Card Class:**
            - Represents an individual playing card with a suit and rank.
        2. **Deck Class:**
            - Represents a deck of cards and handles tasks such as shuffling and dealing cards.
        3. **Player Class:**
            - Represents a player, including their hand of cards.
        4. **Banker Class:**
            - Represents the banker, a special type of player with specific rules for gameplay.
        5. **BaccaratGame Class:**
            - Represents the main game logic, including managing players, dealing cards, and determining winners.
        6. **Hand Class:**
            - Represents a hand of cards, including methods for calculating the total points and determining the winning hand.
        7. **Bet Class:**
            
            Represents the bet placed by a player on the Player, Banker, or a Tie.
            
            # Roulette
            
            1. **Wheel Class:**
                - Represents the roulette wheel with numbered pockets (0 to 36) and colors (red or black).
            2. **Ball Class:**
                - Represents the roulette ball that is spun on the wheel.
            3. **Player Class:**
                - Represents a player, including their bets and actions.
            4. **RouletteGame Class:**
                - Represents the main game logic, including managing players, spinning the wheel, and determining winners.
            5. **Bet Class:**
                - Represents a bet placed by a player on a specific outcome, such as a number, color, or range.
            6. **Outcome Class:**
                - Represents the possible outcomes of a roulette spin, including winning numbers and corresponding payouts.
        
        # Poker
        
        - Card.java
        - Deck.java
        - Points.java
        - PokerSimulator.java
        - PokerTester.java
        - refer to [https://github.com/bsheikh/Poker-Game-Simulator/tree/master/Source Code](https://github.com/bsheikh/Poker-Game-Simulator/tree/master/Source%20Code)
        
        ## **User Interface (UI) Classes:**
        
        1. **WelcomeScreen:**
            - Displays the welcome text introducing the name and aim of the game.
            - Asks the player to input the max amount of money in their wallet that they will be betting with.
        2. **GameSelectionScreen:**
            - Introduces the 5 potential games.
            - Prompts the user to select one game.
        3. **TutorialScreen:**
            - Appears after the game is selected.
            - Asks if the player would like a tutorial of the chosen game.
            - Walks the player through the rules of the game if a tutorial is requested.
        4. **BetPlacementScreen:**
            - Appears after the tutorial or if the player chooses to freeplay.
            - Asks the player to place their bet/pot.
            - Handles different betting logic depending on the selected game.
        5. **GamePlayScreen:**
            - Manages the game flow based on the user's choices and interactions during gameplay.
            - Displays encouraging or warning statements based on the game outcome.
        6. **RoundResultScreen:**
            - Appears after each round of the game.
            - Asks if the player would like to play another round, edit their bets, or leave the game and cash out.
            - Prints the new balance.
        7. **ExitScreen:**
            - Provides options for the player to leave the Javasino or continue playing another game.
            - Handles special cases such as winning too much or busting out of money.
        8. **JotelExperienceScreen:**
            - Displays a comical message and animation if the player wins over 1000% of their money back.
            
            ## MainGame Functionality Classes:
            
            Responsible for orchestrating the interaction between the game functionality and user interface classes specific to that game.
            
            1. **MainGameSlots.java**
            2. **MainGameBlackjack.java**
            3. **MainGameBaccarat.java**
            4. **MainGameRoulette.java**
            5. **MainGamePoker.java**
          


# Identify the different games and features.

# Roulette

1. **Straight Bet (Single Number):**
    - Payout: 35 to 1
    - If someone places a $100 bet on a single number and wins, they would receive $3,500 (including their original $100 bet).
2. **Even-Money Bets (e.g., Red/Black, Odd/Even):**
    - Payout: 1 to 1
    - If someone places a $100 bet on an even-money option and wins, they would receive $200 (including their original $100 bet).
3. **Dozens or Columns:**
    - Payout: 2 to 1
    - If someone places a $100 bet on a dozen or column and wins, they would receive $300 (including their original $100 bet).
    
    # Blackjack
    
    1. **Winning a Regular Hand (Not a Blackjack):**
        - If a player wins a regular hand (i.e., their hand beats the dealer's hand without being a blackjack), the payout is usually 1 to 1. This means that if a player bets $100 and wins, they would receive $200 in total, including their original $100 bet.
    2. **Winning with a Blackjack (Natural 21):**
        - If a player is dealt a blackjack (an Ace and a 10-value card) and the dealer does not also have a blackjack, the payout is typically 3 to 2. In this case, if a player bets $100 and wins with a blackjack, they would receive $150 (1.5 times their original bet) in addition to their original $100 bet.
        
        # Baccarat
        
        1. **Player Bet:**
            - If a player places a $100 bet on the Player hand and wins, the payout is typically 1 to 1. This means that they would receive $200 in total, including their original $100 bet.
        2. **Banker Bet:**
            - If a player places a $100 bet on the Banker hand and wins, the payout is also typically 1 to 1. However, a commission is usually charged on Banker wins (commonly 5%). As a result, the player would receive $195 (original $100 bet plus $95 in winnings after the 5% commission).
        3. **Tie Bet:**
            - If a player places a $100 bet on a Tie and wins, the payout is higher and is typically 8 to 1 or 9 to 1, depending on the casino. If the payout is 8 to 1, the player would receive $900 in total, including their original $100 bet.
            
            # Slots
            
            Slots depend on the type of combo that has been rolled.
            
            1. **Symbol Type 1 - Diamond:**
                - This symbol is a high-value symbol, and getting a certain number of diamonds on a payline can result in a significant payout.
            2. **Symbol Type 2 - Cherry:**
                - The cherry symbol is a classic slot symbol often associated with moderate payouts. It's a medium-value symbol that can contribute to various winning combinations.
            3. **Symbol Type 3 - Lucky 7:**
                - The lucky 7 symbol is another high-value symbol, often associated with substantial payouts. Getting combinations of lucky 7s can lead to exciting wins.
            4. **Scatter Symbol - Gold Coin:**
                - The gold coin symbol serves as the scatter symbol. Scatter symbols typically pay out regardless of their position on the reels and may trigger bonus features like free spins.
            5. **Wild Symbol - Star:**
                - The star symbol serves as the wild symbol. Wild symbols can substitute for other symbols (except scatter and bonus symbols) to help create winning combinations. They often enhance the chances of getting winning lines.
            6. **Diamond Symbol:**
                - 2 Diamonds: 5% return
                - 3 Diamonds: 15% return
                - 4 Diamonds: 30% return
                - 5 Diamonds: 100% return (jackpot)
            7. **Cherry Symbol:**
                - 2 Cherries: 3% return
                - 3 Cherries: 10% return
                - 4 Cherries: 20% return
                - 5 Cherries: 50% return
            8. **Lucky 7 Symbol:**
                - 2 Lucky 7s: 4% return
                - 3 Lucky 7s: 12% return
                - 4 Lucky 7s: 25% return
                - 5 Lucky 7s: 75% return
            9. **Gold Coin (Scatter) Symbol:**
                - 3 or more Gold Coins (scatter): 5% return (plus triggering a bonus feature, e.g., free spins)
            10. **Star (Wild) Symbol:**
                - 1 Star (wild) in a winning combination: Doubles the win
                - 2 Stars (wilds) in a winning combination: Quadruples the win
                - 3 or more Stars (wilds) in a winning combination: 10% return per additional wild
