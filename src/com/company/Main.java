package com.company;

public class Main {
    public static void getLastSymbol(String str)
    {
        System.out.println(str.charAt(str.length()-1));
    }

    public static void main(String[] args) {
	    String str = "Hello";
        getLastSymbol(str);
        str = "Bye";
        getLastSymbol(str);
    }
}
