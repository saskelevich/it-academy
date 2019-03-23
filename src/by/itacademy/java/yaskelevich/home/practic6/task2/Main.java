package by.itacademy.java.yaskelevich.home.practic6.task2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(final String[] args) {
        final File[] file = File.listRoots();
        buildTree((file[0]), 0);
    }

    private static void buildTree(final File file, final int level) {
        if (level >= 5) {
            return;
        }
        final MyFile myFile = new MyFile(file);
        myFile.setFiles(myFile.getFile().listFiles());
        write(myFile.getFile(), level);
        print(level, myFile.getFile());
        for (final File files : myFile.getFiles()) {
            if (files.isDirectory() && checking(files)) {
                buildTree(files, level + 1);
            }
            if (files.isFile() && checking(files)) {
                write(files, level);
                print(level, files);
            }
        }
    }

    static boolean checking(final File files) {
        return files.canRead() && !files.isHidden();
    }

    private static void print(final int level, final File file) {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        if (file.isDirectory()) {
            System.out.printf("%.15s\n", file.getPath());
        }
        if (file.isFile()) {
            System.out.printf("%.15s : %d\n", file.getName(), file.length());
        }
    }

    private static void write(final File file, final int level) {
        final File filesTree = new File("src" + File.separator + "by" + File.separator + "itacademy"
                + File.separator + "java" + File.separator + "yaskelevich" + File.separator + "home"
                + File.separator + "practic6" + File.separator + "task2" + File.separator
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
            for (int i = 0; i < level; i++) {
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
