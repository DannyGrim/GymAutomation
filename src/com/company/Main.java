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
            Task10AM task = new Task10AM();     //from Task class
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy hh:mm:ss");
            Date date = sdf.parse("22-02-2021 16:34:00");
            timer.schedule(task,date);




        }

    }





