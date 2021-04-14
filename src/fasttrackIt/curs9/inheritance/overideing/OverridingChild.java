package fasttrackIt.curs9.inheritance.overideing;

import fasttrackIt.curs9.inheritance.Parent;

public class OverridingChild extends Parent {

    public OverridingChild() {
        super("overriding");
    }

    public void publicMetod() {
        System.out.println("overriding");
    }

    @Override
    protected void protectedMethod() {
        System.out.println("Child implemntation");
        super.protectedMethod();
    }
    public final void finalMethod(){
        System.out.println("final method");
    }
}
