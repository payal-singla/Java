"Write java code that takes two arguments, a month and a year and display the number of days in that month. E.g Feb 2020 = 29 days, Feb 2021 =28 days.
"Use the switch statement count the days in a month. E.g Number of days are 31 for Jan, March etc 30 for April, June etc.
"Feb is more complicated, so, use 4 and 400 to divide the year evenly and not evenly divided by 100.

import java.util.Scanner;


public class days_in_month {
           public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        int day = 0; 
        String MonthName = " ";

        System.out.print("Month number: ");
        int month = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        switch (month) {
            case 1 : {
                MonthName = "January";
                day = 31;
                break;
             }
            case 2 : {
                MonthName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    day = 29;
                    
                } else {
                    day = 28;
                   
                }
                break;
             }
            case 3 : {
                MonthName = "March";
                day = 31;
                break;
             }
            case 4 : {
                MonthName = "April";
                day = 30;
                break;
             }
            case 5 : {
                MonthName = "May";
                day = 31;
                break;
             }
            case 6 : {
                MonthName = "June";
                day = 30;
                break;
             }
            case 7 : {
                MonthName = "July";
                day = 31;
                break;
             }
            case 8 : {
                MonthName = "August";
                day = 31;
                break;
             }
            case 9 : {
                MonthName = "September";
                day = 30;
                break;
             }
            case 10 : {
                MonthName = "October";
                day = 31;
                break;
             }
            case 11 : {
                MonthName = "November";
                day = 30;
                break;
             }
            case 12 : {
                MonthName = "December";
                day = 31;
                break;
             }
        }
        System.out.print(MonthName + " " + year + " = " + day + " days\n");
    }
    
    
}
