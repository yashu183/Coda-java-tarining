package day13_assignment;

public class Q7 {
	public static void main(String[] args) {
		
	}
}

interface Hungry<E> { void munch(E x); } 
interface Carnivore<E extends Animal> extends Hungry<E> {}
// a doent work ... interface Carnivore<E extends Plant> extends Hungry<E> {}

//interface Herbivore<E extends Plant> extends Hungry<E> {}
// b works ... interface Herbivore<E extends Animal> extends Hungry<E> {}
interface Herbivore<E extends Animal> extends Hungry<E> {}
abstract class Plant {} 
class Grass extends Plant {} 
abstract class Animal {} 
class Sheep extends Animal implements Herbivore<Sheep> { 
public void munch(Sheep x) {} 
}

//class Sheep extends Animal implements Herbivore<Plant> { public void 
//munch(Grass x) {} } c  doesnt work...

//class Sheep extends Plant implements Carnivore<Wolf> { public void 
//munch(Wolf x) {} }  d doesnt work... 

class Wolf extends Animal implements Carnivore<Sheep> { 
public void munch(Sheep x) {} 
}

//class Wolf extends Animal implements Herbivore<Grass> { public void 
//munch(Grass x) {} }