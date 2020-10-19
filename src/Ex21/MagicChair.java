package Ex21;

public class MagicChair implements Chair{
    @Override
    public void sit() {
        System.out.println("Sitting on "+ this.getClass());
    }

}
