package com.cgm.tdd.katas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void should_return_one_if_receive_one () {

        final var max = 1;
        var result = this.fizzBuzz.execute(max);
        assertEquals(String.valueOf(max), result);

    }

}