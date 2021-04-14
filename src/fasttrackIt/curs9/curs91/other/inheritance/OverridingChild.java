package fasttrackIt.curs9.curs91.other.inheritance;

public class OverridingChild extends Parent {
    public OverridingChild() {
        super("overriding");
    }

    @Override
    public void publicMethod() {
        System.out.println("My new implementation from child");
    }

    @Override

    protected void protectedMethod() {
        System.out.printf("Child Implementention");
        super.protectedMethod();
    }
//    public void finalMethod() {
//
//    }
}
