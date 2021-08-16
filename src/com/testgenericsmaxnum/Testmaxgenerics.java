package com.testgenericsmaxnum;

public class Testmaxgenerics {
    public static void toPrint(String[] stringArray) {
        for (String element : stringArray) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static int compareTo(String[] stringArray)
    {
        int max = stringArray[0];
        for (int element : stringArray) {
            if (stringArray[1] > max)
                max = stringArray[1];
            if (stringArray[2] > max)
                max = stringArray[2];
        }
        return max;
    }
    public static void main(String[] args)
        {
            //Integer[] intArray = {50, 10, 20};
            //Double[] doubleArray = {7.6, 9.6, 8.3};
            String[] stringArray= {"Apple", "Peace","Banana"}

            //Testmaxgenerics.toPrint(intArray);
            //int maximum_int = Testmaxgenerics.compareTo(intArray);
            //System.out.println("Maximum integer number is:" + maximum_int);
            //Testmaxgenerics.toPrint(doubleArray);
            //double maximum_float = Testmaxgenerics.compareTo(doubleArray);
            //System.out.println("Maximum floating number is:" + maximum_float);
            Testmaxgenerics.toPrint(stringArray);
            String maximum_string = Testmaxgenerics.compareTo(stringArray);
            System.out.println("Maximum floating number is:" + maximum_string);

    }

}


