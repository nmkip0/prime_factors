package com.nmkip.primefactorskata;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> of(int n) {

        final List<Integer> factors = new ArrayList<>();
        if(n > 1) {
            factors.add(n);
        }

        return factors;
    }

}
