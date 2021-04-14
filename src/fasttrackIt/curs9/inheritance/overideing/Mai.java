package fasttrackIt.curs9.inheritance.overideing;

import fasttrackIt.curs9.inheritance.Parent;

public class Mai {
    public static void main(String[] args) {
        Parent parent = new OverridingChild();
        OverridingChild overridingChild = new OverridingChild();

        System.out.println("Parent parentCh");
        parent.publicdMethod();

        System.out.println();

        System.out.println("==== OveridingChild" );
        overridingChild.publicMetod();
        
    }
}
