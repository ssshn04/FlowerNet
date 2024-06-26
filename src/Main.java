import behavioral.chainOfResponsibility.*;
import behavioral.command.*;
import behavioral.iterator.FlowerCollectionIterator;
import behavioral.iterator.FlowerIterator;
import behavioral.iterator.Product;
import behavioral.mediator.FlowerMediator;
import behavioral.mediator.Shop;
import behavioral.memento.Catalog;
import behavioral.memento.CatalogCareTaker;
import behavioral.observe.GameEventSubject;
import behavioral.observe.Player;
import behavioral.state.DeadState;
import behavioral.state.NormalState;
import behavioral.state.PlayerContext;
import behavioral.state.UltState;
import behavioral.stategy.CashPaymentStrategy;
import behavioral.stategy.CreditCardPaymentStrategy;
import behavioral.stategy.FlowerPaymentContext;
import behavioral.stategy.PaymentStrategy;
import behavioral.template.InStoreOrder;
import behavioral.template.OnlineOrder;
import behavioral.template.OrderTemplate;
import behavioral.visitor.*;
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
import structural.composite.DocumentComponent;
import structural.composite.Folder;
import structural.composite.Receipt;
import structural.composite.SalesReport;
import structural.decorator.*;
import structural.facade.DeliveryOrder;
import structural.facade.MakeBouquet;
import structural.facade.ShopAssistent;
import structural.facade.TakeOrder;
import structural.flyweight.Flyweight;
import structural.flyweight.FlyweightFactory;
import structural.proxy.LocalWarehouseProxy;
import structural.proxy.Warehouse;

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

        // ------------------------------- structural ----------------------------------
        System.out.println(" >> Adapter start");
        AudioFile mp3File = new AudioFile("MP3 audio data");
        AudioToTextAdapter adapter = new AudioToTextAdapter(mp3File);
        String textData = adapter.getData();
        System.out.println("Text data: " + textData);
        System.out.println(" >> Adapter end");

        System.out.println();
        System.out.println(" >> Composite start");
        DocumentComponent salesReport1 = new SalesReport("2024-02-10");
        DocumentComponent salesReport2 = new SalesReport("2024-02-11");
        DocumentComponent receipt1 = new Receipt(1001, 50.25);
        DocumentComponent receipt2 = new Receipt(1002, 35.75);

        Folder rootFolder = new Folder();
        rootFolder.addComponent(salesReport1);
        rootFolder.addComponent(salesReport2);

        Folder salesFolder = new Folder();
        salesFolder.addComponent(receipt1);
        salesFolder.addComponent(receipt2);

        rootFolder.addComponent(salesFolder);

        rootFolder.display();
        System.out.println(" >> Composite end");
        System.out.println();

        System.out.println(" >> Proxy start");
        Warehouse owner = new LocalWarehouseProxy(true);
        owner.fullNow();

        Warehouse employee = new LocalWarehouseProxy(false);
        employee.fullNow();

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
        System.out.println();

        // ------------------------------- behavioral ----------------------------------
        System.out.println(" >> Template start");

        OrderTemplate online = new OnlineOrder();
        online.processOrder();

        System.out.println();

        OrderTemplate inStore = new InStoreOrder();
        inStore.processOrder();

        System.out.println(" >> Template end");
        System.out.println();

        System.out.println(" >> Mediator start");
        FlowerMediator mediator = new Shop();

        mediator.addStock("Rose", 20);
        mediator.addStock("Tulip", 15);

        System.out.println();

        mediator.placeOrder("Rose", 10);
        mediator.placeOrder("Tulip", 20);

        System.out.println(" >> Mediator end");
        System.out.println();

        System.out.println(" >> Chain of Responsibility start");

        BombDeactivationHandler viper = new ViperAgent();
        BombDeactivationHandler phoenix = new PhoenixAgent();
        BombDeactivationHandler killjoy = new KilljoyAgent();

        viper.setNextHandler(phoenix);
        phoenix.setNextHandler(killjoy);

        viper.deactivateBomb(BombLevel.LEVEL_1);
        viper.deactivateBomb(BombLevel.LEVEL_2);
        viper.deactivateBomb(BombLevel.LEVEL_3);

        System.out.println(" >> Chain of Responsibility end");
        System.out.println();

        System.out.println(" >> Observer  start");

        GameEventSubject gameEventSubject = new GameEventSubject();

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        gameEventSubject.registerObserver(player1);
        gameEventSubject.registerObserver(player2);

        gameEventSubject.notifyObservers("Player 1 took damage");
        gameEventSubject.notifyObservers("Player 2 eliminated an enemy");

        System.out.println(" >> Observer  end");
        System.out.println();

        System.out.println(" >> Strategy  start");

        PaymentStrategy cashPaymentStrategy = new CashPaymentStrategy();
        PaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();

        FlowerPaymentContext paymentContext = new FlowerPaymentContext(cashPaymentStrategy);

        paymentContext.payForBouquet(100.0);

        paymentContext.setPaymentStrategy(creditCardPaymentStrategy);

        paymentContext.payForBouquet(150.0);

        System.out.println(" >> Strategy  end");
        System.out.println();

        System.out.println(" >> Command  start");

        FlowerOrder flowerOrder = new FlowerOrder();

        Command placeOrderCommand = new PlaceOrderCommand(flowerOrder);
        Command cancelOrderCommand = new CancelOrderCommand(flowerOrder);

        CommandInvoker invoker = new CommandInvoker();

        invoker.setCommand(placeOrderCommand);
        invoker.executeCommand();

        invoker.setCommand(cancelOrderCommand);
        invoker.executeCommand();

        System.out.println(" >> Command  end");
        System.out.println();

        System.out.println(" >> State  start");

        PlayerContext playerContext = new PlayerContext();

        playerContext.setState(new NormalState());

        playerContext.handle();

        playerContext.setState(new UltState());

        playerContext.handle();

        playerContext.setState(new DeadState());

        playerContext.handle();

        System.out.println(" >> State  end");
        System.out.println();

        System.out.println(" >> Visitor start");

        GameAgent jett = new JettAgent();
        GameAgent gekko = new GekkoAgent();

        Visitor jettVisitor = new JettVisitor();
        Visitor gekkoVisitor = new GekkoVisitor();

        jett.accept(jettVisitor);
        jett.accept(gekkoVisitor);
        gekko.accept(jettVisitor);
        gekko.accept(gekkoVisitor);

        System.out.println(" >> Visitor end");
        System.out.println();

        System.out.println(" >> Iterator end");

        List<Product> products = new ArrayList<>();
        products.add(new Product("Violets"));
        products.add(new Product("Lilies"));
        products.add(new Product("Sunflower"));

        FlowerIterator iterator = new FlowerCollectionIterator(products);
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println("Product: " + product.getName());
        }

        System.out.println(" >> Iterator end");
        System.out.println();

        System.out.println(" >> Memento start");
        Catalog catalog = new Catalog();

        catalog.addFlower("Hydrangea");
        catalog.addFlower("Peonies");
        catalog.addFlower("Lotus");
        catalog.printCatalog();

        CatalogCareTaker caretaker = new CatalogCareTaker();
        caretaker.setMemento(catalog.saveStateToMemento());

        catalog.removeFlower("Hydrangea");
        catalog.printCatalog();

        catalog.getStateFromMemento(caretaker.getMemento());
        catalog.printCatalog();
        System.out.println(" >> Memento end");
    }
}