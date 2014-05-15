package com;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println("input");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println( input );
        p();

    }

    public static void p()
    {
        System.out.println("p");
    }
}
