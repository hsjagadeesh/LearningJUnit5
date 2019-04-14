package com.learning.junitjupiter;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeAll
    public void initBeforeAll() {
        mathUtils = new MathUtils();
    }

    @BeforeEach
    public void initBeforeEach() {
        mathUtils = new MathUtils();
    }

    @AfterEach
    @AfterAll

    @Test
    void add() {
        int result = mathUtils.add(1, 2);
        assertTrue(result == 3);
    }

    @Test
    void subtract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }

    @Test
    void computeCircleArea() {
    }
}