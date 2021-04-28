package fasttrackIt.temaCurs10.newExercise3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company = new Company(
                "FastTrackit",
                List.of(
                        new Person("Florin", 40, "manager"),
                        new Person("Alex", 22, "hr"),
                        new Person("Zulu", 55, "trainer")
                )
        );
        System.out.println(company.getManager());
        System.out.println(company.getPersonOlder(30));
    }
}
