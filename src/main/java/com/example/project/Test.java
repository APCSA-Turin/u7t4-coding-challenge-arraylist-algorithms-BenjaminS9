package com.example.project;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 2, 5, 2};
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intArray));
        ArrayList<Integer> printList = Main.notAlone(intList, 2);
        for (int num : printList) {
            System.out.println(num);
        }
    }
}