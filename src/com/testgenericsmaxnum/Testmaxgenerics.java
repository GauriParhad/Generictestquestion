public class Testmaxgenerics <T extends Comparable<T>>{

    T x, y, z, a, b;

    public Testmaxgenerics( int x, int y, int z, int a, int b){
        this.x = x;
        this.y = y;
        this.z = z;
        this.a = a;
        this.b = b;
    }
    public T maximum()
    {
        return Testmaxgenerics(x,y,z,a,b);
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z, T a ,T b){
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        if (a.compareTo(max) > 0) {
            max = a;
            if (b.compareTo(max) > 0) {
                max = b;
        System.out.println(x, y, z, a,b, max);
        return max;
    }
            public static <T extends Comparable<T>> T maximum(T x, T y, T z, T a ,T b,T max){
                System.out.println(max);
            }



    public static void main(String[] args){
                Integer xInt = 3, yInt = 4, zInt = 5, aInt= 8, bInt=7;
                Float xF1 = 6.6f, yF1 = 7.7f, zF1 = 8.8f,aF1=2.3,bF1=6.8;
                String xStr = "Apple", yStr = "Peace", zStr = "Banana", aStr="Pineapple" ,bStr="Cherry";

                Testmaxgenerics.testMaximum(xStr, yStr, zStr);
                new  Testmaxgenerics(xInt, yInt, zInt,aInt,bInt).maximum();
                new Testmaxgenerics<>(xF1, yF1, zF1,aF1,bF1).maximum();
                new Testmaxgenerics<>(xStr, yStr, zStr,aStr,bStr).maximum();
                
    }

}

