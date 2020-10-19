package Ex21;

public class TextDocument implements IDocument {


    @Override
    public void mainWindow() {
        System.out.println("Main Window " + this.getClass());
    }

    @Override
    public void toolBar() {
        System.out.println("Tool Bar" + this.getClass());
    }

    public void createText(){
        System.out.println("Text "+ this.getClass());
    }
}
