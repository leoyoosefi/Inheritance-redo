package se.lexicon;

import se.lexicon.inheritance.Dog;

public class App
{
    public static void main( String[] args )
    {
        Dog fido = new Dog("Fido",30,4,1,20);
        fido.eat();
        System.out.println(fido);

        Dog chico = new Dog();
        chico.setName("Chico");
        chico.setTail(1);
        chico.setLeg(4);
        chico.setWeight(20);
        chico.setTeeth(30);
        chico.eat();

        System.out.println(chico);
    }
}
