package com.wyki.personal.kattischallenges;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by wgicheru
 * on 17/08/2018
 */


public class Anotherbrickinthewall {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        String wallspecs = scanner.nextLine();
        String brickdata = scanner.nextLine();

        List<Integer> bricklist = Arrays.asList(brickdata.split(" ")).stream().map(i -> Integer.parseInt(i)).collect(Collectors.toList());

        int loopcount = Integer.parseInt(wallspecs.split(" ")[0]);
        int wallength = Integer.parseInt(wallspecs.split(" ")[1]);

        int counter =0;
        boolean buildingflag = true;
        while (loopcount > 0 && buildingflag) {
            //build length of wall
            int builtlength = 0;
            for (int i=counter;i<bricklist.size();i++) {
                counter = i+1;
                int length = bricklist.get(i);
                builtlength += length;
//                System.out.println("BUILT "+builtlength+" WALL "+wallength);
                if(builtlength == wallength){
                    break;
                }else if(builtlength > wallength){
                    buildingflag = false;
                    break;
                }
            }
            loopcount--;
        }

        System.out.println(buildingflag ? "YES" : "NO");
    }
}