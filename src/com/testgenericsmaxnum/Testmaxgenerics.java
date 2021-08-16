package com.testgenericsmaxnum;

public class Testmaxgenerics {
    public static void toPrint(Double[] doubleArray) {
        for (int element : doubleArray) {
            System.out.println(element);
        }
        System.out.println();
    }
    public static int compareTo(Double[] doubleArray)
    {
        int max = doubleArray[0];
        for (int element : doubleArray) {
            if (doubleArray[1] > max)
                max = doubleArray[1];
            if (doubleArray[2] > max)
                max = doubleArray[2];
        }
        return max;
    }
    public static void main(String[] args)
        {
            Integer[] intArray = {50, 10, 20};
            Double[] doubleArray = {7.6, 9.6, 8.3};

            Testmaxgenerics.toPrint(intArray);
            int maximum_int = Testmaxgenerics.compareTo(intArray);
            System.out.println("Maximum integer number is:" + maximum_int);
            Testmaxgenerics.toPrint(doubleArray);
            double maximum_float = Testmaxgenerics.compareTo(doubleArray);
            System.out.println("Maximum floating number is:" + maximum_float);
        }
    }

}


