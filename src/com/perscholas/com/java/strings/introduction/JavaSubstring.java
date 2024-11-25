package com.perscholas.com.java.strings.introduction;

import java.util.Scanner;

public class JavaSubstring {

    public void stringSubstringTest() {

        String scannedString;
        String scannedIndexesString;
        String[] scannedIndexesStringArray;
        //String scannedStringRange; is it better to explicitly declare this?
        int scannedIndex1;
        int scannedIndex2;
        Scanner scanner = new Scanner(System.in);
        //Scanner intScanner = new Scanner(System.in); should there be a scanner for each?

        System.out.println("Please enter a string from 1 to 100 characters:");
        scannedString = scanner.nextLine();
        while (scannedString.length() < 1 || scannedString.length() > 100) {
            System.out.println("Please re-enter a string from 1 to 100 characters:");
            scannedString = scanner.nextLine();
        }

        System.out.println("Please enter two integers seperated by a space from 0 to " + scannedString.length() + ":");
        scannedIndexesString = scanner.nextLine();
        scannedIndexesStringArray = scannedIndexesString.split("\\s");
        scannedIndex1 = Integer.parseInt(scannedIndexesStringArray[0]);
        scannedIndex2 = Integer.parseInt(scannedIndexesStringArray[1]);

        while (scannedIndex1 < 0 || scannedIndex1 > scannedString.length() || scannedIndex2 < 1 || scannedIndex2 > scannedString.length()) {
            System.out.println("Please re-enter two integers seperated by a space from 0 to " + scannedString.length() + ":");
            scannedIndexesString = scanner.nextLine();
            scannedIndexesStringArray = scannedIndexesString.split("\\s");
            scannedIndex1 = Integer.parseInt(scannedIndexesStringArray[0]);
            scannedIndex2 = Integer.parseInt(scannedIndexesStringArray[1]);
        }

        System.out.println(scannedString.substring(scannedIndex1, scannedIndex2));

        //scanner.close(); this seem to error unless we only close it at the very end of all called methods in Main
    }
}


