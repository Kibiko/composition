package products;

public interface IProduct {

    float getPrice();
    long getInventory();
    void setPrice(float Price);
    void setInventory(long amount);
    String getTitle();
    void setTitle(String title);
    void addInventory(long amount);
    void removeInventory(long amount);


}
