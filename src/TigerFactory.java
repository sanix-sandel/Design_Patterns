public class TigerFactory extends AnimalFactory{
    @Override
    protected Animal createAnimal(String color) {
        return new Tiger(color);
    }
}
