package com.ceri.servelet.clientlourd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) throws IOException {
      URL urlToServlet = new URL(
              "http://localhost:8080/servelet-1.0-SNAPSHOT/hello-servelet");
      URLConnection connectionOpened = urlToServlet.openConnection();
        InputStream inputStream = connectionOpened.getInputStream();
        //utilisation d un bufferReader
        BufferedReader bufferedReader = new BufferedReader(new java.io.InputStreamReader(inputStream));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
