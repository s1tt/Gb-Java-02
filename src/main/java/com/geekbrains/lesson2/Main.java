package com.geekbrains.lesson2;

public class Main {
    public static void main(String[] args) {

        String[][] myArray = {{"1", "2","1", "33"}, {"1", "2", "3", "2"}, {"1", "2", "1", "2"}, {"1", "2", "1", "2"}};

        try {
            SumOfArrayElements.sumElements(myArray);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

}
