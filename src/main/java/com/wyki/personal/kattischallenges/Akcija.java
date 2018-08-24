package com.wyki.personal.kattischallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by wgicheru
 * on 17/08/2018
 */


public class Akcija {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int bookcount = Integer.parseInt(scanner.nextLine());
        // System.out.println("processing input for " + bookcount + " clients");
        List<Integer> bookcost = new ArrayList<>();
        int sum = 0;
        while (bookcount > 0) {
//            int x = Integer.parseInt(scanner.nextLine());
            int x = scanner.nextInt();
            bookcost.add(x);
            //then add every first two items of three

            // System.out.println(bookcount + ". entry " + x);
            bookcount--;
        }

        Collections.sort(bookcost);
        Collections.reverse(bookcost);
        for (int i = 0; i < bookcost.size(); i++) {
            if ((i + 1) % 3 != 0) {
                sum += bookcost.get(i);
            }
        }
        System.out.println(sum);

    }
}