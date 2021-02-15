package myapp.modelView;

public class ProductView {
    private String productsymbol;
    private String productname;
    private String quantity;

    public ProductView(String sym, String name , String quantity) {
        this.productsymbol = sym;
        this.productname = name;
        this.quantity = quantity;
    }

    public String getSymbol() { return productsymbol; }

    public void setSymbol(String productsymbol) { this.productsymbol = productsymbol; }

    public String getName() {
        return productname;
    }

    public void setName(String productname) { this.productname = productname; }

    public String getQuantity() { return quantity; }

    public void setQuantity(String quantity) { this.quantity = quantity; }


}
