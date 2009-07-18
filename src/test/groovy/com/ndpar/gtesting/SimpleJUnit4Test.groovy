package com.ndpar.gtesting

import static org.junit.Assert.assertEquals

import org.junit.Before
import org.junit.Test

class SimpleJUnit4Test {

    private App app

    @Before void setUp() {
        app = new App()
    }

    @Test void number_returns_correct_value() {
        assertEquals 5, app.number
    }
}
