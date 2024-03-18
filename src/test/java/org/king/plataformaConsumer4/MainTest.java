package org.king.plataformaConsumer4;

import org.junit.jupiter.api.Test;
import org.king.plataformaConsumer4.Library;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void testCount() {
        Library library = new Library();
        String[] result = library.count(10);
        assertEquals(10, result.length);
        for (int i = 0; i < 10; i++) {
            assertEquals("i = " + i, result[i]);
        }
    }
    @Test
    void testGreetAll() {
        Library library = new Library();
        ArrayList<String> result = library.greetAll("plataforma-consumer-4");
        assertEquals(9,result.size());
        assertEquals("Via plataforma: Hello from plataforma, plataforma-consumer-4!", result.get(0));
        assertEquals("Via plataforma: Hello, plataforma-consumer-4!", result.get(1));
        assertEquals("Via plataforma: Greetings, plataforma-consumer-4!", result.get(2));
        assertEquals("Via plataforma: Salutations, plataforma-consumer-4!", result.get(3));
        assertEquals("Via plataforma: Hej, plataforma-consumer-4!", result.get(4));
        assertEquals("Via plataforma: Kon'nichiwa, plataforma-consumer-4!", result.get(5));
        assertEquals("Salama, plataforma-consumer-4!", result.get(6));
        assertEquals("Përshëndetje from plataforma-consumer-4, plataforma-consumer-4!", result.get(7));
        assertEquals("Witam from plataforma-consumer-2, plataforma-consumer-4!", result.get(8));
    }
    @Test
    void testGreet() {
        Library library = new Library();
        String result = library.greet("plataforma-consumer-4");
        assertEquals("Përshëndetje from plataforma-consumer-4, plataforma-consumer-4!", result);
    }
    @Test
    void testGreet1() {
        Library library = new Library();
        String result = library.greet1("plataforma-consumer-4");
        assertEquals("Via plataforma: Hello, plataforma-consumer-4!", result);
    }
    @Test
    void testGreet2() {
        Library library = new Library();
        String result = library.greet2("plataforma-consumer-4");
        assertEquals("Via plataforma: Greetings, plataforma-consumer-4!", result);    }
    @Test
    void testGreet3() {
        Library library = new Library();
        String result = library.greet3("plataforma-consumer-4");
        assertEquals("Via plataforma: Salutations, plataforma-consumer-4!", result);    }
    @Test
    void testGreet4() {
        Library library = new Library();
        String result = library.greet4("plataforma-consumer-4");
        assertEquals("Via plataforma: Hej, plataforma-consumer-4!", result);    }
    @Test
    void testGreet5() {
        Library library = new Library();
        String result = library.greet5("plataforma-consumer-4");
        assertEquals("Via plataforma: Kon'nichiwa, plataforma-consumer-4!", result);
    }
    @Test
    void testGreet6() {
        Library library = new Library();
        String result = library.greet6("plataforma-consumer-4");
        assertEquals("Salama, plataforma-consumer-4!", result);
    }
}
