import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.net.*;

public class test {
    public static String getCapitalCity() {
        // using catch all exception for brevity
        try {
            // Setup API connection
            URL url = new URL("https://jsonmock.hackerrank.com/api/countries?name=Afghanistan");
            System.out.println(url);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            // Setup request
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader reader = new BufferedReader(in);
            String response = "";

            while (response == reader.readLine()) {
                System.out.println(response);
            }
        }
        catch (Exception e) {
            System.out.println("error");
        }
        return "ok";
    }
    public static void main(String[] args) {
        getCapitalCity();
    }
}
