import creational.factory.FLowerTypeFactory;
import creational.factory.Flower;
import creational.factory.FlowerType;
import creational.factory.abst.FlowerShopFactory;
import creational.factory.abst.FlowerTypeFactoryType;
import creational.factory.method.FlowerFactory;
import creational.singleton.FlowerShop;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println(" >> Singleton start");
        FlowerShop flowerShop = FlowerShop.getInstance();
        FlowerShop flowerShop2 = FlowerShop.getInstance();
        System.out.println(flowerShop.getName());
        System.out.println(flowerShop.getLocation());
        System.out.println(flowerShop2.getLocation());

        flowerShop2.setLocation("вул. Головна, 4Б");
        System.out.println(flowerShop.getLocation());
        System.out.println(flowerShop2.getLocation());
        System.out.println(flowerShop.equals(flowerShop2));
        System.out.println(" >> Singleton end");
        System.out.println();

        System.out.println(" >> Factory start");
        FlowerFactory flowerFactory = new FlowerFactory();
        Flower tulip = flowerFactory.growFlower(FlowerType.TULIP);
        Flower rose = flowerFactory.growFlower(FlowerType.ROSE);
        Flower dahlia = flowerFactory.growFlower(FlowerType.DAHLIA);
        List<Flower> flowers = new ArrayList<>();
        flowers.add(tulip);
        flowers.add(rose);
        flowers.add(dahlia);
        flowers.forEach(flower -> {
            flower.bloom();
            flower.dry();
        });
        System.out.println(" >> Factory end");
        System.out.println();

        System.out.println(" >> Abstract factory start");
        FlowerShopFactory flowerShopFactory = new FlowerShopFactory();
        FLowerTypeFactory fLowerFactory = flowerShopFactory.growFlowerFactory(FlowerTypeFactoryType.FLOWER);
        FLowerTypeFactory plantFactory = flowerShopFactory.growFlowerFactory(FlowerTypeFactoryType.PLANT);
        Flower tulip1 = flowerFactory.growFlower(FlowerType.TULIP);
        Flower rose1 = flowerFactory.growFlower(FlowerType.ROSE);
        Flower dahlia1 = flowerFactory.growFlower(FlowerType.DAHLIA);
        Flower aloe = plantFactory.growFlower(FlowerType.ALOE_PLANT);
        Flower calathea = plantFactory.growFlower(FlowerType.CALATHEA_PLANT);
        Flower monstera = plantFactory.growFlower(FlowerType.MONSTERA_PLANT);
        List<Flower> flowers1 = new ArrayList<>();
        flowers1.add(tulip1);
        flowers1.add(dahlia1);
        flowers1.add(rose1);
        flowers1.add(aloe);
        flowers1.add(calathea);
        flowers1.add(monstera);
        flowers1.forEach(flower -> {
            flower.bloom();
            flower.dry();
        });
        System.out.println(" >> Abstract factory end");
    }
}