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

        /*
        TASKS TO COMPLETE

        Add time scheduling
        Press different register buttons based on the time according to your schedule
        batch file ?
        running on windows pc ?

        if failed (did not authenticate the 2 factor), try again with a lesser time interval

        */
            Timer timer = new Timer();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy hh:mm:ss");

            Task task = new Task();     //Task 7PM
            Date dateMonday = sdf.parse("28-02-2021 19:05:00");     // Sunday February 28th at 19:05 for Mondays March 1 7PM
            timer.schedule(task,dateMonday);

            Task1PM task2 = new Task1PM();     //Task 7PM
            Date dateTuesday = sdf.parse("01-03-2021 13:05:00");     // Monday March 1st at 13:05 for Tuesdays March 2nd 1PM
            timer.schedule(task2,dateTuesday);

            Task task3 = new Task();     //Task 7PM
            Date dateWednesday = sdf.parse("02-03-2021 19:05:00");     // Tuesday March 2nd at 19:05 for Wednesdays March 3rd
            timer.schedule(task,dateMonday);

            Task1PM task4 = new Task1PM();     //Task 7PM
            Date dateThursday = sdf.parse("01-03-2021 13:05:00");     // Monday March1sth at 13:05 for Tuesdays March 2nd 1PM
            timer.schedule(task2,dateTuesday);

            Task task5 = new Task();     //Task 7PM
            Date dateFriday = sdf.parse("28-02-2021 19:05:00");     // Sunday February 28th at 19:05 for Mondays March 1 7PM
            timer.schedule(task,dateMonday);










        }

    }





