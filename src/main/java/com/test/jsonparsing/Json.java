package com.test.jsonparsing;

import java.io.*;

public class Json {
    public static String parseJsonFile(String srcFile) {

        String jsonString = "";

        File jsonFile = new File(srcFile);
        FileReader fr = null;
        try {
            fr = new FileReader(jsonFile);
            BufferedReader reader = new BufferedReader(fr);
            String inputLine = null;
            try {
                inputLine = reader.readLine();
                while (inputLine != null) {
                    jsonString += inputLine;
                    inputLine = reader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return jsonString;
    }

}
