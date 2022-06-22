import java.util.Arrays;

public class Demo {
    public static void main(String args[]) {
        CanBeUsedToMakeTea chamomile = new Chamomile();
        System.out.println(String.format("Parts used for tea: %s",
                chamomile.getPartUsedInTea()));
        System.out.println(String.format("Effect when used in tea: %s",
                chamomile.getEffect()));

        CanBeUsedToMakeTea mint = new Mint();
        CanBeUsedToMakeTea dandelion = new Dandelion();

        CanBeUsedToMakeTea[] plantsForBasket = {mint, dandelion, chamomile};
        CanBeUsedToMakeTea plantBasket = new PlantBasket(Arrays.asList(plantsForBasket));
        System.out.println(String.format("Basket plants' parts used in tea: %s",
                plantBasket.getPartUsedInTea()));
        System.out.println(String.format("Basket plants' overall effect: %s",
                plantBasket.getEffect()));

    }
}
