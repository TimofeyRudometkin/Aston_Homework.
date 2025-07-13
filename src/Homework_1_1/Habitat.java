package Homework_1_1;

public interface Habitat {
    default void NameTheHabitat() {
        System.out.println("Я живу в воде.");
    }
}
