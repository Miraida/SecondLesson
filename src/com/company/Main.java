package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
             // switch
//	int num=10;
//	switch (num)
//       {
//        case 1:
//            System.out.println("The value is 1");
//            break;
//        case 5:
//            System.out.println("The value is 5");
//            break;
//        case 10:
//            System.out.println("The value is 10");
//               break;
//       }
//        Scanner in=new Scanner(System.in);
//        System.out.println("Enter a color");
//        String color;
//        color=in.nextLine();
//
//        switch (color)
//        {
//            case "red":
//                System.out.println("You are proactive");
//                break;
//            case "white":
//                System.out.println("You are kind and soft");
//                break;
//            case "black":
//                System.out.println("You are stylish and mysterious");
//                break;
//        }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
                       //  Булева Алгебра(Условные операторы  &&,||,!)
//        int num=10;
//        int age=20;
//
//        if(num>5 && age>18){
//            System.out.println("You can go out");
//        }
//        if(num==0 || age>18){
//            System.out.println("Success!");
//        }
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////
                 // Методы возвращаемые и не возвращаемые


        printf();
        printOurWord("good");
        System.out.println("summa chisel:"+getSumOfValues(2,3));
    }
    public static  void printf(){
        System.out.println("Hey, What's up?");
    }
    public static void printOurWord(String x){
        System.out.println(x);
        x="bad";
    }

    public static int getSumOfValues(int num1, int num2){
        return num1+num2;
    }

}
