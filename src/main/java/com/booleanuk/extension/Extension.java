package com.booleanuk.extension;

import com.booleanuk.helpers.ExtensionBase;

public class Extension extends ExtensionBase {
    /*
        Implement the following methods:

        1. add, which accepts two floats and returns a float (both floats added together)

        2. add, which accepts two doubles and returns a double (both doubles added together)

        3. subtract, which accepts two floats and returns a float (first float minus second float)

        4. subtract, which accepts a String and a char and returns a string with all instances of the provided char removed

        5. multiply, which accepts two ints and returns an int (first int multiplied by second int)

        6. multiply, which accepts a string and an int, and returns a string containing the provided string
        as many times as the provided int separated by a comma. E.g.
        multiply("Hello", 3) -> "Hello,Hello,Hello"

        7. multiply, which accepts an array of Strings that each contain a number, and an int
        The method should return an array of ints that contain the value of multiplying each String number by the provided int
        E.g.
        multiply(["2", "7", "3"], 3) -> [6, 21, 9]
     */

    public float add(float f1, float f2){
        return f1 + f2;
    }

    public double add(double d1, double d2){
        return d1 + d2;
    }

    public float subtract(float f1, float f2){
        return f1 - f2;
    }

    public String subtract(String s, char c){
        String charToString = Character.toString(c);
        return s.replaceAll(charToString, "");
    }

    public int multiply(int num1, int num2){
        return num1 * num2;
    }

    public String multiply(String s, int num){
        String temp = s;
        for (int i = 1; i < num; i++){
            s += "," + temp;
        }

        return s;
    }

    public int[] multiply(String[] nums, int num){
        int[] ints = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            int number = Integer.parseInt(nums[i]);
            ints[i] = number * num;
        }
        return ints;
    }


}
