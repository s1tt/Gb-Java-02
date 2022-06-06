package com.geekbrains.lesson2;

public class SumOfArrayElements {
    int sum = 0;

    public static void sumElements(String[][] myArr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (!(myArr.length == 4 && myArr[0].length == 4)){
            throw new MyArraySizeException("Array size should be 4x4");
        }

        for (int i = 0; i < myArr.length; i++){
            for (int j = 0; j < myArr[i].length; j++){
                try {
                    int int1 = Integer.parseInt(myArr[i][j]);
                    sum +=int1;
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("Error found: "+ myArr[i][j] + "." + " Line: " + (i + 1) + " Column: " + (j + 1) + ". Index in array: " + i + " " + j);
                }
            }
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
