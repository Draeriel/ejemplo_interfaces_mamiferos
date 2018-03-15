public class Main {

    public static void main(String[] args) {

        Perro perro = new Perro();
        perro.criar(perro.getAnimal());

        Koala koala = new Koala();
        koala.criar(koala.getAnimal());

        Ornitorrinco ornitorrinco = new Ornitorrinco();
        ornitorrinco.criar(ornitorrinco.getAnimal());
    }
}