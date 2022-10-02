public class DogFactory extends AnimalFactory{
    @Override
    protected Animal createAnimal(String color) {
        return new Dog(color);
    }
}
