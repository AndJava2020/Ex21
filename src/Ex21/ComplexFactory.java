package Ex21;

public class ComplexFactory implements  AbsComplexFactory{

    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex createComplex(int r, int im) {
        return new Complex(r,im);
    }
}
