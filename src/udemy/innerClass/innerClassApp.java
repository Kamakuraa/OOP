package udemy.innerClass;

import fasttrackIt.curs10.homeWork.Person;
import udemy.TheEnum.PizzaSize;


public class innerClassApp {

    private static boolean isPizzaReady(int waitedInMinute){
        class Oven{
            public boolean isPizzaBakedProperly(){
                if (waitedInMinute>30){
                    return true;
                }
                return false;
            }
        }
        Oven oven = new Oven();

        return oven.isPizzaBakedProperly();


    }
    public static void main(String[] args) {
        Pizza firstPizza = new Pizza("Margeritt", PizzaSize.MEDIUM);
        System.out.println("Name " + firstPizza.getName());
        Pizza secondPizza = new Pizza("Margherita", PizzaSize.MEDIUM){
            @Override
            public String getName() {
                return super.getName();
            }
        };
        System.out.println("Name: " + secondPizza.getName());
        if (isPizzaReady(40)){
            System.out.println("pizza is ready");
        } else {
            System.out.println(" pizza is not ready yet");
        }

        Pizza thirdPizza = new Pizza("Pizza cake", PizzaSize.LARGE);
        Pizza.PizzaSlice pizzaSlice = thirdPizza.cutPizzaSlice();
        System.out.println(pizzaSlice.calculatePizzaSliceArea());

    }


}
