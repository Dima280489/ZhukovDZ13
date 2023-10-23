package ProductManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {
    @Test
    public void removeExistingProduct() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "молоко", 64);
        Product product2 = new Product(2, "хлеб", 80);
        Product product3 = new Product(1, "яицо", 69);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.remove(2);
        Product[] expected = {product1, product3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeProductNotExist() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "молоко", 64);
        Product product2 = new Product(2, "хлеб", 80);
        Product product3 = new Product(1, "яицо", 69);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);
        repo.remove(5);
        Product[] expected = {product1, product2, product3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}