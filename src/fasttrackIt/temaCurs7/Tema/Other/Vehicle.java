package fasttrackIt.temaCurs7.Tema.Other;

public class Vehicle {
    private String name = "";
    private String color = "";
    private String model = "";
    private String company = "";
    private String engine = "800";
    public static int count = 0;

    public Vehicle(){
        count++;
    }

    public Vehicle(String name, String color, String model, String company, String engine){
        this.name = name;
        this.color = color;
        this.model = model;
        this.company = company;
        this.engine = engine;
        count++;
    }
    private String getEngine(){
        return engine;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getCompany() {
        return company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(){
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSpeed(){
        String a = getEngine();
        if (a == "800"){
            return 90;
        } else {
            return 120;
        }
    }
    public static String getVehicle(){
        return "you have set the Name and Color of that vehicle";

    }
}
