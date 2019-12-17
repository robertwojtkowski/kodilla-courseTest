import java.util.*;
import java.lang.*;
import java.io.*;

class Kodilla {


    public static String Litery () { // tworzę metodę statyczną zwracającą "string" o nazwie litery .1.
        String a = ""; // deklaracja zmiennej (a)   .2.
        Random randomGenerator = new Random(); //deklaracja generatora licz pseudolosowych; obiekt Random ktory jest w bibliotece Java.util.3.
        int iloscLiterkia= randomGenerator.nextInt(50); // przypisujemy do zmiennej typu Int losowo wygenerowaną liczbę. Wygenerowliśmy ile tych "a" ma być .4.
        for (int i=0; i <=iloscLiterkia; i++)// tworzymy pętlę która wartośc poczatkową ma 0 i po każdym powtórzeniu rośnie o 1. Zakończy się kiedy dojdzie do wartości ilosci literek
        // .5.
        {
            //System.out.println (i);
            a= a+"a"; //dopisujemy literkę a do zmiennej a ( tworzenie wyrazu).6.
        }
        return a; } //return zwraca nam wartośc metody .7.




    public static ArrayDeque<String> Kolejka() {
        ArrayDeque<String> taskQueue1 = new ArrayDeque<String>();
        for(int i=0; i < 50; i++){
            String nazwa=Litery();
            taskQueue1.offer(nazwa);
            //System.out.println (nazwa);
        }
        return taskQueue1;
    }


    public static void Podzial(ArrayDeque<String> kol){
        String nazwa="";
        ArrayList<String> parz= new ArrayList<String>();
        ArrayList<String> nparz= new ArrayList<String>();

        int a=kol.size();
        for (int i=0;i<a;i++){
            nazwa=kol.poll(); //pobiera z kolejki stringa i wpisuje do wartości roboczej
            //System.out.println (nazwa.length());
            if((nazwa.length()%2)==0){ //jesli reszta z dzielenia dlugości przez 2 będdzie równa 0 to znaczy, że długość parzysta
                parz.add(nazwa);       //jeśl tak to wpisujemy
                //System.out.println (nazwa);
            }
            else{

                nparz.add(nazwa);

            }

        }
        System.out.println(parz.size());
        System.out.println(nparz.size());

    }



    public static void main (String[] args) {

        ArrayDeque<String> kolDoPodzialu =Kolejka();
        Podzial(kolDoPodzialu);

    }
}










