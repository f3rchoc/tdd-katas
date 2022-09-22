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

    @Test
    void should_return_fizz_if_receive_five() {

        final var max = 5;
        var result = this.fizzBuzz.execute(max);
        assertEquals(FizzBuzz.FIZZ, result);

    }

    @Test
    void should_return_buzz_if_receive_seven() {

        final var max = 7;
        var result = this.fizzBuzz.execute(max);
        assertEquals(FizzBuzz.BUZZ, result);

    }

    @Test
    void should_return_fizzbuzz_if_receive_thirty_five() {

        final var max = 35;
        var result = this.fizzBuzz.execute(max);
        assertEquals(FizzBuzz.FIZZ_BUZZ, result);

    }

    @Test
    void should_return_fizz_if_receive_any_number_divisible_by_five () {

        final var max = 15;
        var result = this.fizzBuzz.execute(max);
        assertEquals(FizzBuzz.FIZZ, result);

    }

    @Test
    void should_return_fizz_if_receive_any_number_divisible_by_seven() {

        final var max = 21;
        var result = this.fizzBuzz.execute(max);
        assertEquals(FizzBuzz.BUZZ, result);

    }

    @Test
    void should_return_fizzbuzz_if_receive_any_number_divisible_by_fifteen() {
        final var max = 105;
        var result = this.fizzBuzz.execute(max);
        assertEquals(FizzBuzz.FIZZ_BUZZ, result);
    }

    @Test
    void should_return_the_same_number_that_receives() {

        final var max = 9;
        var result = this.fizzBuzz.execute(max);
        assertEquals(String.valueOf(max), result);

    }

}