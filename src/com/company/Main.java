package com.company;

import java.util.Scanner;

public class Main {
    public static void getLastSymbol(String str)
    {
        System.out.println(str.charAt(str.length()-1));
    }

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        getLastSymbol(scanner.nextLine());
    }
}
