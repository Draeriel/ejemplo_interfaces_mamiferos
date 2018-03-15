public class Ornitorrinco implements Mamiferos{

    private String animal = "Ornitorrinco";

    public Ornitorrinco() {

    }

    public String getAnimal() {
        return animal;
    }

    @Override
    public void criar(String animal) {
        System.out.println(animal + " es ovíparo.");
    }
}