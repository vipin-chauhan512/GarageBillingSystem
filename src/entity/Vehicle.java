package entity;

public class Vehicle {

    private int id;

    private int customerId;

    private String numberplate;

    private String model;

    public Vehicle(int id, int customerId, String numberplate, String model) {
        this.id = id;
        this.customerId = customerId;
        this.numberplate = numberplate;
        this.model = model;

    }

    public Vehicle() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerid(int customerid) {
        this.customerId = customerid;
    }

    public String getNumberplate() {
        return numberplate;
    }

    public void setNumberplate(String numberplate) {
        this.numberplate = numberplate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle [" +
                "id=" + id +
                ", customerId=" + customerId +
                ", numberplate='" + numberplate + '\'' +
                ", model='" + model + '\'' +
                ']';
    }
}
