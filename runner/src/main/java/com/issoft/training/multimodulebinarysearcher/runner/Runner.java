package com.issoft.training.multimodulebinarysearcher.runner;

import com.issoft.training.multimodulebinarysearcher.util.BinarySearcher;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Found index = " + BinarySearcher.binarySearch(new int[]{124, 137, 321, 400, 500, 512}, 400));
    }
}
