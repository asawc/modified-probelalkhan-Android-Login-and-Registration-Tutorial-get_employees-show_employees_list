package myapp.modelView;

public class ProductView {
    private String symbol;
    private String name;
    private String quantity;

    public ProductView(String symbol, String name, String quantity) {
        this.symbol = symbol;
        this.name = name;
        this.quantity = quantity;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) { this.symbol = symbol; }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.symbol = name; }

    public String getQuantity() { return quantity; }

    public void setQuantity(String quantity) { this.quantity = quantity; }

}
