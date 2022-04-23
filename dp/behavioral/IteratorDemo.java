public class IteratorDemo {

    public static void main(String[] args) {
        String s = "Iterator is behavior ds that lets you traverse a collection without exposing its underlying representation(list, array, stack, tree)";
        System.out.printf("%s%n");
    }

    interface Iterator<T> {
        boolean hasNext();
        T getNext<T>();

    }
}