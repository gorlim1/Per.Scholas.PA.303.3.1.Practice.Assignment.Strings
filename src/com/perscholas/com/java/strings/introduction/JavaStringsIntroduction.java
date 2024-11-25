package com.perscholas.com.java.strings.introduction;

import java.util.Scanner;

public class JavaStringsIntroduction {

    //Variables
    String scannedString1;
    String scannedString1FirstLetter;
    String scannedString1RemainingLetters;
    String scannedString2;
    String scannedString2FirstLetter;
    String scannedString2RemainingLetters;
    int scannedStringsCombinedSum;
    Scanner stringScanner = new Scanner(System.in);

    public void stringMethodsTest() {

        //Input from keyboard
        System.out.println("Please enter a lowercase string of characters without spaces:");
        scannedString1 = stringScanner.nextLine();
        System.out.println("Please another another lowercase string of characters without spaces:");
        scannedString2 = stringScanner.nextLine();

        //String Sum
        scannedStringsCombinedSum = scannedString1.length() + scannedString2.length();
        System.out.println(scannedStringsCombinedSum);

        //String compare
        if(scannedString1.compareTo(scannedString2) > 0) {
            System.out.println("Yes");
        }

        //Confusing, as HackerRank didn't make the greater than scenario more clear
        if(scannedString1.compareTo(scannedString2) <= 0) {
            System.out.println("No");
        }

        //String first letter capitalization
        scannedString1FirstLetter = scannedString1.substring(0,1);
        scannedString1RemainingLetters = scannedString1.substring(1,scannedString1.length());
        scannedString1FirstLetter = scannedString1FirstLetter.toUpperCase();

        scannedString2FirstLetter = scannedString2.substring(0,1);
        scannedString2RemainingLetters = scannedString2.substring(1, scannedString2.length());
        scannedString2FirstLetter = scannedString2FirstLetter.toUpperCase();

        System.out.println(scannedString1FirstLetter + scannedString1RemainingLetters + " "
                + scannedString2FirstLetter + scannedString2RemainingLetters);

        //stringScanner.close(); this seem to error unless we only close it at the very end of all called methods in Main
    }
}