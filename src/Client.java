public class Client {

    public static void main(String [] args){
        AnimalFactory factory;
        factory=new TigerFactory();
        factory.createAndDisplayBehavior("black");

        factory=new DogFactory();
        factory.createAndDisplayBehavior("yellow");
    }
}
