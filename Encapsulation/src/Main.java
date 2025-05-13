public class Main {

    public static void main(String[] args) {


        // Bad code !!!
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        player.health = 200;    // Encapsulation fatal error bypass checks for health and health became greater than 100
//
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());


        // Good Code !!!
        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200,"Sword");
        System.out.println("Initial health is " + tim.healthRemaining());


    }
}
