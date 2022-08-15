
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Player {
    static Scanner input = new Scanner(System.in);
    protected String guess = "";
    protected ArrayList<String> guessList = new ArrayList<>();

    public String getGuess() {
        return guess;
    }

    protected ArrayList<String> getGuessList() {
        return guessList;
    }

    protected String handleGuessInput() {
        System.out.println("Make a guess:");
        guess = input.nextLine().toLowerCase();

        //Reject if more than 1 letter put in
        while (guess.length() != 1){
            guess = input.nextLine().toLowerCase();
            System.out.println("Guess must be 1 letter");
            System.out.println("Make a guess:");
        }

        //Reject if not a Latin letter character
        Pattern pattern = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(guess);
        boolean matchFound = matcher.find();
        if (!matchFound){
            return "Invalid guess!";
        }

        //Reject if already guessed
        for (String s : guessList) {
            if (guess.equals(s)) {
                System.out.println("You've already guessed " + s + "!");
                return "Guesses: " + guessList;
            }
        }

        guessList.add(guess);
        return "Guesses: " + guessList;
    }

    public void printMessage(String message){
        System.out.println(message);
    }

}
