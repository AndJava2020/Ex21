package Ex21;

public class ImageDocument implements IDocument {

    @Override
    public void mainWindow() {
        System.out.println("Main Window " + this.getClass());
    }

    @Override
    public void toolBar() {
        System.out.println("Tool Bar " + this.getClass());
    }
    public void imageShow(){
        System.out.println("Image " + this.getClass());
    }
}
