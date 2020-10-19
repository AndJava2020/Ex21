package Ex21;


public class Main {

    public static void main(String[] args) {
        ComplexFactory fct1= new ComplexFactory();
        Complex a1=fct1.createComplex();
        Complex a2=fct1.createComplex(1,1);
        System.out.println("\n");

        ChFactory fct2 = new ChFactory();
        Client Burger= new Client();
        Burger.setChair(fct2.createSuperChair());
        Burger.sit();
        Burger.setChair(fct2.createMagicChair());
        Burger.sit();
        Burger.setChair(fct2.createVictorianChair());
        Burger.sit();
        System.out.println("\n");

        App app =new App();
        Documents fct3=new Documents();
        TextDocument g1= (TextDocument) fct3.createNew("text");
        g1.mainWindow();
        g1.toolBar();
        g1.createText();
        System.out.println();
        MusicDocument g2=(MusicDocument)fct3.createNew("music");
        g2.listenToMusic();
        g2.mainWindow();
        g2.toolBar();
        System.out.println();
        ImageDocument g3= (ImageDocument) fct3.createNew("image");
        g3.imageShow();
        g3.mainWindow();
        g3.toolBar();

    }
}
