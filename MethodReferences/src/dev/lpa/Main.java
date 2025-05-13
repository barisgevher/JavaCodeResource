package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

class PlainOld{

    private static int last_id = 1;

    private int id ;
    public PlainOld() {
        id = PlainOld.last_id++;
        System.out.println("Creating a plainOld Object:  id = " + id);
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(List.of(
                "Anna", "Bob", "Chuck", "Dave"
        ));

        list.forEach(System.out::println);

        calculator(Integer::sum, 10, 20);
        calculator(Double::sum, 2.5, 7.5);

        Supplier<PlainOld> reference1 = PlainOld::new;   // waiting for object call
        PlainOld plainOld = reference1.get();  // the call

        System.out.println("Getting array");
        PlainOld[] pojo1 = seedArray(PlainOld::new, 10);

//        calculator((s1, s2) -> s1 + s2, "Hello " , "World");
        calculator((s1, s2) -> s1.concat(s2), "Hello " , "World");
        calculator(String::concat, "Hello " , "World");

//        BinaryOperator<String> b1 = (s1, s2) -> s1.concat(s2);
//        BiFunction<String,String, String> b2 = (s1, s2) -> s1.concat(s2);

        BinaryOperator<String> b1 = String::concat;
        BiFunction<String,String, String> b2 = String::concat;

//        UnaryOperator<String> u1 = String::concat;   // Non-static method cannot be referenced from a static context

        UnaryOperator<String> u1 = (s1) -> s1.toUpperCase();
        UnaryOperator<String> u2 = String::toUpperCase;

        System.out.println("------------------");

        System.out.println(b1.apply("Hello ", "World"));
        System.out.println(b2.apply("Hello ", "World"));
        System.out.println(u1.apply("Hello"));

        String result = "Hello".transform(u1);
        System.out.println("Result = " + result);

        result = result.transform(String:: toLowerCase);
        System.out.println("Result = " + result);

        Function<String, Boolean> f0 = String::isEmpty;
        boolean resultBoolean = result.transform(f0);
        System.out.println("ResultBoolean = " + resultBoolean);




    }

    private static <T> void calculator(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
    }

    private static PlainOld[] seedArray(Supplier<PlainOld> reference, int count) {
        PlainOld[] array = new PlainOld[count];
        Arrays.setAll(array, i -> reference.get());
        return array;
    }
}
