package com.company;

public class Dry {

    // Method 1
    // For cse department
    public void CSE()
    {
        System.out.println("This is computer science");
    }

    // Method 2
    // For cse dept. college
    public void college()
    {
        System.out.println("IIT - Madras");
    }
    // Method 3
    // ece dept method
    public void ECE()
    {
        System.out.println("This is electronics");
    }

    // Method 4
    // For ece dept college 1
    public void college1()
    {
        System.out.println("IIT - Madras");
    }
    // Method 5
    // For IT dept
    public void IT()
    {
        System.out.println(
                "This is Information Technology");
    }

    // Method 6
    // For IT dept college 2
    public void college2()
    {
        System.out.println("IIT - Madras");
    }

    // Method 7
    // Main driver method
    public static void main(String[] args)
    {

        // Creating object of class in main() method
        Dry s = new Dry();

        // Calling above methods one by one
        // as created above
        s.CSE();
        s.college();
        s.ECE();
        s.college1();
        s.IT();
        s.college2();

        boolean a = true;
        boolean b = true;
        boolean c = true;
        boolean d = true;

        if(a) {
            if(b) {
                if(c) {
                    if(d)
                    {
                        System.out.println("Public");
                    }
                    else
                    {
                        System.out.println("Protected");
                    }
                }
            }
        }

        if(a && b && c && d)
            System.out.println("Public");





    }
}
