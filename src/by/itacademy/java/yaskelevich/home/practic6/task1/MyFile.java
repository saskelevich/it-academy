package by.itacademy.java.yaskelevich.home.practic6.task1;

import java.io.File;

public class MyFile {
    private final File file;
    private File[] files;

    public MyFile(final File file) {
        this.file = file;
    }

    public File getFile() {
        return new File(file.getPath());
    }

    public File[] getFiles() {
        return files;
    }

    public void setFiles(final File[] files) {
        this.files = files;
    }

}
