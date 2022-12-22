package codeChallenges.animalShelter;

import dataStructures.Stack.*;

public class AnimalShelter {
    Stack temp;
    Stack animalQueue;

    public AnimalShelter() {
        temp = new Stack();
        animalQueue = new Stack();
    }

    public void enqueue(String animalType) {
        while(!this.animalQueue.isEmpty()) {
            String animal = this.animalQueue.pop();
            temp.push(animal);
        }
        animalQueue.push(animalType);
        reset();
    }

    public String dequeue(String desiredAnimal) {
        while(!this.animalQueue.isEmpty()) {
            String animal = animalQueue.pop();
            if(animal == desiredAnimal) {
                reset();
                return animal;
            } else {
                this.temp.push(animal);
            }
        }
        reset();
        // if desired animal is not in queue, return the next animal in line
        return this.animalQueue.pop();
    }

    public String dequeue() {
        return this.animalQueue.pop();
    }

    // puts all the temp animals back onto the animal queue in correct order
    private void reset() {
        while(!this.temp.isEmpty()) {
            String animal = this.temp.pop();
            this.animalQueue.push(animal);
        }
    }

    @Override
    public String toString() {
        String str = "";
        while(!animalQueue.isEmpty()) {
            String animal = this.animalQueue.pop();
            str = str + animal + " ";
            this.temp.push(animal);
        }
        reset();
        return str;
    }
}
