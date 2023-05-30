package org.example;

import java.util.*;

public class Randoms implements Iterable<Integer> {

    protected Random random = new Random();
    private final int min;
    private final int max;

    protected Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator();
    }

    private class RandomsIterator implements Iterator<Integer> {
        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return random.nextInt(min, max + 1);
        }
    }
}