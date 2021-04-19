package fasttrackIt.temaCurs10.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Flowers {
    private final List<String> bouquetOfFlowers = new ArrayList<>(List.of(
            "rose",
            "violet",
            "lily",
            "orchid"));


    public List<String> getBouquetOfFlowers() {
        return bouquetOfFlowers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flowers flowers = (Flowers) o;
        return Objects.equals(bouquetOfFlowers, flowers.bouquetOfFlowers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bouquetOfFlowers);
    }

    @Override
    public String toString() {
        return "Flowers{" +
                "bouquetOfFlowers=" + bouquetOfFlowers +
                '}';
    }

    public List<String> getAll() {
        return bouquetOfFlowers;
    }

    public void addFlower(String flw) {
        bouquetOfFlowers.add(flw);
    }

    public void removeFlw(int flw) {
        String theItem = bouquetOfFlowers.get(flw);
        bouquetOfFlowers.remove(flw);
    }

}
