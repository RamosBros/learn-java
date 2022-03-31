package com.ramosbros.core;

public class BreakStatement {

    public void LabeledBreakExample() {
        int[][] arr = { { 1, 2 }, { 3, 4 }, { 9, 10 }, { 11, 12 } };
        boolean found = false;
        int row = 0;
        int col = 0;
        // find index of first int greater than 10
        searchint:

        for (row = 0; row < arr.length; row++) {
            for (col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > 10) {
                    found = true;
                    // using break label to terminate outer statements
                    break searchint;
                }
            }
        }
        if (found)
            System.out.println("First int greater than 10 is found at index: [" + row + "," + col + "]");
    }

    public void UnlabledBreakExample() {
        String[] arr = { "A", "E", "I", "O", "U" };

        // find O in the array using for loop
        for (int len = 0; len < arr.length; len++) {
            if (arr[len].equals("O")) {
                System.out.println("Array contains 'O' at index: " + len);
                // break the loop as we found what we are looking for
                break;
            }
        }
    }
}
