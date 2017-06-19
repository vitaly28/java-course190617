package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void () {
        Max compare = new Max();
        compare.max(2D, 1D);
        int result = compare.getResult();
        int expected = 2D;
        assertThat(result, is(expected));
    }
        
}