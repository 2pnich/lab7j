import java.util.Comparator;

class Comporator implements Comparator<Basket> {
    @Override
    public int compare(Basket o1, Basket o2) {
        return Double.compare(o1.sum(), o2.sum());
    }
}
