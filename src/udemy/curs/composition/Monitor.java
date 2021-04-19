package udemy.curs.composition;

public class Monitor {
    private String model;
    private String manufacture;
    private int size;
    private Resolution nativeRes;

    public Monitor(String model, String manufacture, int size, Resolution nativeRes) {
        this.model = model;
        this.manufacture = manufacture;
        this.size = size;
        this.nativeRes = nativeRes;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + ", " + y + " in colour " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeRes() {
        return nativeRes;
    }
}
