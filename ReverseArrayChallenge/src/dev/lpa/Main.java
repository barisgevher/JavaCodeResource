package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        reverse(array);
    }

    private static void reverse(int[] array){

        for (int i = 0; i < array.length - 1; i++){
            for (int j = array.length - 1;  j >= 0; j--){
                array[i] = array[j];
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
