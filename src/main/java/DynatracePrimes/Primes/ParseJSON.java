package DynatracePrimes.Primes;

import com.google.gson.Gson;

public class ParseJSON {


    public static Data parsing(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, Data.class);
    }

}
