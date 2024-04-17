package behavioral.iterator;

import java.util.List;

public class FlowerCollectionIterator implements FlowerIterator {
    private List<Product> flowers;
    private int position = 0;

    public FlowerCollectionIterator(List<Product> flowers) {
        this.flowers = flowers;
    }

    @Override
    public boolean hasNext() {
        return position < flowers.size();
    }

    @Override
    public Product next() {
        if (hasNext()) {
            Product flower = flowers.get(position);
            position++;
            return flower;
        }
        return null;
    }
}

