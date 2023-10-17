public class Main {

    public static void main(String[] args) {

        /*
            if (condition) {
                Code in block will execute only if
                condition is true

                block can contain 1 or many statements
            }
         */

        boolean gameOver = true;
        int score = 5001;
        int levelCompleted = 5;
        int bonus = 100;

        if (score <= 5000) {
            System.out.println("Your score is 5000 or less");
        } else {
            System.out.println("You scored 5000 or higher");
        }

    }
}