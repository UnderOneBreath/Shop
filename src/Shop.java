import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shop {
    private String name;
    ArrayList<Product> products = new ArrayList<Product>();

    public void getInfo(){
        System.out.println(getName() + ": ");
        for (int i = 0; i < products.size(); i++) {
            products.get(i).getInfo();
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
