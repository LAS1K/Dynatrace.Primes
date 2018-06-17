package DynatracePrimes.Primes;


public class Data {

    String id;
    Integer size;
    Integer [] data;

    public Data(String id, Integer size, Integer[] data) {
        this.id = id;
        this.size = size;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public Integer getSize() {
        return size;
    }

    public Integer[] getData() {
        return data;
    }

}
