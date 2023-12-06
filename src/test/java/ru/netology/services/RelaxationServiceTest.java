package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelaxationServiceTest {
    @Test
    public void testCalculate1() {
        RelaxationService service = new RelaxationService();
        int actual = service.calculate(10_000, 3000, 20_000);

        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }



}