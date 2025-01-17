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
}