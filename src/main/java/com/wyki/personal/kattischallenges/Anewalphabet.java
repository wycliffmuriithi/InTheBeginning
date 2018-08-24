package com.wyki.personal.kattischallenges;


import java.util.Scanner;

/**
 * Created by wgicheru
 * on 17/08/2018
 */


public class Anewalphabet {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "";
        Anewalphabet anewalphabet = new Anewalphabet();
        for(int i = 0; i<input.length(); i++){
            char x = input.charAt(i);
                output = output + anewalphabet.encodetoalphabet(x);
        }

        System.out.println(output);
    }

    private String encodetoalphabet(char x){
        switch (x){
            case 'a':
            case 'A':
                return "@";
            case 'b':
            case 'B':
                return "8";
            case 'c':
            case 'C':
                return "(";
            case 'd':
            case 'D':
                return "|)";
            case 'e':
            case 'E':
                return "3";
            case 'f':
            case 'F':
                return "#";
            case 'g':
            case 'G':
                return "6";
            case 'h':
            case 'H':
                return "[-]";
            case 'i':
            case 'I':
                return "|";
            case 'j':
            case 'J':
                return "_|";
            case 'k':
            case 'K':
                return "|<";
            case 'l':
            case 'L':
                return "1";
            case 'm':
            case 'M':
                return "[]\\/[]";
            case 'N':
            case 'n':
                return "[]\\[]";
            case 'o':
            case 'O':
                return "0";
            case 'p':
            case 'P':
                return "|D";
            case 'q':
            case 'Q':
                return "(,)";
            case 'R':
            case 'r':
                return "|Z";
            case 's':
            case 'S':
                return "$";
            case 'T':
            case 't':
                return "']['";
            case 'u':
            case 'U':
                return "|_|";
            case 'V':
            case 'v':
                return "\\/";
            case 'w':
            case 'W':
                return "\\/\\/";
            case 'X':
            case 'x':
                return "}{";
            case 'y':
            case 'Y':
                return "`/";
            case 'Z':
            case 'z':
                return "2";
            default:
                return String.valueOf(x);
                
        }
    }
}