package creational.builder;
public class Bouquet {
    private final Boolean flowers;
    private final Boolean ribbon;
    private final Boolean paper;
    private final Boolean decor;
    private final Boolean sponge;
    private final Boolean basket;

    public Bouquet(BouquetBuilder bouquetBuilder) {
        this.flowers = bouquetBuilder.flowers;
        this.ribbon = bouquetBuilder.ribbon;
        this.paper = bouquetBuilder.paper;
        this.decor = bouquetBuilder.decor;
        this.sponge = bouquetBuilder.sponge;
        this.basket = bouquetBuilder.basket;
    }

    @Override
    public String toString() {
        return "Bouquet {" +
                "flowers = " + flowers +
                ", ribbon = " + ribbon +
                ", paper = " + paper +
                ", decor = " + decor +
                ", sponge = " + sponge +
                ", basket = " + basket +
                '}';
    }

    public static class BouquetBuilder {
        private Boolean flowers;
        private Boolean ribbon;
        private Boolean paper;
        private Boolean decor;
        private Boolean sponge;
        private Boolean basket;
        public BouquetBuilder(){}

        public BouquetBuilder setFlowers(Boolean flowers) {
            this.flowers = flowers;
            return this;
        }
        public BouquetBuilder setRibbon(Boolean ribbon) {
            this.ribbon = ribbon;
            return this;
        }
        public BouquetBuilder setPaper(Boolean paper) {
            this.paper = paper;
            return this;
        }
        public BouquetBuilder setDecor(Boolean decor) {
            this.decor = decor;
            return this;
        }
        public BouquetBuilder setSponge(Boolean sponge) {
            this.sponge = sponge;
            return this;
        }
        public BouquetBuilder setBasket(Boolean basket) {
            this.basket = basket;
            return this;
        }
        public Bouquet build() {
            return new Bouquet(this);
        }
    }
}

