package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'between range', 200, 300, 3",
            "'below sqr numbers', -100, 99, 0",
            "'over sqr numbers', 9802, 10000, 0",
            "'swapped borders', 300, 200, 0",
            "'equal borders', 100, 100, 1",
            "'lower border', 99, 101, 1",
            "'upper border', 9800, 9802, 1",
            "'all in range', 100, 9801, 90"
    })
    void shouldReturnSqrtAmount(String testName, int start, int finish, int expected) {
        SQRService service = new SQRService();

        int actual = service.sqrAmount(start, finish);
        assertEquals(expected, actual);
    }
}