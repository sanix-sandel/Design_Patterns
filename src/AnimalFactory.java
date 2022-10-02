public abstract class AnimalFactory {

    public void createAndDisplayBehavior(String color){
        Animal animal;
        animal=createAnimal(color);
        animal.displayBehavior();

    }

    protected abstract Animal createAnimal(String color);

}
