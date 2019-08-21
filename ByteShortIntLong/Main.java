package com.company;

public class Main {

    public static void main(String[] args) {
	    int num = 10000;
	    int min = Integer.MIN_VALUE;
	    int max = Integer.MAX_VALUE;
            System.out.println("Integer Minimum Value = " + min);
            System.out.println("Integer Minimum Value = " + max);
            System.out.println("Busted Max value v1 = " + (max +1));
            System.out.println("Busted Max value v1 = " + (max -1));
            System.out.println("Busted Min value = " + (min -1));
        byte minbyte = Byte.MIN_VALUE;
        byte maxbyte = Byte.MAX_VALUE;
        System.out.println("Byte Min Val = " + minbyte);
        System.out.println("Byte Max Val = " + maxbyte);


        short minshort = Short.MIN_VALUE;
        short maxshort = Short.MAX_VALUE;
        System.out.println("Short Min Val = " + minshort);
        System.out.println("Short Max Val = " + maxshort);


        long longValue = 100;
        long minlong = Long.MIN_VALUE;
        long maxlong = Long.MAX_VALUE;
        System.out.println("Long Min Val = " + minlong);
        System.out.println("Long Max Val = " + maxlong);

        int myTotal = (min / 2);

        byte newByte = (byte) (minbyte / 2);

        short newShort = (short) (minshort / 2);
        short newerShort = (short) (20 * 2);

        byte byteChallenge = 126;
        short shortChallenge = 3200;
        if (false) throw new AssertionError();

        int intChallenge = 120;
        long longChallenge = 5000 + (10 * (((byte) (byteChallenge)) + (short) (shortChallenge) + intChallenge));
        System.out.println("challenge = " + longChallenge);
        System.out.println("newer short = " + newerShort);
    }
}
