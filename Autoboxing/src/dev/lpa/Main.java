package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15);  // preferred but unnecessary
//        Integer deprecatedBoxing = new Integer(15);  // deprecated since JDK 9
        int unboxedInt = boxedInt.intValue();   // unnecessary



        // Automatic
        Integer autoBoxed = 15;
        int autoUnBoxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
//        System.out.println(autoUnBoxed.getClass().getName());



        // auto happening
        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();


    Integer[] wrappedArray = new Integer[5];
    wrappedArray[0] = 50;
        System.out.println(Arrays.toString(wrappedArray));
        System.out.println(wrappedArray[0].getClass().getName());


    Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));


    var outList = List.of(1, 2, 3, 4, 5);
        System.out.println(outList);

    }

    private static ArrayList<Integer> getList(Integer... varargs){
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i : varargs){
            aList.add(i);
        }
        return aList;
    }

    private static int returnAnInt(Integer i){
        return i;
    }

    private static Integer returnAnInteger(int i){
        return i;
    }

    private static Double getDoubleObject(){
        return Double.valueOf(100.00);
    }
    private static double getLiteralDoublePrimitive(){
        return 100.0;
    }
}
