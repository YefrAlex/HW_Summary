package JavaSummary._2023_09_15.jsonParser;

public class Product {
    private String category;
    private String name;
    private String factory;
    private int quantity;
    private boolean isPacked;
    private boolean isAdvertising;
    private double price;
    private double margin;
    private boolean isDebt;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category=category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory=factory;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity=quantity;
    }

    public boolean isPacked() {
        return isPacked;
    }

    public void setPacked(boolean packed) {
        isPacked=packed;
    }

    public boolean isAdvertising() {
        return isAdvertising;
    }

    public void setAdvertising(boolean advertising) {
        isAdvertising=advertising;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price=price;
    }

    public double getMargin() {
        return margin;
    }

    public void setMargin(double margin) {
        this.margin=margin;
    }

    public boolean isDebt() {
        return isDebt;
    }

    public void setDebt(boolean debt) {
        isDebt=debt;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", factory='" + factory + '\'' +
                ", quantity=" + quantity +
                ", isPacked=" + isPacked +
                ", isAdvertising=" + isAdvertising +
                ", price=" + price +
                ", margin=" + margin +
                ", isDebt=" + isDebt +
                '}';
    }
}
//{"CATEGORY": "FOOD#1","NAME": "Pasta#1","FACTORY": "Barilla#1","QUANTITY": 150,"ISPACKED": true,"ISADV": false,"PRICE": 1.49,"MARGIN": 15.0,"ISDEBT": false},