package ru.job4j.max;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class MaxTest {
@Test
    public void MaxOfTwoNunber(){
    Max dog = new Max();
    int number1 = 1;
    int number2 = 2;
    int expected = 2;
    int result = dog.max(number1,number2);
assertThat(result,is(expected));
    }
}