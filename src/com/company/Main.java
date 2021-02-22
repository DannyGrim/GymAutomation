package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Main extends TimerTask {
    public void run(){
        System.out.println("Timer Task executed :: " + new Date() + "::" + Thread.currentThread().getName());
    }
    public static void main(String[] args) throws ParseException {


        /*ALL OF THE ACTIONS BELOW CAN BE CREATED USING A FOR LOOP FOR FUTURE IF YOU WANT TO RUN THE SYSTEM FOR X DAYS.
        THIS IS FOR ONE WEEK (5 GYM DAYS)*/

        Timer timer = new Timer();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy hh:mm:ss");

            Task task = new Task();     //Task 7PM
            Date dateMonday = sdf.parse("28-02-2021 19:05:00");     // Sunday February 28th at 19:05 for Mondays March 1 7PM
            timer.schedule(task,dateMonday);

            Task1PM task2 = new Task1PM();     //Task 7PM
            Date dateTuesday = sdf.parse("01-03-2021 13:05:00");     // Monday March 1st at 13:05 for Tuesdays March 2nd 1PM
            timer.schedule(task2,dateTuesday);

            Task task3 = new Task();     //Task 7PM
            Date dateWednesday = sdf.parse("02-03-2021 19:05:00");     // Tuesday March 2nd at 19:05 for Wednesdays March 3rd 7PM
            timer.schedule(task3,dateWednesday);

            Task4PM task4 = new Task4PM();     //Task 4PM
            Date dateThursday = sdf.parse("03-03-2021 16:05:00");     // Wednesday March 5th at 16:05 for Thursday March 2nd 4PM
            timer.schedule(task4,dateThursday);

            Task1PM task5 = new Task1PM();     //Task 1PM
            Date dateFriday = sdf.parse("04-02-2021 13:05:00");     // Thursday March 4th at 13:05 for Friday March 1 1PM
            timer.schedule(task5,dateFriday);










        }

    }





