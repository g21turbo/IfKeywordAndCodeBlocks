public class MainChallenge {

    public static void main(String[] args) {

        /*
            if (firstCondition) {
                Code in block will execute only if
                condition is true

            } else if (secondCondition) {
                Code in block will excecute if firstCondition is false
                and secondCondition is true

                block can contain 1 or many statements


            } else {
                Code in block will execute if
                all conditions above are false

         */

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        calculateScore();
        newCalculateScore(true, 20000, 8, 1000);
        newCalculateScore(gameOver, score, levelCompleted, bonus);

        int highScore = newestCalculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The high score is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("The next high score is " +
                newestCalculateScore(gameOver, score, levelCompleted, bonus));


//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//        int finalScore = score;

//        if (gameOver) {
//            finalScore += (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
//        }

//        boolean newGameOver = true;
//        int newScore = 1000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//        int newFinalScore = newScore;
//
//        if (newGameOver == true) {
//            newFinalScore += (newLevelCompleted * newBonus);
//            System.out.println("Your final score was " + newFinalScore);
//        }

//        gameOver = true;
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//        finalScore = score;
//
//        if (gameOver) {
//            finalScore += (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }

    }

    public static void calculateScore() {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

    }

    public static void newCalculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static int newestCalculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}