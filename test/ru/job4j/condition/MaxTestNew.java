package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTestNew {
    @Test
    public void firstMax() {
        int first = 10;
        int second = 5;
        int third = 1;
        int forth = 4;
        int result = Max.max(first, second, third, forth);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void secondMax() {
        int first = 10;
        int second = 50;
        int third = 1;
        int forth = 25;
        int result = Max.max(first, second, third, forth);
        int expected = 50;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void thirdMax() {
        int first = 1;
        int second = 5;
        int third = 100;
        int forth = 500;
        int result = Max.max(first, second, third, forth);
        int expected = 500;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void allEq() {
        int first = 1;
        int second = 1;
        int third = 1;
        int forth = 1;
        int result = Max.max(first, second, third, forth);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void firstEqSecond() {
        int first = 10;
        int second = 10;
        int third = 1;
        int forth = 1;
        int result = Max.max(first, second, third, forth);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void firstEqThirdForth() {
        int first = 100;
        int second = 1;
        int third = 100;
        int forth = 100;
        int result = Max.max(first, second, third, forth);
        int expected = 100;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void secondEqThird() {
        int first = 1;
        int second = 100;
        int third = 100;
        int forth = 1;
        int result = Max.max(first, second, third, forth);
        int expected = 100;
        Assert.assertEquals(expected, result);
    }
}