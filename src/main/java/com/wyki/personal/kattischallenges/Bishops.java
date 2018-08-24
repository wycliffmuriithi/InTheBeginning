package com.wyki.personal.kattischallenges;

import java.util.Scanner;

/**
 * Created by wgicheru
 * on 17/08/2018
 */


public class Bishops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String text = scanner.nextLine();
            if(text.equals("0")){
                System.out.println(0);
            }else if(text.equals("1")){
                System.out.println(1);
            }else {
                int x = Integer.parseInt(text);
                System.out.println((x +(x-2)));
            }
        }
    }
}