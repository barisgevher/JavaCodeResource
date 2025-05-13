public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if ( score == 5000){
            System.out.println("Your score was 5000"); // tek bir statement için de olsa kod bloğu kullan best-prectice
        }else if(score == 3000){
            System.out.println("if e düşmezse buraya düşer istenilen kadar else if olabilir");
        }else {
            System.out.println("her zaman sonda olmalı ");
        }


    }
}
