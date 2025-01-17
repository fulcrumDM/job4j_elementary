package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenStart0Finish3Then6() {
        int inputStart = 0;
        int inputEnd = 3;
        int expected = 6;
        int output = Counter.sum(inputStart, inputEnd);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartMinus3Finish0Then0() {
        int inputStart = 5;
        int inputEnd = 3;
        int expected = 0;
        int output = Counter.sum(inputStart, inputEnd);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneTo4Then6() {
        int start = 1;
        int finish = 4;
        int result = Counter.sumByEven(start, finish);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus2To2Then0() {
        int start = -2;
        int finish = 2;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}