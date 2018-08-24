package com.wyki.personal.kattischallenges;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by wgicheru
 * on 17/08/2018
 */


public class Aliceinthedigitalworld {

    /**
     * @param args the command line arguments
     */
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int datasetcount = scanner.nextInt();

        Aliceinthedigitalworld aliceinthedigitalworld = new Aliceinthedigitalworld();
        while (datasetcount > 0) {
            aliceinthedigitalworld.evaluatedataset(scanner);
            datasetcount--;
        }
    }

    private void evaluatedataset(Scanner scanner) {
        scanner.nextLine();
        String description = scanner.nextLine();
        String data = scanner.nextLine();

        int position = Integer.parseInt(description.split(" ")[0]);
        int offset = Integer.parseInt(description.split(" ")[1]);

        List<Integer> listdata = Arrays.asList(data.split(" ")).stream().map(i -> Integer.parseInt(i)).collect(Collectors.toList());
        position = listdata.indexOf(position);
        int sum1 = 0, sum2 = 0;
        for (int i = position; i <= position + offset; i++) {
            sum1 += listdata.get(i);
        }

        for (int i = position; i >= position - offset; i--) {
            sum2 += listdata.get(i);
        }
        System.out.println(sum1 > sum2 ? sum1 : sum2);
    }
}