public class AsciiMan {

    public static void checkLives(int lives){
        switch(lives){
            case 1:
                oneLife();
                break;
            case 2:
                twoLives();
                break;
            case 3:
                threeLives();
                break;
            case 4:
                fourLives();
                break;
            case 5:
                fiveLives();
                break;
            case 6:
                sixLives();
                break;
            case 7:
                sevenLives();
                break;
            case 8:
                eightLives();
                break;
            case 9:
                nineLives();
                break;
        }
    }

    protected static void alive() {
        System.out.println("   ------¬ ");
        System.out.println("   |/    | ");
        System.out.println("   |       ");
        System.out.println("   |       ");
        System.out.println("   |   (^U^)");
        System.out.println("   |    \\|/");
        System.out.println("   |     | ");
        System.out.println("___|___ / \\");
    }

    protected static void dead() {
        System.out.println("   ------¬ ");
        System.out.println("   |/    | ");
        System.out.println("   |   (x_x)");
        System.out.println("   |    \\|/");
        System.out.println("   |     | ");
        System.out.println("   |    / \\");
        System.out.println("   |       ");
        System.out.println("___|___    ");
    }

    private static void oneLife() {
        System.out.println("   ------¬ ");
        System.out.println("   |/    | ");
        System.out.println("   |    (_)");
        System.out.println("   |    \\|/");
        System.out.println("   |     | ");
        System.out.println("   |    /  ");
        System.out.println("   |       ");
        System.out.println("___|___    ");
    }

    private static void twoLives() {
        System.out.println("   ------¬ ");
        System.out.println("   |/    | ");
        System.out.println("   |    (_)");
        System.out.println("   |    \\|/");
        System.out.println("   |     | ");
        System.out.println("   |       ");
        System.out.println("   |       ");
        System.out.println("___|___    ");
    }

    private static void threeLives() {
        System.out.println("   ------¬ ");
        System.out.println("   |/    | ");
        System.out.println("   |    (_)");
        System.out.println("   |    \\| ");
        System.out.println("   |     | ");
        System.out.println("   |       ");
        System.out.println("   |       ");
        System.out.println("___|___    ");
    }

    private static void fourLives() {
        System.out.println("   ------¬ ");
        System.out.println("   |/    | ");
        System.out.println("   |    (_)");
        System.out.println("   |     | ");
        System.out.println("   |     | ");
        System.out.println("   |       ");
        System.out.println("   |       ");
        System.out.println("___|___    ");
    }

    private static void fiveLives() {
        System.out.println("   ------¬ ");
        System.out.println("   |/    | ");
        System.out.println("   |    (_)");
        System.out.println("   |       ");
        System.out.println("   |       ");
        System.out.println("   |       ");
        System.out.println("   |       ");
        System.out.println("___|___    ");
    }

    private static void sixLives() {
        System.out.println("   ------¬ ");
        System.out.println("   |/    | ");
        System.out.println("   |       ");
        System.out.println("   |       ");
        System.out.println("   |       ");
        System.out.println("   |       ");
        System.out.println("   |       ");
        System.out.println("___|___    ");
    }

    private static void sevenLives() {
        System.out.println("   ------¬ ");
        System.out.println("   |/      ");
        System.out.println("   |       ");
        System.out.println("   |       ");
        System.out.println("   |       ");
        System.out.println("   |       ");
        System.out.println("   |       ");
        System.out.println("___|___    ");
    }

    private static void eightLives() {
        System.out.println("           ");
        System.out.println("   |       ");
        System.out.println("   |       ");
        System.out.println("   |       ");
        System.out.println("   |       ");
        System.out.println("   |       ");
        System.out.println("   |       ");
        System.out.println("___|___    ");
    }

    private static void nineLives() {
        System.out.println("           ");
        System.out.println("           ");
        System.out.println("           ");
        System.out.println("           ");
        System.out.println("           ");
        System.out.println("           ");
        System.out.println("           ");
        System.out.println("_______    ");
    }

}
