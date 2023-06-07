package Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

	protected abstract String getName();
}

class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The lion roars!");
    }

	@Override
	protected String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}

class Tiger extends Animal {
    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The tiger growls!");
    }

	@Override
	protected String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}

class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("The elephant trumpets!");
    }

	@Override
	protected String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}

class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void listAnimals() {
        System.out.println("Animals in the zoo:");
        for (Animal animal : animals) {
            animal.showInfo();
        }
    }

    public void interactWithAnimals() {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("quit")) {
            System.out.print("Enter the name of an animal (or 'quit' to exit): ");
            input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            boolean animalFound = false;

            for (Animal animal : animals) {
                if (animal instanceof Lion && input.equalsIgnoreCase(animal.getName())) {
                    animal.makeSound();
                    animalFound = true;
                    break;
                } else if (animal instanceof Tiger && input.equalsIgnoreCase(animal.getName())) {
                    animal.makeSound();
                    animalFound = true;
                    break;
                } else if (animal instanceof Elephant && input.equalsIgnoreCase(animal.getName())) {
                    animal.makeSound();
                    animalFound = true;
                    break;
                }
            }

            if (!animalFound) {
                System.out.println("Animal not found in the zoo.");
            }
        }
    }
}

public class ProjectQues2 {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Lion lion = new Lion("Simba", 5);
        Tiger tiger = new Tiger("Raja", 3);
        Elephant elephant = new Elephant("Dumbo", 10);

        zoo.addAnimal(lion);
        zoo.addAnimal(tiger);
        zoo.addAnimal(elephant);

        zoo.listAnimals();
        zoo.interactWithAnimals();
    }
}

