package org.king.plataformaConsumer4;

import java.util.ArrayList;

public class Library {
    public String[] count(Integer number) {
        String[] lines = new String[number];
        for (int i = 0; i < number; i++) {
            lines[i] = "i = " + i;
        }
        return lines;
    }
    public ArrayList<String> greetAll(String name) {
        org.king.plataforma.Library plataforma = new org.king.plataforma.Library();
        ArrayList<String> result = plataforma.greetAll(name);
        for (int i = 0; i < result.size(); i++) {
            result.set(i, "Via plataforma: " + result.get(i));
        }
        return result;
    }

    public String greetPlataforma(String name) {
        org.king.plataforma.Library plataforma = new org.king.plataforma.Library();
        return plataforma.greet(name);
    }
    public String greet(String name) {
        return "Hello from plataforma-consumer-4, " + name + "!";
    }

    public String greet1(String name) {
        org.king.plataforma.Library plataforma = new org.king.plataforma.Library();
        return "Via plataforma: " + plataforma.greet1(name);
    }
    public String greet2(String name) {
        org.king.plataforma.Library plataforma = new org.king.plataforma.Library();
        return "Via plataforma: " + plataforma.greet2(name);    }
    public String greet3(String name) {
        org.king.plataforma.Library plataforma = new org.king.plataforma.Library();
        return "Via plataforma: " + plataforma.greet3(name);    }
    public String greet4(String name) {
        org.king.plataforma.Library plataforma = new org.king.plataforma.Library();
        return "Via plataforma: " + plataforma.greet4(name);    }
    public String greet5(String name) {
        org.king.plataforma.Library plataforma = new org.king.plataforma.Library();
        return "Via plataforma: " + plataforma.greet5(name);    }
}