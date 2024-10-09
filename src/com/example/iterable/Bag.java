package com.example.iterable;

import java.util.*;
import java.util.function.*;

public class Bag<T> implements Container<T> {
    private ArrayList<T> items;

    public Bag() {
        this.items = new ArrayList<>();
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        items.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return items.spliterator();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public void add(T item) {
        items.add(item);
    }
}
