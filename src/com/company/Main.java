package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Theatre theatre = new Theatre("My Theatre", 4,10);
        theatre.getSeats();

        if(theatre.reserveSeat("B05")){
            System.out.println("Please pay to confirm the reservation");
        }else {
            System.out.println("The chosen seat is busy");
        }
        if(theatre.reserveSeat("B05")){
            System.out.println("Please pay to confirm the reservation");
        }else {
            System.out.println("The chosen seat is busy");
        }
    }
}
