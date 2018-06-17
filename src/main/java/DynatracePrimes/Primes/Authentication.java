package DynatracePrimes.Primes;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

public class Authentication {

    String login = "candidate";
    String password = "abc123";
    String strToEncode = login+":"+password;
    StringBuilder json = new StringBuilder();

    public void connect() {
        try {
            URL url = new URL("http://dt-gwitczak-recruitment.westeurope.cloudapp.azure.com:8080/rest/task");
            String encoding = Base64.getEncoder().encodeToString(strToEncode.getBytes());
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setDoOutput(true);
            connection.setRequestProperty("Authorization", "Basic " + encoding);
            InputStream content = connection.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(content));
            String line;
            while ((line = in.readLine()) != null) {
                json.append(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getJson() {
        return json.toString();
    }
}
