package myapp.model;

import com.google.gson.annotations.SerializedName;

public class Product {

    private final int id;
    //private final int quantity;

    @SerializedName("productname")
    private final String name;

    @SerializedName("productsymbol")
    private final String symbol;

   // @SerializedName("quantity")
    private final String quantity;

    /*public Product(int quantity, String name, String symbol) {
        this.id = -1;
        this.quantity = quantity;
        this.name = name;
        this.symbol = symbol;
    }*/

    public Product(int id, String symbol, String name, String quantity) {
        this.id = id;
        this.symbol = symbol;
        this.name = name;
        this.quantity = quantity;

    }

    public int getId() { return id; }

    public String getSymbol() { return symbol; }

    public String getName() { return name; }

    public String getQuantity() { return quantity; }

}
