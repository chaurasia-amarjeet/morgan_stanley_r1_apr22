package com.quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;

//Working of flatMap
public class Stream {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> listOfList = new ArrayList<>();
        listOfList.add(fillList(3));
        listOfList.add(fillList(5));
        listOfList.add(fillList(2));

        for(String value : listOfList.stream().flatMap(Collection::stream).collect(Collectors.toList())){
            System.out.println(value);
        }
    }

    private static ArrayList<String> fillList(int size){
        ArrayList<String> list = new ArrayList<>(size);

        for(int i = 0; i < size; i++){
            list.add(UUID.randomUUID().toString());
        }

        return list;
    }
}
