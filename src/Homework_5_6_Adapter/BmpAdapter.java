package Homework_5_6_Adapter;

public class BmpAdapter implements ImageLoader{
    private BmpLoader bmpLoader;

    public BmpAdapter() {
        this.bmpLoader = new BmpLoader();
    }

    @Override
    public void loadImage(String filename) {
        bmpLoader.loadBmp(filename);
    }
}
