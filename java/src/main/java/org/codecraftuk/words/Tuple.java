package org.codecraftuk.words;

public class Tuple<A, B> {
    private A first;
    private B second;

    Tuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    A getFirst() {
        return this.first;
    }

    B getSecond() {
        return this.second;
    }
}
