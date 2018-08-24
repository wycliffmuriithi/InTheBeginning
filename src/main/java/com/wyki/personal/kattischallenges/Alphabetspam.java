package com.wyki.personal.kattischallenges;

import java.util.Scanner;

/**
 * Created by wgicheru
 * on 17/08/2018
 */


public class Alphabetspam {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        String datasetcount = scanner.nextLine();

        double whitespacecount = 0;
        double lowercasecount = 0;
        double uppercasecount = 0;
        double symbols = 0;
        for (int i = 0; i < datasetcount.length(); i++) {
            char x = datasetcount.charAt(i);
            if (x == '_') {
                whitespacecount++;
            } else if (Character.isLowerCase(x)) {
                lowercasecount++;
            } else if (Character.isUpperCase(x)) {
                uppercasecount++;
            }else{
                symbols++;
            }
        }

        System.out.println(whitespacecount / datasetcount.length());
        System.out.println(lowercasecount /datasetcount.length());
        System.out.println(uppercasecount/datasetcount.length());
        System.out.println(symbols /datasetcount.length());
    }
}