import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    private String[] answer;
    private String[] unknown;
    private int lives = 10;

    public String[] getUnknown() {
        return unknown;
    }

    public int getLives() {
        return lives;
    }

    protected void setAnswer(String[] answer) {
        this.answer = answer;
    }

    protected void setUnknown(String[] unknown) {
        this.unknown = unknown;
    }

    protected String[] getWordChars() {
        Words words = new Words();
        String wordToGuess = words.getRandomWord(); //get word
        return wordToGuess.split("");
    }

    protected String[] getUnknownChars() {
        String[] unknownChars = new String[this.answer.length];
        Arrays.fill(unknownChars, "_");
        return unknownChars;
    }

    protected String checkGuess(String guess, ArrayList<String> guessList) {
        boolean inWord = false;
        for (int i = 0; i < unknown.length; i++) {
            if (answer[i].equals(guess)){
                unknown[i] = guess;
                inWord = true;
            }
        }

        boolean alreadyGuessed = false;
        //Iterate over all guesses except for current
        for (int i = 0; i < guessList.size() - 1; i++){
            if (guess.equals(guessList.get(i))) {
                alreadyGuessed = true;
                break;
            }
        }

        if (!inWord && !alreadyGuessed){
                lives -= 1;
        }

        return("You have "+lives+" lives left");
    }

    protected boolean isGameFinished() {
        if (lives == 0){
            return true;
        }

        for (String s : unknown) {
            if (s.equals("_")){
                return false;
            }
        }

        return true;
    }

    protected void finishGame() {
        if (lives == 0){
            AsciiMan.dead();
            System.out.println("Sorry, you lost");
            System.out.println("The word was " + String.join("", answer).toUpperCase());

        } else {
            AsciiMan.alive();
            System.out.println("Congratulations, you won!");
        }
    }

    public String toString(String[] strArr) {
        StringBuilder message = new StringBuilder();
        for (String s : strArr) {
            message.append(s);
        }
        return message.toString();
    }


}
