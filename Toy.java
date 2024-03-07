public class Toy implements Comparable<Toy> {
    private int id;
    private String name;
    private int frequency;

    public Toy(int id, String name, int frequency) {
        this.id = id;                       // id игрушки
        this.name = name;                   // название игрушки
        this.frequency = frequency;         // частота выпадение игрушки
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public int compareTo(Toy other) {
        return Integer.compare(other.frequency, this.frequency);
    }
}