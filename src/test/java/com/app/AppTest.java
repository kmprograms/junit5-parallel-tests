package com.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.List;

@Execution(ExecutionMode.CONCURRENT)
public class AppTest 
{
    @Test
    public void test1()
    {
        List<String> names = List.of("ADAM", "EWA");
        List<String> expectedNames = List.of("ADAM", "EWA");
        System.out.println("TEST1: " + Thread.currentThread().getName());
        Assertions.assertLinesMatch(expectedNames, names, "TEST 1 FAILED");
    }

    @Test
    public void test2()
    {
        List<String> cities = List.of("WARSZAWA", "KRAKOW");
        List<String> expectedCities = List.of("WARSZAWA", "KRAKOW");
        System.out.println("TEST2: " + Thread.currentThread().getName());
        Assertions.assertLinesMatch(expectedCities, cities, "TEST 2 FAILED");
    }
}
