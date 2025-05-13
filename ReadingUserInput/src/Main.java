import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int currentYear = 2024;
//        String userDateOfBirth = "2001";
//
//        int dateOfBirth = Integer.parseInt(userDateOfBirth);
//
//        System.out.println("Age = " + (currentYear - dateOfBirth));
//
//        String userAgeWithPartialYear = "23.5";
//        double  ageWithPartialYear = Double.parseDouble(userAgeWithPartialYear);
//        System.out.println("The user says he's " + ageWithPartialYear);


        /*********************************************/
                                    // Try- Catch
        try{
            System.out.println(getInputFromConsole(currentYear));
        }catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }



    }
    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hellor World!, What is your name? ");
        System.out.println("Hi " + name + " nice to meet you");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return  "So you are " + age + " years old";
    }
    public static String getInputFromScanner(int currentYear){

        Scanner scanner = new Scanner(System.in);

//        String name = System.console().readLine("Hellor World!, What is your name? ");
        System.out.println("Hello World!, What is your name ? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + " nice to meet you");


//        String dateOfBirth = System.console().readLine("What year were you born? ");
        System.out.println("What year were you born ? ");
        boolean validDOB = false;
        int age = 0;
        do{
            System.out.println("Enter your year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));
            try{
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            }catch (NumberFormatException badUserData){
                System.out.println("Characters not allowed !!! Try again");
            }

        }while (!validDOB);

        return  "So you are " + age + " years old";
        // Robust - sağlam
    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob <  minimumYear) || (dob > currentYear)){
            return  -1;
        }
        return (currentYear - dob);
    }
}
