package com.issoft.training.multimodulebinarysearcher.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class BinarySearcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(BinarySearcher.class);

    public static int binarySearch(int[] array, int element) {
        if (array == null) {
            throw new IllegalArgumentException("Array should not be null!");
        }
        LOGGER.debug("Starting search of element " + element + " in array: " + Arrays.toString(array));
        return doSearch(array, element, 0, array.length - 1);
    }

    private static int doSearch(int[] array, int element, int leftBorder, int rightBorder) {
        if (leftBorder > rightBorder) {
            LOGGER.debug("No element found, returning -1");
            return -1;
        }
        int midIndex = (leftBorder + rightBorder) / 2;
        int midElement = array[midIndex];
        if (element == midElement) {
            LOGGER.debug("Found element, returning it's position: " + midIndex);
            return midIndex;
        }
        if (element > midElement) {
            LOGGER.debug("Going to the part [" + (midIndex + 1) + ";" + rightBorder + "]");
            return doSearch(array, element, midIndex + 1, rightBorder);
        } else {
            LOGGER.debug("Going to the part [" + leftBorder + ";" + (midIndex - 1) + "]");
            return doSearch(array, element, leftBorder, midIndex - 1);
        }
    }
}
