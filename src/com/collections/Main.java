/**
 *  Java program to create, update, read and delete HashMap instance.
 */

package com.collections;

import java.util.HashMap;
import java.util.Map;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create an instance of HashMap.
        Map<Double, Integer> myMap = new HashMap<>();

        // Add elements to HashMap.
        myMap.put(2.1, 3);
        myMap.put(3.9, 2);
        myMap.put(8.9, 4);
        myMap.put(2.3, 6);
        myMap.put(4.6, 8);

        // Print.
        System.out.println(myMap); // Output: {2.3=6, 4.6=8, 3.9=2, 8.9=4, 2.1=3}

        // Delete elements with index 2.3.
        myMap.remove(2.3);

        // Print.
        System.out.println(myMap); // Output: {4.6=8, 3.9=2, 8.9=4, 2.1=3}

        myMap.replace(4.6, 7);

        // Print.
        System.out.println(myMap); // Output: {4.6=7, 3.9=2, 8.9=4, 2.1=3}

    }
}