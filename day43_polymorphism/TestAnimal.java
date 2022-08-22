package day43_polymorphism;

public class TestAnimal {

	public static void main(String[] args) {

			
		Animal animal = new Animal(); 
		
		Animal              dog =            new Dog(); //polymorphism
		//superClass name   referenceName			//object type subClass name
		
		Animal bird = new Bird();
		
		animal = new Cat();
		

	}

}

class Animal{}

class Dog extends Animal{}

class Bird extends Animal{}

class Cat extends Animal{}
