package fasttrackIt.curs9.curs91.other.inheritance;

public class SamePackageChild extends Parent {
    public SamePackageChild() {
        super("parent");
    }

    public void childMethod() {
        System.out.println("Ce am mostenit");
        System.out.println(publicString);
        System.out.println(protectedInt);
        System.out.println(defaultInt);
//     nu se poate folosi
//     System.out.println(privateString);


        //     nu se poate folosi

//     privateMethod();
        protectedMethod();
        defaultMethod();
        publicMethod();
    }
}
