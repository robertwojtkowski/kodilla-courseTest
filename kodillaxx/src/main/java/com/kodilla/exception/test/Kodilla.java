package com.kodilla.exception.test;

import java.time.LocalTime;
import java.util.*;
import java.lang.*;
import java.io.*;

class Clock{
    Random randomGenerator = new Random();

    LocalTime time = LocalTime.of(1,2);

    public void sun(){

        time=time.plusHours(1);
        time=time.plusMinutes(1);
    }

    public LocalTime getTime(){
        return time;
    }



}



class Kodilla {
    public static void main (String[] args) {

        LinkedList<Clock> zegary = new LinkedList<Clock>();

        zegary.add(new Clock());
        zegary.add(new Clock());
        zegary.add(new Clock());
        zegary.add(new Clock());
        zegary.add(new Clock());
        zegary.add(new Clock());
        zegary.add(new Clock());
        zegary.add(new Clock());

        for (Clock zeg:zegary){
            System.out.println("Przed przesunieciem " + zeg.getTime().getHour() +":"+zeg.getTime().getMinute());
            zeg.sun();
            System.out.println("Po przesunieciu " + zeg.getTime().getHour() +":"+zeg.getTime().getMinute());


        }
    }
}