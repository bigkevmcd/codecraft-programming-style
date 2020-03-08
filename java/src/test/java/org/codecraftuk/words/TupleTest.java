package org.codecraftuk.words;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TupleTest {
    @Test
    void elements() {
        Tuple<String, Integer> word = new Tuple<>("word", 20);

        assert(word.getFirst()).equals("word");
        assert(word.getSecond()).equals("word");

    }
}