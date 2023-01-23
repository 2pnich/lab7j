import pac1.drink;

import java.util.Scanner;
import static java.lang.Math.abs;

public class Basket  implements Cloneable{
    public static int counter_one = 0; //одномерный массив
    public Inout inout;
    static float sum;
    private shaurma shaurma = new shaurma();
    private pizza pizza = new pizza();
    private drink drink = new drink();
    private soup soup = new soup();
    private fries fries = new fries();


    public void input() {
          shaurma.input();
//        pizza.input();
//        drink.input();
//        soup.input();
//          fries.input();
    }

    public void output() {
        System.out.printf("%s", shaurma.toString());
//        System.out.printf("%s", pizza.toString());
//        drink.output();
//        System.out.printf("%s", soup.toString());
//        System.out.printf("%s", fries.toString());
    }

    public float sum(){
        sum = shaurma.getPrice() + pizza.getPrice() + drink.drink_price + soup.getPrice() + fries.getPrice();
        System.out.println("сумма: " + sum);
        return sum;
    }

    public static void payment(){
        float money, change;
        System.out.println("Введите полученную от покупателя сумму");
        Scanner in = new Scanner(System.in);
        money = in.nextFloat();
        change = money - sum;
        if (change > 0)
            System.out.println("сдача " + change);
        if (change < 0)
            System.out.println("сдача " + abs(change));
        if (change == 0)
            System.out.println("Без сдачи");
    }

    @Override
    public Basket clone() {
        try {
            Basket clone = (Basket) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
