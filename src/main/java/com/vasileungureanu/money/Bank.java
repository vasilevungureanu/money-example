package com.vasileungureanu.money;

import java.util.Hashtable;

public class Bank {
    private final Hashtable rates = new Hashtable();

    private static class Pair {
        private final String from;
        private final String to;

        Pair(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return from.equals(pair.from) && to.equals(pair.to);
        }

        public int hashCode() {
            return 0;
        }
    }

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    int rate(String from, String to) {
        if (from.equals(to)) return 1;

        Integer rate = (Integer) rates.get(new Pair(from, to));
        return rate;
    }

    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }
}