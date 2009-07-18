package com.ndpar.gtesting;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AppTest {

    private App app;

    @Before
    public void setUp() {
        app = new App();
    }

    @Test
    public void getNumber_returns_5() {
        assertEquals(5, app.getNumber());
    }
}
