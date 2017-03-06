package com.company;

public class Main {

    public static void main(String[] args) {

        String buzz =  "buzz", fizz = "fizz"; //initialise the string variables
        for (int i = 1; i <= 100; i++)
        {
            if (i % 5 == 0 && i % 3 == 0)

                {
                System.out.println(buzz + fizz + " " + i);
            }
            else if (i % 3  == 0 )
            {
                System.out.println(buzz + " " + i);
            }
            else if (i % 5== 0)
            {
                System.out.println(fizz + " "+ i);
            }
        }
    }
}