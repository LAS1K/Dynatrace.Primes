package DynatracePrimes.Primes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrimeAlgorithm {

    public static String prime(Integer [] data){
        StringBuilder sortedPrimes = new StringBuilder();

        Arrays.sort(data);


        Boolean [] primes = new Boolean[data[data.length-1]];
        for(int i = 0; i < primes.length; i++){
            primes[i] = true;
        }


        for (int i = 2; i < Math.floor(Math.sqrt(primes.length)); i++){
            if (primes[i] == true){
                for(int j = i*i; j < primes.length; j+=i){
                    primes[j]=false;
                }
            }
        }

        Set <Integer> setData = new HashSet<>();
        setData.addAll(Arrays.asList(data));


        for(int i = 0; i < primes.length; i++){
            if(primes[i] == true){
                if(!setData.contains(i)){
                    primes[i]=false;
                }
            }
        }

        for(int i = 0; i < primes.length; i++){
            if(primes[i] == true){
                sortedPrimes.append(i+", ");
            }
        }


    return sortedPrimes.toString();
    }
}
