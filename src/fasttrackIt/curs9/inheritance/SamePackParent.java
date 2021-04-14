package fasttrackIt.curs9.inheritance;

public class SamePackParent extends Parent{
    public SamePackParent() {
        super("parent");
    }
    public void childMethod(){
        System.out.println("Ca am mostenit");
        System.out.println(publicString);
        System.out.println(protectedInt);
        System.out.println(defaultInt);
//        System.out.println(privateString);
        publicdMethod();
        defaultMethod();
//        privateMethod();
    }
}
