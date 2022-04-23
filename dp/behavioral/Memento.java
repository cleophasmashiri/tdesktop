public class Memento {

    public static void main(String[] args) {
        System.out.println("Memento is behavioral ds that let you save and restore the previous state of an object without revealing its internal details");
    }
}


class Originator {

    private String state; 

    public String getState() {
        return state;
    }

    public void setState(String value) {
        state = value;
    }

     public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento value) {
        memento = value;
    }

}

class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}

class CareTaker {

    private List<Mmento> list = new ArrayList<>();

    public void add(Memento m) {
        this.list.add(m);
    }

    public Memento get(int index) {
        return this.list.get(index);
    }
}