package udemy.curs.composition;

public class Case {
    private String model;
    private String anufacturer;
    private String powerSuply;
    private Dimension dimension;

    public Case(String model, String anufacturer, String powerSuply, Dimension dimension) {
        this.model = model;
        this.anufacturer = anufacturer;
        this.powerSuply = powerSuply;
        this.dimension = dimension;
    }
    public void pressPowerB(){
        System.out.println("power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getAnufacturer() {
        return anufacturer;
    }

    public String getPowerSuply() {
        return powerSuply;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
