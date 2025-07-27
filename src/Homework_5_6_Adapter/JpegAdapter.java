package Homework_5_6_Adapter;

public class JpegAdapter implements ImageLoader{
    private JpegLoader jpegLoader;

    public JpegAdapter() {
        this.jpegLoader = new JpegLoader();
    }

    @Override
    public void loadImage(String filename) {
        jpegLoader.loadJpeg(filename);
    }
}
