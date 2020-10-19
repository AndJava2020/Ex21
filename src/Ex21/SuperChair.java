package Ex21;

public class SuperChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Sitting on "+ this.getClass());
    }
}
