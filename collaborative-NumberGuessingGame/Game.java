/**
* @author Hani Abdelmajid
* @version 1.0
*
* The Game Class is a class that sets up the values and ability for the overall
* guessing game program to work. Using the java util random package, it allows for
* random numbers to be generated, and overall serves as a Game object class.
*
*/

import java.util.Random;
public class Game {

    /**
    * Value to Guess
    */
    private int number;
    /**
    * Lower Bounds Value
    */
    private int minNumber;
    /**
    * Upper Bounds Value
    */
    private int maxNumber;
    /**
    * User's Attempt Count
    */
    private int attempts;
    /**
    * User's Final Guess
    */
    private int lastGuess;
    /**
    * Game Over Value
    */
    private boolean over;
    /**
    * Creates a new Game object.
    * The number to guess is a random integer between 1 and 100.
    * The attempts and lastGuess variables are initialized to 0 and the over variable is set to false.
    *
    */
    public Game() {
        Random random = new Random();
        this.minNumber = 1;
        this.maxNumber = 100;
        this.number = random.nextInt(this.maxNumber - this.minNumber + 1) + this.minNumber;
        this.attempts = 0;
        this.lastGuess = 0;
        this.over = false;
    }
    /**
    * Returns the minimum number that can be guessed by the user.
    *
    * @return the minimum number that can be guessed.
    *
    */
    public int getMinNumber() {
        return this.minNumber;
    }
    /**
    * Returns the maximum number that can be guessed by the user.
    *
    * @return the maximum number that can be guessed.
    *
    */
    public int getMaxNumber() {
        return this.maxNumber;
    }

    /**
     * Returns A number that is being guessed by the user.
     *
     * @return The number that is guessed.
     *
     */
    public int getNumber() {return this.number;}
    /**
    * Returns if the game is over or still continuing.
    *
    * @return true if the game is over, false otherwise.
    *
    */
    public boolean isOver() {
        return this.over;
    }
    /**
    * Returns the number of attempts made by the said user.
    *
    * @return the number of attempts
    *
    */
    public int getAttempts() {
        return this.attempts;
    }
    /**
    * Returns a message to the user based on what they guessed.
    * If the game is over, the message will tell the user they have won.
    *
    * @return a message to display to the person.
    *
    */
    public String getMessage() {
        if (this.over) {
            return "Congratulations, you win.";
        } else {
            return "Your guess is " + this.getResult(this.lastGuess) + ".";
        }
    }
    /**
    * Takes user input and updates game state.
    * If the game is already over, nothing happens.
    * If the guess is correct, the game is over.
    *
    * @param guess the user's guess.
    *
    */
    public void guess(int guess) {
        if (this.over) {
            return;
        }

        this.attempts++;
        this.lastGuess = guess;

        if (guess == this.number) {
            this.over = true;
        }
    }

    /**
    * Returns a string indicating the result of the current guess.
    *
    * @param guess The integer value for the persons guess
    * @return A string indicating the message based on the guess.
    *
    */
    private String getResult(int guess) {
        if (this.over) {
            return "correct!";
        } else if (this.number < guess) {
            return "too high. Guess again.";
        } else {
            return "too low. Guess again.";
        }
    }
}
