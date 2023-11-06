package Lab4;

class DogMain {
    public static void main (String[] args){
        Dog dog1 = new Dog("Bob", "Chihuahua");
        Dog dog2 = new Dog("Jon", "Doberman");

        System.out.println(dog1.getName() + " " + dog1.getBreed());
        System.out.println(dog2.getName() + " " + dog2.getBreed());
        System.out.println();

        dog1.setName("Marius");
        dog2.setBreed("Shiba");

        System.out.println(dog1.getName() + " " + dog1.getBreed());
        System.out.println(dog2.getName() + " " + dog2.getBreed());
    }
}
