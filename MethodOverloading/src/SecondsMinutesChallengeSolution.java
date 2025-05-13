public class SecondsMinutesChallengeSolution {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945)); // this is the first test case
        System.out.println(getDurationString(-65,45)); // this is the second test case
        System.out.println(getDurationString(65,145));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));


    }
//    public static  String getDurationString(int seconds){
//        // two step approach to get hours
//        int minutes = seconds / 60;
//        int hours = minutes / 60;
////        System.out.println("hours = " + hours);
//
//        int remainingMinutes = minutes % 60;
////        System.out.println("minutes = " + minutes);
////        System.out.println("Remaining minutes = " + remainingMinutes);
//
//         int remainingSeconds = seconds %60;
//      //  System.out.println("remaining seconds = " + remainingSeconds);
//        return hours + "h" + remainingMinutes + "m" + remainingSeconds + "s";
//    }

    public static String getDurationString(int seconds){
        if (seconds <= 0){
            return  "Error!, Invalid value passed by user to seconds variable (" + seconds + " ), must be a positive integer value";
        }
            int minutes = seconds / 60;
            return getDurationString(seconds / 60, seconds % 60);


    }
    public static  String getDurationString(int minutes, int seconds){

        if (minutes < 0){

            return  "Error!, Invalid value passed to minutes(Minute value can't be smaller than zero. (" + minutes + ")";
        }

        if (seconds <0 || seconds > 59){
            return "The seconds value must be between 0 and 59 (" + seconds + ")";
        }
       int hours = minutes / 60;

       int remainingMinutes = minutes % 60;

        return hours + "h" + remainingMinutes + "m" + seconds + "s";
    }




}


