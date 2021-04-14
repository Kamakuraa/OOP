package fasttrackIt.curs9.inheritance;

public class Parent {
    // constante in java
    public static final String CONST = "test";
    public String publicString;
    protected int protectedInt;
    int defaultInt;
    private String privateString;

    public Parent(String name) {
        this.publicString = name;
    }
        public void publicdMethod () {
            System.out.println("Parent protected method");
        }
        protected void protectedMethod () {
            System.out.println();
        }
        void defaultMethod () {
            System.out.println("Parent priv meth");
        }
        void privateMethod () {
            System.out.println("Parent priv meth");
        }
    }

