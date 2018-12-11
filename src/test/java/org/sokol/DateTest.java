package org.sokol;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {

    static Date date;

    @BeforeClass
    public static void inicjalizacja() {

        date = new Date(12,6,2017);

    }


    @Test
    public void of() {

        assertEquals(Date.of("12:06:2017",":"),date);

    }
}