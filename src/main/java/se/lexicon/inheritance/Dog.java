package se.lexicon.inheritance;

public class Dog extends Animal {

    private int leg;
    private int tail;
    private int teeth;


    public Dog(String name, double weight, int leg, int tail, int teeth) {
        super(name, weight);
        this.leg = leg;
        this.tail = tail;
        this.teeth = teeth;
    }

    public Dog() {
    }

    @Override
    public void eat(){
        System.out.println(getName() + " chews on a bone!");
    }


    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "leg=" + leg +
                ", tail=" + tail +
                ", teeth=" + teeth +
                '}';
    }
}
