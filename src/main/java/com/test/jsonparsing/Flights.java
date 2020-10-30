package com.test.jsonparsing;

import java.util.List;

public class Flights {
    List<FlightDetails> flights;
}

    class FlightDetails {

        private String fromCity;
        private String toCity;
        private int price;

        public String getFromCity() {
            return fromCity;
        }

        public void setFromCity(String fromCity) {
            this.fromCity = fromCity;
        }

        public String getToCity() {
            return toCity;
        }

        public void setToCity(String toCity) {
            this.toCity = toCity;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

    }
