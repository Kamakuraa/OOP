package FastTrackIt.Curs8.Interface;

public class Cat implements Animal {


    @Override
    public void travel(int distance) {
        System.out.println("Walking like a cat" + distance + "meters");
    }

    @Override
    public void eat(String food) {
        if (food.equals("cat food")) {
            System.out.println("Cat eating " + food);
        } else {
            System.out.println("not eating " + food);
        }

    }
    @Override
    public String getType() {
        return "Omnivorous";
    }
}
