package fasttrackIt.curs9.curs91.other.inheritance;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent("parent-instance");
        Parent parentChild = new SamePackageChild();
        SamePackageChild samePackageChild = new SamePackageChild();
        Parent otherParentChild = new OtherPackageChild("pc1");
        OtherPackageChild otherPackageChild = new OtherPackageChild("pc2");

        parent.publicMethod();
        parent.protectedMethod();
//        parent.defaultMethod();
//        parent.privateMethod();


        parentChild.publicMethod();
        parentChild.protectedMethod();
//        parentChild.defaultMethod();
//        parentChild.privateMethod();
//        parentChild.childMethod();

        samePackageChild.publicMethod();
        samePackageChild.protectedMethod();
//        samePackageChild.defaultMethod();
//        samePackageChild.privateMethod();

        samePackageChild.childMethod();

        otherParentChild.publicMethod();
        otherParentChild.protectedMethod();
//        otherParentChild.defaultMethod();
//        otherParentChild.privateMethod();
//        otherParentChild.otherChildMethod();

        otherPackageChild.publicMethod();
        otherPackageChild.protectedMethod();
//        otherPackageChild.defaultMethod();
//        otherPackageChild.privateMethod();
        otherPackageChild.otherChildMethod();
    }

}
