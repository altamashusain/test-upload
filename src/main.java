import java.util.*;
public class main{
//    public static int powerOptimized(int x, int n){
//
//        if ( n == 0){
//            return 1;
//        }
//        int halfpow = powerOptimized(x,n/2);
//        int halfPowSq = halfpow * halfpow; // tc 0(log n)
//        //int halfPowSq = powerOptimized(x, n/2) * powerOptimized(x,n/2); // tc 0(n)
//
//        // if n is ODD
//        if(n % 2 != 0){
//            halfPowSq = x * halfPowSq;
//        }
//        return halfPowSq;
//    }


//    public static void main (String args[]){
//        //System.out.println(power(2,10));
//        System.out.println(powerOptimized(2,10));
//    }
public static int powerOptimized(int x, int n){

    if ( n == 0){
        return 1;
    }
    int halfpow = powerOptimized( x,n/2);
    int halfPowSq = halfpow * halfpow; // tc 0(log n)
    //int halfPowSq = powerOptimized(x, n/2) * powerOptimized(x,n/2); // tc 0(n)

    // if n is ODD
    if(n % 2 != 0){
        halfPowSq = x * halfPowSq;
    }
    return halfPowSq;
}


    public static void main (String args[]){
        //System.out.println(power(2,10));
        System.out.println(powerOptimized(2,10));
    }
}
