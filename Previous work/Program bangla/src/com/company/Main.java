package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);//for input
    public static void main(String[] args) {
        // taking input and printing something
        System.out.println("Enter your name : \n");
	    String name = sc.nextLine();
       System.out.println("Hello!"+name);

       //variable and data type
        System.out.println("variable and data type");
        short firstnumber;//declaring variable (16 bit)
        int secondnumber;//declaring variable (32 bit)
        long secondNumber;

        firstnumber = 10;//assigning value
        secondnumber = 20;//assigning value

        int result = secondnumber+1000;//declaring variable and assigning value

        System.out.println(firstnumber);
        System.out.println(secondnumber);
        System.out.println(result);

        int result2 = firstnumber/3;

        System.out.println(result2);

        float thirdnumber = 10;
        float resultf = thirdnumber/3;
        double thirdNumber;

        System.out.println(resultf);

        char firstChar = 'A';// 'A' and 'a' are not same as java is case sensitive
        System.out.println(firstChar);

        boolean statement1 = true;//it can save two data : true and false
        boolean statement2 = false;//it is a datatype where we can save true or false

        System.out.println(statement1);
        System.out.println(statement2);

        byte data;// byte is a also data type...it means 8 bits

        //Operator
        // +, -, /, *, %, +=, -=, /=, *=, ..... etc can be used
        System.out.println("Operators");
        boolean statement3 = 3<4;
        boolean statement4 = (3-1)>4;
        boolean statement5 = (2+2)==4;// <= , >= , != also can be used
        System.out.println(statement3);
        System.out.println(statement4);
        System.out.println(statement5);
        int num1 = 10;
        num1++; //it means num1 += 1; 0r num1 = num1+1;
        System.out.println(num1);//num1-- 0r num1 -= 1 or num1 = num1-1

//         shortcut for comment : ctrl+slash

        //Array
        int[] arr;//only declaring array
        int[] arr1 = new int[8];
        int[] arr2 = {1, 6, 452};
        char[] arr3 = {'1', '6', 'a', 'E'};

        System.out.println("Array");
        System.out.println(arr2[0]);

        //Method
        System.out.println("Method");
        boolean st1 = method1(12,13);
        System.out.println(st1);
    }
    //Method
    static public boolean method1(int n1, int n2)
    {
        boolean ans = n1 > n2;
        return  ans;
    }
}
