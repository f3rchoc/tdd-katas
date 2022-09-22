package com.cgm.tdd.katas;

import lombok.NoArgsConstructor;

import java.util.function.BiPredicate;

@NoArgsConstructor
public class FizzBuzz {

    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final String FIZZ_BUZZ = FIZZ+BUZZ;

    public String execute (final int max) {

        BiPredicate<Integer, Integer> isDivisibleBy = (Integer divider, Integer n) -> n % divider == 0;

        if (Boolean.TRUE.equals(isDivisibleBy.test(35, max))) {
            return FIZZ_BUZZ;
        }

        if (Boolean.TRUE.equals(isDivisibleBy.test(5, max))) {
            return FIZZ;
        }

        if (Boolean.TRUE.equals(isDivisibleBy.test(7, max))) {
            return BUZZ;
        }

        return String.valueOf(max);
    }

}
