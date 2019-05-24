package by.itacademy.java.yaskelevich.classroom.lesson27.filters;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String password;

    private final List<String> allowedResource = new ArrayList<String>();

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public List<String> getAllowedResource() {
        return allowedResource;
    }

}
