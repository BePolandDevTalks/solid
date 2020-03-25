package com.betse.devtalks.solid;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

class Journal {
    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text) {
        entries.add("" + (++count) + " " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    public void save(String filename) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(filename)) {
            out.println(toString());
        }
    }

    public void load(String filename) {}
    public void load(URL url) {}
}

class Persistence {
    void saveToFile(Journal journal, String filename, boolean overwrite) throws FileNotFoundException {
        if (overwrite || new File(filename).exists()) {
            try (PrintStream out = new PrintStream(filename)) {
                out.println(journal.toString());
            }
        }
    }

    public Journal load() {
        return new Journal();
    }
}

class Demo {
    public static void main(String[] args) throws IOException {
        Journal journal = new Journal();
        journal.addEntry("I cried today");
        journal.addEntry("I ate a bug");
        System.out.println(journal);

        Persistence p = new Persistence();
        String filename = "E:\\praca\\BePoland\\devtalk\\SOLID_design_principles\\code_examples\\journal.txt";
        p.saveToFile(journal, filename, true);

        Runtime.getRuntime().exec("notepad.exe " + filename);
    }
}
