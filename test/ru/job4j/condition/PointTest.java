package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to34then5() {
        int expected = 5;
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to22then282() {
        double expected = 2.82;
        Point a = new Point(0, 0);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to024then447() {
        double expected = 4.47;
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 2, 4);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to002then2() {
        int expected = 2;
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when023to327then2() {
        int expected = 5;
        Point a = new Point(0, 2, 3);
        Point b = new Point(3, 2, 7);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}