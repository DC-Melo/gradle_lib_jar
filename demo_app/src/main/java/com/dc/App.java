package com.dc;
import demo.Library;

public class App {
    public static void main (String[] args) {
        System.out.println("demo app start");
        Library lib= new Library();
        System.out.println(lib.getDCDate());
    }
}

