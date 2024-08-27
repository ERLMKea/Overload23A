package org.example;

import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static void out(String s) {
        System.out.println(s);
    }

    private static void out(int i) {
        System.out.println(i);
    }

    private static void out(char c) {
        System.out.println(c);
    }

    private static void out(Integer itg) {
        out("jeg er integer");
        System.out.println(itg);
    }

    private static void out(Class aClass) {
        out(aClass.getName());
    }


    public static void main(String[] args) {
        out("hej");
        out(5);
        var obj = Integer.valueOf("51");
        out(obj);
        Integer ii = 17;
        out(ii);

        int iff = Integer.parseInt("ff", 16);
        out(iff);

        try {
            out(Integer.parseInt("45.4"));
        } catch (Exception e) {
            //out(e.getMessage());
            //out(e.getClass());
            out(e.toString());
        }

        out('a');
        out('b');
        out('£');
        out('ض');

        char cc = (char)163;

        out((int)'帝');

        for (int i=24093; i < 24104; i++) {
            out((char) i);
        }

        Set<Character> z = new HashSet<>();
        //c.add('a');
        //System.out.println(chars);
        char c = 'a';
        while (z.add(c)) {
            c++;
        }
        out(z.size());
        out("hej");
    }


}
