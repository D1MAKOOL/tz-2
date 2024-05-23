package test;

import main.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

public class Main_test {
    private List<Integer> nums;

    @Before
    public void setUp() throws IOException {
        nums = Main.readNumbersFromFile("tests/file_1000.txt");
    }

    @Before
    public void testMax() {
        int max = nums.stream().max(Integer::compare).orElse(Integer.MIN_VALUE);
        Assert.assertEquals(max, Main._max(nums));
    }

    @Test
    public void testMin() {
        int min = nums.stream().min(Integer::compare).orElse(Integer.MAX_VALUE);
        Assert.assertEquals(min, Main._min(nums));
    }

    @Test
    public void testSum() {
        long sum = nums.stream().mapToLong(Integer::longValue).sum();
        Assert.assertEquals(sum, Main._sum(nums));
    }

    @Test
    public void testMult() {
        BigInteger mult = nums.stream()
                .map(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
        BigInteger actualMult = Main._mult(nums);
        Assert.assertEquals(mult, actualMult);
    }
}