package dev.lpa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

//package dev.lpa;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//record GroceryItem(String name, String type, int count){
//    public GroceryItem(String name){
//        this(name, "DAIRY", 1);
//    }
//
//    @Override
//    public String toString(){
//        return String.format("%d %s in %s", count, name.toUpperCase(), type);
//    }
//}
//
//
//
//public class Main {
//    public static void main(String[] args) {
//         ArrayList<GroceryItem> groceryList = new ArrayList<>();
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Press 0 -> to shutdowm");
//        System.out.println("Press 1 -> to add item");
//        System.out.println("Press 2 -> to remove an item");
//        String buttonValue = scanner.next();
//
//        while (true){
//            if (buttonValue == "0"){
//                break;
//            } else if (buttonValue == "1") {
//                System.out.println("Please add the item name wanted to add to list ");
//                String value = scanner.next();
//                addItem(value);
//                break;
//            } else if (buttonValue == "2") {
//                System.out.println("Please write the name of the item wanted to be removed");
//                 String value = scanner.next();
//                 removeItem(value);
//
//            }else {
//                System.out.println("Please select one of the menu buttons");
//            }
//        }
//
//    }
//
//    public static ArrayList<GroceryItem>  addItem(ArrayList<GroceryItem> groceryList, String name, String type, int count){
//
//
//
//
//    }
//
//    public static void removeItem(String value){
//
//    }
//}
public class Main{

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();

        while (flag){
            printActions();
            switch (Integer.parseInt(scanner.nextLine())){
                case 1 ->  addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

    private static void addItems(ArrayList<String> groceries){
        System.out.println("Add item(s) [seperate items by comma]:");
        String[] items = scanner.nextLine().split(",");
//        groceries.addAll(List.of(items));
            for (String i: items){
                String trimmed = i.trim();
                if (groceries.indexOf(trimmed) < 0){
                    groceries.add(trimmed);

                }
            }

    }

    private static void removeItems(ArrayList<String> groceries){
        System.out.println("Remove item(s) [seperate items by comma]:");
        String[] items = scanner.nextLine().split(",");


        for (String i: items){
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }

    }

    private static void printActions(){
        String textBlock = """                
                Available actions:
                                
                0 - to shutdown
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                                
                Enter a number for which action you want to do:""";
        System.out.print(textBlock + " ");

    }
}
