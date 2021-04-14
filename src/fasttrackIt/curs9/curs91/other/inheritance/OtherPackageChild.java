package fasttrackIt.curs9.curs91.other.inheritance;

public class OtherPackageChild extends Parent {
    public OtherPackageChild(String name) {
        super(name);
    }

    public void otherChildMethod(){
        System.out.println("Ce am mostenit");
        System.out.println(publicString);
        System.out.println(protectedInt);
//        System.out.println(defaultInt);
//        System.out.println(privateString);

        publicMethod();
        protectedMethod();
//        defaultMethod();
//        privateMethod();
    }
}
