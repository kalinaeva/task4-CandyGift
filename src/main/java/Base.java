import Gifts.Candy;
import Gifts.XmasGift;

public class Base {

    public static void main(String[] args) {
        Candy Jelly = new Candy("Jelly", 50.0, 5.0, 300.0);
        Candy Kinder = new Candy("Kinder", 30.0, 3.99, 350.0);
        Candy Barnie = new Candy("Barnie", 60.0, 1.99, 390.0);

//        System.out.println(jelly.getWeight());
        Candy CandyArray[];
        CandyArray = new Candy[3];
        CandyArray[0] = Jelly;
        CandyArray[1] = Kinder;
        CandyArray[2] = Barnie;

         XmasGift Godno = new XmasGift(CandyArray);
         Godno.printCandiesNames();

        System.out.println(Godno.getWeight());
        System.out.println(Godno.getPrice());

    }

}
