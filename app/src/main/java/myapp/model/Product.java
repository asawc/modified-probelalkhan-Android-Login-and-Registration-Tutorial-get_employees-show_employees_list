package myapp.model;

import com.google.gson.annotations.SerializedName;

public class Product {
    private final int id;
    private final String productsymbol;
    private final String productname;
   // @SerializedName("quantity")
    private final String quantity;

    /*public Product(String quantity, String name, String symbol) {
        this.id = -1;
        this.quantity = quantity;
        this.name = name;
        this.symbol = symbol;
    }*/

    public Product(int id, String symbol, String name, String quantity) {
        this.id = id;
        this.productsymbol = symbol;
        this.productname = name;
        this.quantity = quantity;

    }

    public int getId() { return id; }

    public String getSymbol() { return productsymbol; }

    public String getName() { return productname; }

    public String getQuantity() { return quantity; }

}
