package fasttrackIt.curs9.other;

import fasttrackIt.curs9.inheritance.Parent;

public class OtherPackChild extends Parent {
    public OtherPackChild(String name) {
        super(name);
    }
    public void otherChildMeth(){
        System.out.println("Ce am mostenit");
        System.out.println(protectedInt);
        System.out.println(publicString);
//        System.out.println(defaultMethod);
//        System.out.println(privateString);

        publicdMethod();
        protectedMethod();
//        defaultMethod();
//        privateString();

    }
}
