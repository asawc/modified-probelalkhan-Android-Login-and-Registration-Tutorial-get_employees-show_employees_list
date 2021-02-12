package myapp.modelView;

public class EmployeeView {
    private String symbol;
    private String name;
    private String surname;

    public EmployeeView(String sname, String name, String sym) {
        this.surname = sname;
        this.name = name;
        this.symbol = sym;

    }

    public String getSurname() { return surname; }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
