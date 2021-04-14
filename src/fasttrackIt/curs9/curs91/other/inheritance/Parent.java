package fasttrackIt.curs9.curs91.other.inheritance;

public class Parent {

    // constanta
    public static final String CONST = "test";

    public String publicString;
    protected int protectedInt;
    int defaultInt;
    private String privateString;

    public Parent(String name) {
        this.publicString = name;
    }
    public void publicMethod() {
        System.out.println("Parent public method " + privateString);
    }

    protected void protectedMethod() {
        System.out.println("Parent public mrthod");
    }

    void defaultMethod() {
        System.out.println("Parent default method");
    }

    private void privateMethod() {
        System.out.println("Parent private method");
    }

}
