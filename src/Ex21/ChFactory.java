package Ex21;

public class ChFactory implements AbsChFactory {

    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair();
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public SuperChair createSuperChair() {
        return new SuperChair();
    }
}
