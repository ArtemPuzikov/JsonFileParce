package com.test.jsonparsing;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        Gson gson = new Gson();
        Flights flights = gson.fromJson(Json.parseJsonFile("flights.json"), Flights.class);
        int minPrice = 0;
        double averagePrice = 0.0;
        int maxPrice = 0;
        int numberOfFlights = 0;

        for (FlightDetails flight : flights.flights) {
            if (flight.getFromCity().equals("Москва") && flight.getToCity().equals("Хабаровск")) {
                if (flight.getPrice() < minPrice || minPrice == 0) {
                    minPrice = flight.getPrice();
                } else if (flight.getPrice() > maxPrice) {
                    maxPrice = flight.getPrice();
                }

                averagePrice += flight.getPrice();
                numberOfFlights++;
            }
        }

        averagePrice = averagePrice / numberOfFlights;

        System.out.println("Минимальная стоимость перелета: " + minPrice);
        System.out.println("Средняя стоимость перелета: " + averagePrice);
        System.out.println("Максимальная стоимость перелета: " + maxPrice);

    }
}
