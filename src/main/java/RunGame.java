public class RunGame {

    public static void runGame() {
        Game game = new Game();
        Player player = new Player();
        game.setAnswer(game.getWordChars());
        game.setUnknown(game.getUnknownChars());
        player.printMessage(game.toString(game.getUnknown()));

        while(!game.gameFinished){
            player.printMessage(player.handleGuessInput());

            player.printMessage(game.checkGuess(player.getGuess(), player.getGuessList()));
            player.printMessage(game.toString(game.getUnknown()));

            game.setGameFinished(game.isGameFinished());

            //Only print if game not finished
            if (!game.gameFinished){AsciiMan.checkLives(game.getLives());}

            //Provides a line break so can see new guess
            player.printMessage("            ");
        }

        game.finishGame();
    }

    public static void main(String[] args) {
        RunGame.runGame();
    }
}
