public class Main {
    public static void main(String[] args) {
        int highScore = 0;


        if (highScore > 25){
            highScore  = 1000 + highScore;

        }

        // burdan itibaren kaç tane ifade (expression) var ?

        int health = 100;   // 1 ifade - ifadeye keyword ve Noktalı virgül dahil değil

        if((health < 25) && (highScore > 1000)){  // 3 ifade  health <25 <-> highScore > 1000 <-> (health < 25) && (highScore > 1000)
            highScore  = highScore - 1000;   // 2 ifade highScore - 1000 <-> highScore = highScore - 1000
        }

    }
}
