package Ex21;

public class MusicDocument implements IDocument {

    @Override
    public void mainWindow() {
        System.out.println("Main Window " + this.getClass());
    }

    @Override
    public void toolBar() {
        System.out.println("Tool Bar " + this.getClass());
    }
    public void listenToMusic(){
        System.out.println("Music " + this.getClass());
    }
}
