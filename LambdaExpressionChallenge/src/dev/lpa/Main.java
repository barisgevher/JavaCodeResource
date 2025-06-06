package dev.lpa;

import java.util.*;

public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {
        String[] names = {"Anna", "Bob", "Carole", "David", "Ed", "Fred", "Gary"};

        Arrays.setAll(names, i -> names[i].toUpperCase(Locale.ENGLISH));
        System.out.println("--> Transform to uppercase");
        System.out.println(Arrays.toString(names));

        List<String> backedByArray = Arrays.asList(names);

        backedByArray.replaceAll(s -> s += " " + getRandomChar('A', 'D')+ ".");
        System.out.println("--> Add random middle initial");
        System.out.println(Arrays.toString(names));

        backedByArray.replaceAll(s -> s += " " + getReversedName(s.split(" ")[0]));
        System.out.println("--> Add reversed name as last name");
       Arrays.asList(names).forEach(s -> System.out.println(s));

       List<String> newList = new ArrayList<>(List.of(names));
       newList.removeIf(s -> s.substring(0, s.indexOf(" ")).equals(s.substring(s.lastIndexOf(" ") +1)
       ));

        newList.removeIf(s ->{
               String first =  s.substring(0, s.indexOf(" "));
               String last =  s.substring(s.lastIndexOf(" ") +1);
               return first.equals(last);
        });

        System.out.println("--> Remove names where first = last");
        newList.forEach(s -> System.out.println(s));




    }
    public static char getRandomChar(char startChar, char endChar) {
        return (char) random.nextInt((int) startChar, (int) endChar + 1);
    }

    private static String getReversedName(String firstName){
        return new StringBuilder(firstName).reverse().toString();
    }
}
