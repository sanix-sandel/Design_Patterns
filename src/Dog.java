public class Dog implements Animal{

    public Dog(String color){
        System.out.println("A dog with color: "+color+" is created");
    }

    @Override
    public void displayBehavior() {
        System.out.println("It prefers barking");
    }
}
