package com.testgenericsmaxnum;

public class Testmaxgenerics {
    {

        int x, y, z, a, b;

    public Testmaxgenerics( int x, int y, int z, int a, int b){
        this.x = x;
        this.y = y;
        this.z = z;
        this.a = a;
        this.b = b;
    }



        double q, p, r, s, t;

    public Testmaxgenerics( double p, double q, double r, double s, double t){
        this.p = p;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
    }

        String aa, bb, cc, xx, yy;

    public Testmaxgenerics( int aa, int bb, int cc, int xx, int yy){
        this.aa = aa;
        this.bb = bb;
        this.cc= cc;
        this.xx = xx;
        this.yy = yy;
    }

    public static maximum_int(Integer[] inputArray)
    {
        //Sort the array in ascending order
        int temp;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i+1; j < inputArray.length; j++) {
                if(inputArray[i] > inputArray[j]) {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = inputArray;
                }
            }
        }
    }
    public static maximum_double(Double[] doubleArray)
    {
        //Sort the array in ascending order
        double temp;
        for (double i = 0; i < doubleArray.length; i++) {
            for (double j = i+1; j < doubleArray.length; j++) {
                if(doubleArray[i] > doubleArray[j]) {
                    temp = doubleArray[i];
                    doubleArray[i] = doubleArray[j];
                    doubleArray[j] = temp;
                }
            }
        }
    } public static maximum_string(String[] stringArray)
    {
        //Sort the array in ascending order
        String temp;
        for (String i = 0; i < stringArray.length; i++) {
            for (String j = i+1; j < stringArray.length; j++) {
                if(stringArray[i] > stringArray[j]) {
                    temp = stringArray[i];
                    stringArray[i] = stringArray[j];
                    stringArray[j] = temp;
                }
            }
        }
    }


    public static int compareTo(Integer[] inputArray) {
        int max = inputArray[0];
        for (int element : inputArray) {
            if (inputArray[1] > max)
                max = inputArray[1];
            if (inputArray[2] > max)
                max = inputArray[2];
            if (inputArray[3] > max)
                max = inputArray[3];
            if (inputArray[4] > max)
                max = inputArray[4];
        }
        return max;
    }

    public static int compareTo(Double[] doubleArray);
    {
        int max = doubleArray[0];
        for (int element : doubleArray) {
            if (doubleArray[1] > max)
                max = doubleArray[1];
            if (doubleArray[2] > max)
                max = doubleArray[2];
            if (doubleArray[3] > max)
                max = doubleArray[3];
            if (doubleArray[4] > max)
                max = doubleArray[4];
        }
        return max;
    }

    public static int compareTo(String[] stringArray){

        int max = stringArray[0];
        for (int element : stringArray) {
            if (stringArray[1] > max)
                max = stringArray[1];
            if (stringArray[2] > max)
                max = stringArray[2];
            if (stringArray[3] > max)
                max = stringArray[3];
            if (stringArray[4] > max)
                max = stringArray[4];
        }
        return max;
    }
    public static void main(String[] args)
    {
        Testmaxgenerics testMaximum_int = new Testmaxgenerics(53,63,75,98,66).maximum_int();
        Testmaxgenerics testMaximum_double = new Testmaxgenerics(40.55,50.66,60.88,70.77,80.99).maximum_double();
        Testmaxgenerics testMaximum_string = new Testmaxgenerics("Apple","Peach","Banana","Lemon","Orange").maximum_string

    }

}

