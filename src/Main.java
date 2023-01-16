public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setName("farel");
        fish.setAge(2);
        fish.setWeight(1.5);
        fish.setColor("white");
        System.out.println("----------Fish----------");
        System.out.println("nameOfFish: "+fish.getName()+"\nAgeOfFish: "+fish.getAge()+"\nWeightOfFish: "+fish.getWeight()+"\nColorOfFish: "+fish.getColor());
        Parrot parrot = new Parrot();
        parrot.setName("cockatiel");
        parrot.setAge(3);
        parrot.setWeight(1.1);
        parrot.setColor("whitе");
        System.out.println("\n----------Parrot----------");
        System.out.println("nameOfParrot: "+parrot.getName()+"\nAgeOfParrot: "+parrot.getAge()+"\nWeightOfParrot: "+parrot.getWeight()+"\nColorOfParrot: "+parrot.getColor());
        Cat cat = new Cat();
        cat.setName("Cat");
        cat.setAge(5);
        cat.setWeight(3.2);
        cat.setColor("whitе-black");
        System.out.println("\n----------Cat----------");
        System.out.println("nameOfCat: "+cat.getName()+"\nAgeOfCat: "+cat.getAge()+"\nWeightOfCat: "+cat.getWeight()+"\nColorOfCat: "+cat.getColor());
        Dog dog = new Dog();
        dog.setName("doberman");
        dog.setAge(2);
        dog.setWeight(10.5);
        dog.setColor("black");
        System.out.println("\n----------Dog----------");
        System.out.println("nameOfDog: "+dog.getName()+"\nAgeOfDog: "+dog.getAge()+"\nWeightOfDog: "+dog.getWeight()+"\nColorOfDog: "+dog.getColor());
    }
}