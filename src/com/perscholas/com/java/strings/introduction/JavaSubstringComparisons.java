package com.perscholas.com.java.strings.introduction;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaSubstringComparisons {

    public void substringComparisonsTest() {

        String scannedString;
        ArrayList<String> scannedStringArray = new ArrayList<>();
        int scannedSubstringLength;
        String lexSmallest = "";
        String lexLargest = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string from 1 to 1,000 alphabetic characters: ");
        scannedString = scanner.nextLine();
        while (scannedString.length() < 1 || scannedString.length() > 1000) {
            System.out.println("Enter a string from 1 to 1,000 alphabetic characters: ");
            scannedString = scanner.nextLine();
        }

        System.out.println("Enter a number from 1 to " + scannedString.length() + ":");
        scannedSubstringLength = scanner.nextInt();
        while (scannedSubstringLength > scannedString.length()) {
            System.out.println("Enter a number from 1 to " + scannedString.length() + ":");
            scannedSubstringLength = scanner.nextInt();
        }

        for (int i = 0; i < scannedString.length(); i++) {

            //try {
            if (i + scannedSubstringLength > scannedString.length()) { //to catch the index out of bounds
                break;
            }
            scannedStringArray.add(scannedString.substring(i, i + scannedSubstringLength));
            //System.out.println(i);
            //scannedStringArray.add(scannedString.substring(i, i + 2)); //wrong approach!
            //} catch (StringIndexOutOfBoundsException e) {
            //System.out.println("Error: Index is out of bounds.");
            //}
        }

        //System.out.println("Before 1st for loop, Array size is: " + scannedStringArray.size());
        lexSmallest = scannedStringArray.get(0);

        for (int i = 0; i < scannedStringArray.size(); i++) {

            //System.out.println("i is: " + i);

            if (i + 1 == scannedStringArray.size()) {
                break;
            }

            if (lexSmallest.compareTo(scannedStringArray.get(i + 1)) <= 0) {
                lexSmallest = lexSmallest;
//                System.out.println(scannedStringArray.get(i));
//                System.out.println(scannedStringArray.get(i + 1));
//                System.out.println(lexSmallest);
//                System.out.println("first part of if statement");

            } else {

                lexSmallest = scannedStringArray.get(i + 1);
//                System.out.println(scannedStringArray.get(i));
//                System.out.println(scannedStringArray.get(i + 1));
//                System.out.println(lexSmallest);
//                System.out.println("second part of if statement");
            }
        }


        lexLargest = scannedStringArray.get(0);

        for (int i = 0; i < scannedStringArray.size(); i++) {

            if (i + 1 == scannedStringArray.size()) {
                break;
            }

            if (lexLargest.compareTo(scannedStringArray.get(i + 1)) >= 0) {

                lexLargest = lexLargest;

            } else {

                lexLargest = scannedStringArray.get(i + 1);
            }
        }

        //System.out.println(scannedStringArray);
        System.out.println(lexSmallest + "\n" + lexLargest);

        //scanner.close(); this seem to error unless we only close it at the very end of all called methods in Main
    }
}