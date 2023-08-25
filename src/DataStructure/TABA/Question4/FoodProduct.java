package DataStructure.TABA.Question4;

/**
 * FoodProduct
 *
 * @Author: Xiangnan Liu
 * @CreateTime: 2023-08-19
 */
public class FoodProduct implements Comparable<FoodProduct> {
    private String name;
    private int price;
    private int healthyEatingIndex;

    public FoodProduct() {
    }

    public FoodProduct(String name, int price, int healthyEatingIndex) {
        this.name = name;
        this.price = price;
        this.healthyEatingIndex = healthyEatingIndex;
    }

    @Override
    public int compareTo(FoodProduct foodProduct) {
        return Integer.compare(healthyEatingIndex, foodProduct.getHealthyEatingIndex());
    }

    @Override
    public String toString() {
        return "FoodProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", healthyEatingIndex=" + healthyEatingIndex +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHealthyEatingIndex() {
        return healthyEatingIndex;
    }

    public void setHealthyEatingIndex(int healthyEatingIndex) {
        this.healthyEatingIndex = healthyEatingIndex;
    }
}
