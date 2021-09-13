/*
 *  UCF COP3330 Fall 2021 Assignment 1.21 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Please enter the number of the month: "); //Asking for user input
        int month = x.nextInt();
        String monthword;

        switch (month) {
            case 1:
                monthword = "January";
                break;
            case 2:
                monthword = "February";
                break;
            case 3:
                monthword = "March";
                break;
            case 4:
                monthword = "April";
                break;
            case 5:
                monthword = "May";
                break;
            case 6:
                monthword = "June";
                break;
            case 7:
                monthword = "July";
                break;
            case 8:
                monthword = "August";
                break;
            case 9:
                monthword = "September";
                break;
            case 10:
                monthword = "October";
                break;
            case 11:
                monthword = "November";
                break;
            case 12:
                monthword = "December";
                break;
            default:
                monthword = "Month does not exist. ";
                break;
        }
        if(monthword.equals("Month does not exist. ")){ //If monthword returns default, print error
            System.out.printf("%s", monthword);
            return;
        }
        System.out.printf("The name of the month is %s.", monthword);
    }
}

