package com.company;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        List<Integer> aList = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            aList.add(i);
        aList.remove(3);
        System.out.println(aList);
        System.out.println();

    }
}
