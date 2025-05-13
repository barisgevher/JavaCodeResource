public class Main {
    public static void main(String[] args) {
    ComputerCase computerCase = new ComputerCase("2208", "Dell", "240");
    Monitor monitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
    MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");

    PersonalComputer personalComputer = new PersonalComputer("2208", "Dell", monitor, motherBoard, computerCase);

//    personalComputer.getMonitor().drawPixelAt(10,10,"red");
//    personalComputer.getMotherBoard().loadProgram("Windows OS");
//    personalComputer.getComputerCase().pressPowerButton();

      personalComputer.powerUp();

    }
}
