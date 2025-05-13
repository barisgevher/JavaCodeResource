public class MainChallenge {

    public static void gameOver(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if (gameOver){  // best-practice
            finalScore += (levelCompleted * bonus);
            finalScore += 1000; // düzeltmek eklemek daha kolay
            System.out.println("Your final score was " + finalScore);
        }
    }
    public static int gameOver2(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;
        if (gameOver){  // best-practice
            finalScore += (levelCompleted * bonus);
            finalScore += 1000; // düzeltmek eklemek daha kolay
           return finalScore;
        }
        return 0;
    }
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int  finalScore = score;
        gameOver(gameOver,finalScore,levelCompleted,bonus);

        /************************************************/

        gameOver(true,10000,8,200);

        /************************************************************************/

        System.out.println( "Highscore is : "  + gameOver2(gameOver,score,levelCompleted,bonus));







    }
}
