package com.company;

public class Main {

    static String printName(String firstName, String lastName ){
        System.out.println("My first name is: " + firstName);
        System.out.println("My last name is : " + lastName);

        return firstName+" "+lastName;
    }

    static int plus(int arg1,int arg2){
        return arg1+arg2;
    }

    static int  multiple(int arg1, int arg2, int arg3) {
        return arg1 * arg2 * arg3;
    }

    public static void main(String[] args) {

        String printName = printName("Tomasz","Jabłoński");
        System.out.println(printName);

        int plus = plus(10,5);
        System.out.println(plus);

        int multipleValue = multiple(23, 2, 5); // 230
        System.out.println(multipleValue);
        
    }
}
