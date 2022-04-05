package com.geekbrains.lesson5;

public class ThreadHomework {

    private static final int SIZE = 10_000_000;
    private static final int HALF_SIZE = SIZE / 2;

    public static void main(String[] args) {
        firstMethod();
        secondMethod();
    }

    private static void formula(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    private static void firstMethod() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        formula(arr);
        System.out.println("One thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
    }

    private static void secondMethod() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long startTime = System.currentTimeMillis();
        float[] leftHalf = new float[HALF_SIZE];
        float[] rightHalf = new float[HALF_SIZE];
        System.arraycopy(arr, 0, leftHalf, 0, HALF_SIZE);
        System.arraycopy(arr, HALF_SIZE, rightHalf, 0, HALF_SIZE);
        System.out.println("Array split time: " + (System.currentTimeMillis() - startTime) + " ms.");

        Thread t1 = new Thread(()-> {
            long leftHalfSplitTime = System.currentTimeMillis();
            formula(leftHalf);
            System.out.println("Time for the left half of the array: " + (System.currentTimeMillis() - leftHalfSplitTime) + " ms.");
        });

        Thread t2 = new Thread(()-> {
            long rightHalfSplitTime = System.currentTimeMillis();
            formula(rightHalf);
            System.out.println("Time for the right half of the array: " + (System.currentTimeMillis() - rightHalfSplitTime) + " ms.");
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long mergeArrayTime = System.currentTimeMillis();
        float[] mergedArray = new float[SIZE];

        System.arraycopy(leftHalf, 0, mergedArray, 0, leftHalf.length);
        System.arraycopy(rightHalf, 0, mergedArray, leftHalf.length, rightHalf.length);

        System.out.println("MergeArrayTime " + (System.currentTimeMillis() - mergeArrayTime) + " ms.");
        System.out.println("Two thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
    }
}

