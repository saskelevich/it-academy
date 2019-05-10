package by.itacademy.java.yaskelevich.classroom.lesson24.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Marshaling {
    public static void main(final String[] args) {
        final JSONObject sampleObject = new JSONObject();
        sampleObject.put("name", "Stackabuser");
        sampleObject.put("age", 35);

        final JSONArray message = new JSONArray();
        message.add("Hey!");
        message.add("What's up!");

        sampleObject.put("message", message);
        System.out.println(sampleObject.toJSONString());
    }
}
