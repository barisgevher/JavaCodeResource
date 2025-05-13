public class SecondsAndMinutesChallenge {
//    public static void main(String[] args) {
//        System.out.println(getDurationString(3,30));
//        System.out.println(getDurationString(3600));
//    }
//    public static String getDurationString(int seconds){
//        if (seconds < 0){
//            System.out.println("unsupported format please check your parameters");
//        }
//        // 1 minute = 60 seconds
//        // XX hours YY minutes ZZ seconds
//        int XX = seconds / 3600;
//        int YY = seconds / 60;
//        int ZZ = seconds - (YY * 60) - (XX *3600);
//        return XX + "h"+ YY + "m" + ZZ + "s";
//    }
//    public static String getDurationString(int minutes, int seconds){
//        int ZZ = (minutes * 60) + seconds;
//        return getDurationString(ZZ);
//    }


    public static void main(String[] args) {

        System.out.println(getDurationString(3,30));
        System.out.println(getDurationString(3600));
    }
    public static String getDurationString(int seconds){
        if (seconds < 0){
            System.out.println("unsupported format please check your parameters");
        }
        // 1 minute = 60 seconds
        // XX hours YY minutes ZZ seconds
        int XX, YY, ZZ;
        if ( seconds / 3600 != 0  && seconds % 3600 != seconds){
            XX = seconds / 3600;

        }else{
            XX = 0;
        }
        seconds = seconds - (XX *3600);
        if (seconds / 60 != 0 && seconds % 60 != seconds){
            YY = seconds / 60;
        }else{
            YY = 0;
        }
        ZZ = seconds - (YY * 60);
        return XX + "h" + YY + "m" + ZZ + "s";



    }
    public static String getDurationString(int minutes, int seconds){
        if (minutes >= 60 || seconds >= 60 || seconds < 0 ){
            System.out.println("unsupported format please check your parameters");
        }
        int ZZ = (minutes * 60) + seconds;
        return getDurationString(ZZ);
    }

}
