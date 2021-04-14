package fasttrackIt.temacurs7.Tema.Other;

public class Bike extends Vehicle{
    private boolean foiursStroke = true;

    public Bike(boolean foiursStroke) {
        this.foiursStroke = foiursStroke;
    }

    public Bike(String name, String color, String model, String company, String engine, boolean foiursStroke) {
        super(name, color, model, company, engine);
        this.foiursStroke = foiursStroke;
    }

    public boolean isFoiursStroke() {
        return foiursStroke;
    }

    public void setFoiursStroke(boolean foiursStroke) {
        this.foiursStroke = foiursStroke;
    }
}
