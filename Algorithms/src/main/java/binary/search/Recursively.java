/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.search;

/**
 *
 * @author jobv
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Recursively {

    public static boolean binarySearchRecursive(int[] array, int x, int left, int right) {
        if (left > right) {
            return false;
        }

        int mid = left + ((right) / 2);
        if (array[mid] == x) {
            return true;
        } else if (x < array[mid]) {
            return binarySearchRecursive(array, x, left, mid - 1);
        } else {
            return binarySearchRecursive(array, x, mid + 1, right);
        }
    }

    public static boolean binarySearchRecursive(int[] array, int x) {
        return binarySearchRecursive(array, x, 0, array.length - 1);
    }

    public static void main(String[] args) {

    }

}
