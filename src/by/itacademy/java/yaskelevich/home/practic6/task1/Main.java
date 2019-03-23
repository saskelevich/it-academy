package by.itacademy.java.yaskelevich.home.practic6.task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(final String[] args) {
        rekursia(new File("/"), 0);
    }

    private static void rekursia(final File file, final int lvl) {
        if (lvl > 5) {
            return;
        }
        final MyFile myFile = new MyFile(file);
        myFile.setFiles(myFile.getFile().listFiles());
        write(myFile.getFile(), lvl);
        print(lvl, myFile.getFile());
        for (final File files : myFile.getFiles()) {
            if (files.isDirectory() && checking(files)) {
                rekursia(files, lvl + 1);
            }
            if (files.isFile() && checking(files)) {
                write(files, lvl);
                print(lvl, files);
            }
        }
    }

    static boolean checking(final File files) {
        return files.canRead() && !files.isHidden();
    }

    private static void print(final int lvl, final File file) {
        for (int i = 0; i < lvl; i++) {
            System.out.print("-");
        }
        if (file.isDirectory()) {
            System.out.printf("%s\n", file.getPath());
        }
        if (file.isFile()) {
            System.out.printf("%s : %d\n", file.getPath(), file.length());
        }
    }

    /**
     * does not fit into the terminal
     */
    private static void write(final File file, final int lvl) {
        final File filesTree = new File("src" + File.separator + "by" + File.separator + "itacademy"
                + File.separator + "java" + File.separator + "yaskelevich" + File.separator + "home"
                + File.separator + "practic6" + File.separator + "task1" + File.separator
                + "filesTree.txt");
        if (!filesTree.exists()) {
            try {
                filesTree.createNewFile();
            } catch (final IOException exc) {
                System.err.println(exc + "File not created");
            }
        }
        try (PrintWriter out = new PrintWriter(
                new BufferedWriter(new FileWriter(filesTree, true)))) {
            for (int i = 0; i < lvl; i++) {
                out.print("-");
            }
            if (file.isDirectory()) {
                out.print(file.getPath() + "\n");
            }
            if (file.isFile()) {
                out.printf("%s: %d\n", file.getPath(), file.length());
            }
        } catch (final IOException exc) {
            System.err.println(exc + "File not recorded");
        }

    }
}
