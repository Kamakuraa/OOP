package fasttrackIt.curs9.inheritance;

import fasttrackIt.curs9.other.OtherPackChild;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent("parent-instance");
        Parent parentChild = new SamePackParent();
        SamePackParent samePackParent = new SamePackParent();
        Parent otherParChild = new OtherPackChild("pc1");
        OtherPackChild otherPackChild = new OtherPackChild("pc2");

        parent.privateMethod();
        parent.protectedMethod();
        parent.defaultMethod();
        parent.publicdMethod();

        parentChild.publicdMethod();
        parentChild.protectedMethod();
        parentChild.defaultMethod();

        parentChild.privateMethod();
//        parentChild.childMethod();

        samePackParent.protectedMethod();
        samePackParent.publicdMethod();
        samePackParent.defaultMethod();
//        samePackParent.protectedMethod();
        samePackParent.childMethod();

        otherParChild.publicdMethod();
        otherParChild.publicdMethod();
//        otherPackChild.defaultMethod();
//        otherPackChild.privateMethod();
//        otherPackChild.otherChildMeth();

        otherPackChild.publicdMethod();
        otherPackChild.protectedMethod();
        otherPackChild.otherChildMeth();


    }
}
