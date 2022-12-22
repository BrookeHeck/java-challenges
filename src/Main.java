import codeChallenges.*;
import codeChallenges.animalShelter.AnimalShelter;

public class Main {
    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();

        animalShelter.enqueue("dog");
        animalShelter.enqueue("cat");
        animalShelter.enqueue("dog");
        System.out.println(animalShelter);

        String desiredAnimal = animalShelter.dequeue("cat");
        System.out.println(desiredAnimal);
        System.out.println(animalShelter);
    }
}