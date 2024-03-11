import creational.builder.Bouquet;
import creational.factory.FLowerTypeFactory;
import creational.factory.Flower;
import creational.factory.FlowerType;
import creational.factory.abst.FlowerShopFactory;
import creational.factory.abst.FlowerTypeFactoryType;
import creational.factory.method.FlowerFactory;
import creational.prototype.Bloom;
import creational.singleton.FlowerShop;
import structural.adapter.AudioFile;
import structural.adapter.AudioToTextAdapter;
import structural.bridge.Empress;
import structural.bridge.Phoenix;
import structural.bridge.Reyna;
import structural.bridge.RunItBack;
import structural.composite.FlowerComposite;
import structural.composite.LeafFlower;
import structural.decorator.*;
import structural.facade.DeliveryOrder;
import structural.facade.MakeBouquet;
import structural.facade.ShopAssistent;
import structural.facade.TakeOrder;
import structural.flyweight.Flyweight;
import structural.flyweight.FlyweightFactory;
import structural.proxy.OnlineOrder;
import structural.proxy.ShopOrderProxy;

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
        FLowerTypeFactory flowerFactory1 = flowerShopFactory.growFlowerFactory(FlowerTypeFactoryType.FLOWER);
        FLowerTypeFactory plantFactory = flowerShopFactory.growFlowerFactory(FlowerTypeFactoryType.PLANT);
        Flower tulip1 = flowerFactory1.growFlower(FlowerType.TULIP);
        Flower rose1 = flowerFactory1.growFlower(FlowerType.ROSE);
        Flower dahlia1 = flowerFactory1.growFlower(FlowerType.DAHLIA);
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
        System.out.println();
        System.out.println(" >> Builder start");
        Bouquet bouquet = new Bouquet.BouquetBuilder()
                .setFlowers(true)
                .setRibbon(true)
                .setPaper(true)
                .setDecor(false)
                .setSponge(false)
                .setBasket(false)
                .build();
        System.out.println(bouquet.toString());
        System.out.println(" >> Builder end");
        System.out.println();
        System.out.println(" >> Prototype start");
        Bloom flowerD = new Bloom("white", "daisy");
        Bloom flowerDClone = (Bloom) flowerD.doClone();
        if (flowerD != flowerDClone) {
            System.out.println("That's a different flowers as obj:/");
        }
        if (flowerD.equals(flowerDClone)){
            System.out.println("The same flower type! Success!");
        }
        System.out.println(" >> Prototype end");
        System.out.println();
        System.out.println(" >> Adapter start");
        AudioFile mp3File = new AudioFile("MP3 audio data");
        AudioToTextAdapter adapter = new AudioToTextAdapter(mp3File);
        String textData = adapter.getData();
        System.out.println("Text data: " + textData);
        System.out.println(" >> Adapter end");
        System.out.println();
        System.out.println(" >> Composite start");
        LeafFlower daisy = new LeafFlower("Daisy");
        LeafFlower lily = new LeafFlower("Lily");
        FlowerComposite composite = new FlowerComposite("Bouquet");
        composite.addComponent(daisy);
        composite.addComponent(lily);
        daisy.display();
        lily.display();
        composite.display();
        System.out.println(" >> Composite end");
        System.out.println();
        System.out.println(" >> Proxy start");
//        ShopOrderProxy shopOrderProxy = new ShopOrderProxy();
//        OnlineOrder onlineOrder = new OnlineOrder();
//        onlineOrder.makeOrder();
//        shopOrderProxy.makeOrder();
        System.out.println(" >> Proxy end");
        System.out.println();
        System.out.println(" >> Flyweight start");
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();
        for (int i = 0; i < 2; i++) {
            Flyweight rose2 = flyweightFactory.getFlower("rose", "red", 10);
            rose2.display();
            Flyweight tulip2 = flyweightFactory.getFlower("tulip", "yellow", 8);
            tulip2.display();
        }
        System.out.println(" >> Flyweight end");
        System.out.println();
        System.out.println(" >> Facade start");
        var takeOrder = new TakeOrder();
        var makeBouquet = new MakeBouquet();
        var deliveryOrder = new DeliveryOrder();
        var shopAssistent = new ShopAssistent(takeOrder, makeBouquet, deliveryOrder);
        System.out.println(shopAssistent.workDay());
        System.out.println(" >> Facade end");
        System.out.println();
        System.out.println(" >> Bridge start");
        System.out.println("Reyna used the ultimate!");
        var ultimateReyna = new Reyna(new Empress());
        ultimateReyna.heal();
        ultimateReyna.flash();
        System.out.println("Phoenix used the ultimate!");
        var ultimatePhoenix = new Phoenix(new RunItBack());
        ultimatePhoenix.heal();
        ultimatePhoenix.flash();
        System.out.println(" >> Bridge end");
        System.out.println();
        System.out.println(" >> Decorator start");
        Agent agent = new Viper();
        agent = new CloudDecorator(agent);
        agent = new ScreenDecorator(agent);
        agent = new UltiDecorator(agent);
        agent.describe();
        System.out.println(" >> Decorator end");
    }
}