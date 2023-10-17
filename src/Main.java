public class Main {

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

        if (score < 5000 && score > 1000) {
            System.out.println("Your score is less than 5000 but greater than 1000");
        } else if (score < 1000){
            System.out.println("Your score is less than 1000");
        } else {
            System.out.println("Got here");
        }

    }
}