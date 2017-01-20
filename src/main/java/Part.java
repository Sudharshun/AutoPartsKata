import java.math.BigDecimal;

public class Part {

    private String manufacturer;
    private int partNumber;
    private String description;
    private boolean engineComponent;
    private boolean coolingComponent;
    private boolean taxExempt;
    private double price;
    private double subTotal;
    private BigDecimal cost;

    public String getManufacturer() {
        return this.manufacturer;
    }

    public int getPartNumber() {
        return this.partNumber;
    }

    public String getDescription() {
        return this.description;
    }

    public Part(String manufacturer, int partNumber, String description) {
        this.engineComponent = false;
        this.coolingComponent = false;
        this.taxExempt = false;
        this.manufacturer = manufacturer;
        this.partNumber = partNumber;
        this.description = description;
    }


    public String fullDescription() {
        return "manufacturer:" + this.manufacturer +
                ",partNumber:" + this.partNumber +
                ",description:" + this.description +
                ",EngineComponent:" + this.isEngineComponent() +
                ",CoolingComponent:" + this.isCoolingComponent();
    }

    public boolean isCoolingComponent() {
        return this.coolingComponent;
    }

    public boolean isEngineComponent() {
        return this.engineComponent;

    }

    public void setCoolingComponent() {
        this.coolingComponent = true;
    }

    public void setEngineComponent() {
        this.engineComponent = true;
    }

    public boolean isTaxExempt() {
        return this.taxExempt;
    }

    public void setIsTaxExempt(){
        this.taxExempt = true;
    }

    public double getPrice() {
        return this.price;
    }

    public double getSubTotal() {
        if(isTaxExempt()){
            cost= new BigDecimal(getPrice());
        } else{
            cost= new BigDecimal((getPrice() * 1.1));
        }

        this.subTotal=cost.doubleValue();
        return this.subTotal;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
