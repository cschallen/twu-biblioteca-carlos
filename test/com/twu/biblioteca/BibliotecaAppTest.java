package com.twu.biblioteca;


import org.junit.Test;

import static com.twu.biblioteca.BibliotecaApp.getWelcomeMessage;
import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    @Test
    public void returnTheWelcomeMessage() {
        assertEquals("Welcome!!", getWelcomeMessage());
    }


}
