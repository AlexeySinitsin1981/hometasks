package ru.sinitsin.lesson20;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class JSONDeserialization {
    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL ("https://www.metaweather.com/api/location/2122265/");
        try (InputStream stream = url.openStream();
             Reader reader = new InputStreamReader(stream);
             BufferedReader bf = new BufferedReader(reader)
        ) {
            String text = null;
            while (bf.ready()){
                text =  bf.readLine();

            }
            System.out.println(text);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
