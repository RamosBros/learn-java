package com.ramosbros.datastructures;

import com.ramosbros.useless.UselessClass;

/**
 * What is an array?
 * 
 * Well its like a container that contains Objects of the same type
 * 
 * Can make an array with any Object really
 * 
 * an array in Java is bounded, and you will get
 * ArrayIndexOutOfBoundException if you are working with an invalid index.
 * Array in Java are also homogeneous
 * 
 * lets see some examples
 */
public class ArraysExample {

    // we can declare and initialize arrays like this
    private int[] integers = new int[] { 1, 2, 3, 5, 6 };
    // or like simply like this
    private char[] characters = { 'a', 'b', 'c' };

    // or we can declare arrays and initialize them later
    private String[] words;
    private UselessClass[] uselessClasses;

    // Lets initialize some of the arrays
    public ArraysExample() {

        // So here we are initializing the words array to
        // hold up to three Strings
        words = new String[3];

        uselessClasses = new UselessClass[5];
    }

    /**
     * So this is a method that adds a string to an index in
     * an array
     * 
     * This is just for learning purposes, youd never do this
     * 
     * like write a method for this action that is
     * 
     * @param word
     * @param index
     */
    public void addElements(String word, int index) {

        // This is how we add something to an array
        // arrays are a fixed length when created
        words[index] = "overwrite";

        // Reading the code what would happen in the follwing?
        words[3] = "IsThisPossible";

        // with arrays, the data that was in that element is lost
        // once it is overwritten
        // In this example we overwrote what was in the index possition
        // with the word that was passed in
        words[index] = word;
    }
}
