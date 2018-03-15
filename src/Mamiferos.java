public interface Mamiferos {

    default void criar(String animal) {
        System.out.println(animal + " es vivíparo.");
    }

}