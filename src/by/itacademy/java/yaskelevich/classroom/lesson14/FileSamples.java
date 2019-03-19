package by.itacademy.java.yaskelevich.classroom.lesson14;

import java.io.File;

public class FileSamples {
    public static void main(final String[] args) {
        showSamples(new File("C:\\Windows\\winhlp32.exe"));
        System.out.println("-----------------------");
        showSamples(new File("C:\\Windows"));
    }

    protected static void showSamples(final File file) {
        System.out.println("File name: " + file.getName());
        System.out.println("Path: " + file.getPath());
        System.out.println("Absolute path:: " + file.getAbsolutePath());
        System.out.println("Parent: " + file.getParent());
        System.out.println("Exists: " + file.exists());
        if (file.exists()) {
            System.out.println("Is writeable: " + file.canWrite());
            System.out.println("Is readable: " + file.canRead());
            System.out.println("Is a directory: " + file.isDirectory());
            System.out.println("File size in bytes: " + file.length());
        }
    }
}

/**
 * File name: winhlp32.exe
Path: C:\Windows\winhlp32.exe
Absolute path:: C:\Windows\winhlp32.exe
Parent: C:\Windows
Exists: true
Is writeable: true
Is readable: true
Is a directory: false
File size in bytes: 11776
-----------------------
File name: Windows
Path: C:\Windows
Absolute path:: C:\Windows
Parent: C:\
Exists: true
Is writeable: true
Is readable: true
Is a directory: true
File size in bytes: 16384

 */
 
